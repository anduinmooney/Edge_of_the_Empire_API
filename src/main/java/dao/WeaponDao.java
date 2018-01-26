package dao;

import models.Weapon;
import dao.Sql2oWeaponDao;

import java.util.List;

public interface WeaponDao {
    //create
    void add (Weapon weapon);

    //read
    List<Weapon> getAll();

    Weapon findById(int id);

    //update
    void update(int id, String name, String skill, String damage, String critical, String range, String encumberance, String hardPoint, String rarity, String price);

    //delete
    void deleteById(int id);
}
