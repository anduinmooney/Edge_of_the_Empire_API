package dao;

import models.*;
import models.Weapon;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Sql2oWeaponDaoTest {
    private Connection conn;
    private Sql2oWeaponDao weaponDao;
    private Sql2oArmorDao armorDao;
    private Sql2oAdversariesDao adversariesDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        weaponDao = new Sql2oWeaponDao(sql2o);
//        armorDao = new Sql2oArmorDao(sql2o);
//        adversariesDao = new Sql2oAdversariesDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addingWeaponSetsId() throws Exception {
        Weapon testWeapon = setupWeapon();
        int originalWeaponId = testWeapon.getId();
        weaponDao.add(testWeapon);
        assertNotEquals(originalWeaponId,testWeapon.getId());
    }

    @Test
    public void addedWeaponsAreReturnedFromGetAll() throws Exception {
        Weapon testWeapon = setupWeapon();
        weaponDao.add(testWeapon);
        assertEquals(1, weaponDao.getAll().size());
    }

    @Test
    public void deleteByIdDeletesCorrectWeapon() throws Exception {
        Weapon testWeapon = setupWeapon();
        weaponDao.add(testWeapon);
        weaponDao.deleteById(testWeapon.getId());
        assertEquals(0, weaponDao.getAll().size());
    }

    @Test
    public void updateByIdUpdatesWeapon() {
        Weapon weapon = new Weapon("Blaster Rifle", "Ranged Heavy", "9", "3", "Long", "4", "4", "5", "900");
        weaponDao.add(null);
        weaponDao.update(1, "Blaster Pistol", "Ranged Light", "6", "3", "Medium", "1", "3", "4", "400");
        assertEquals("Boonta Blaster", weaponDao.findById(1).getName());
    }



    public Weapon setupWeapon (){
        return new Weapon("Blaster Rifle", "Ranged Heavy", "9", "3", "Long", "4", "4", "5", "900");

    }

    public Weapon setupAltWeapon (){
        return new Weapon("Blaster Pistol", "Ranged Light", "6", "3", "Medium", "1", "3", "4", "400");

    }
}