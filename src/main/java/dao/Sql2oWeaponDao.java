package dao;

import models.Weapon;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;
public class Sql2oWeaponDao implements WeaponDao {

    private final Sql2o sql2o;

    public Sql2oWeaponDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Weapon weapon) {
        String sql = "INSERT INTO weapons (name, skill, damage, critical, range, encumberance, hardPoint, rarity, price) VALUES (:name, :skill, :damage, :critical, :range, :encumberance, :hardPoint, :rarity, :price)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql)
                    .bind(weapon)
                    .executeUpdate()
                    .getKey();
            weapon.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE from weapons WHERE id=:id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Weapon> getAll() {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM weapons")
                    .executeAndFetch(Weapon.class);
        }
    }

    @Override
    public void update(int id, String newName, String newSkill, String newDamage, String newCritical, String newRange, String newEncumberance, String newHardPoint, String newRarity, String newPrice){
        String sql = "UPDATE weapons SET (name, skill, damage, critical, range, encumberance, hardPoint, rarity, price) = (:name, :skill, :damage, :critical, :range, :encumberance, :hardPoint, :rarity, :price) WHERE id=:id";
        try(Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("name", newName)
                    .addParameter("skill", newSkill)
                    .addParameter("damage", newDamage)
                    .addParameter("critical", newCritical)
                    .addParameter("range", newRange)
                    .addParameter("encumberance", newEncumberance)
                    .addParameter("hardPoint", newHardPoint)
                    .addParameter("rarity", newRarity)
                    .addParameter("price", newPrice)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
            System.out.println("error message");
        }
    }

    @Override
    public Weapon findById(int id) {
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM weapons WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(Weapon.class);
        }
    }

}