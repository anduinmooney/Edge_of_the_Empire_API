package dao;

import models.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;
public class Sql2oAdversariesDao implements AdversariesDao {

    private final Sql2o sql2o;

    public Sql2oAdversariesDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Adversaries adversaries) {
        String sql = "INSERT INTO adversaries (adversaryName, level, index) VALUES (:adversaryName, :level, :index)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .bind(adversaries)
                    .executeUpdate()
                    .getKey();
            adversaries.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE from adversaries WHERE id=:id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Adversaries> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM adversaries")
                    .executeAndFetch(Adversaries.class);
        }
    }

    @Override
    public void update(int id, String newAdversaryName, String newLevel, String newIndex){
        String sql = "UPDATE adversaries SET (adversaryName, level, index) = (:adversaryName, :level, :index) WHERE id=:id";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("adversaryName", newAdversaryName)
                    .addParameter("level", newLevel)
                    .addParameter("index", newIndex)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
            System.out.println("error message");
        }
    }

    @Override
    public Adversaries findById(int id) {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM adversaries WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Adversaries.class);
        }
    }
}