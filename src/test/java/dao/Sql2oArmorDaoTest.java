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

public class Sql2oArmorDaoTest {
    private Connection conn;
    private Sql2oWeaponDao weaponDao;
    private Sql2oArmorDao armorDao;
    private Sql2oAdversariesDao adversariesDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        weaponDao = new Sql2oWeaponDao(sql2o);
        armorDao = new Sql2oArmorDao(sql2o);
//        adversariesDao = new Sql2oAdversariesDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addingArmorSetsId() throws Exception {
        Armor testArmor = setupArmor();
        int originalArmorId = testArmor.getId();
        armorDao.add(testArmor);
        assertNotEquals(originalArmorId,testArmor.getId());
    }

    @Test
    public void addedArmorsAreReturnedFromGetAll() throws Exception {
        Armor testArmor = setupArmor();
        armorDao.add(testArmor);
        assertEquals(1, armorDao.getAll().size());
    }

    @Test
    public void deleteByIdDeletesCorrectArmor() throws Exception {
        Armor testArmor = setupArmor();
        armorDao.add(testArmor);
        armorDao.deleteById(testArmor.getId());
        assertEquals(0, armorDao.getAll().size());
    }

    public Armor setupArmor (){
        return new Armor("Armored Clothing", "1", "1", "1000", "3", "1", "6");

    }

    public Armor setupAltArmor (){
        return new Armor("Heavy Clothing", "0", "1", "50", "1", "0", "0");

    }
}