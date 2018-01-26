package dao;

import models.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;
public class Sql2oArmorDao implements ArmorDao {

    private final Sql2o sql2o;

    public Sql2oArmorDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Armor armor) {
        String sql = "INSERT INTO armors (armorName, defense, soak, armorPrice, armorEncumberance, armorHardPoint, armorRarity) VALUES (:armorName, :defense, :soak, :armorPrice, :armorEncumberance, :armorHardPoint, :armorRarity)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .bind(armor)
                    .executeUpdate()
                    .getKey();
            armor.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE from armors WHERE id=:id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Armor> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM armors")
                    .executeAndFetch(Armor.class);
        }
    }

    @Override
    public void update(int id, String newArmorName, String newDefense, String newSoak, String newArmorPrice, String newArmorEncumberance, String newArmorHardPoint, String newArmorRarity){
        String sql = "UPDATE armors SET (armorName, defense, soak, armorPrice, armorEncumberance, armorHardPoint, armorRarity) = (:armorName, :defense, :soak, :armorPrice, :armorEncumberance, :armorHardPoint, :armorRarity) WHERE id=:id";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("armorName", newArmorName)
                    .addParameter("defense", newDefense)
                    .addParameter("soak", newSoak)
                    .addParameter("armorPrice", newArmorPrice)
                    .addParameter("armorEncumberance", newArmorEncumberance)
                    .addParameter("armorHardPoint", newArmorHardPoint)
                    .addParameter("armorRarity", newArmorRarity)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
            System.out.println("error message");
        }
    }

    @Override
    public Armor findById(int id) {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM armors WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Armor.class);
        }
    }



}