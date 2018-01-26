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

public class Sql2oAdversariesDaoTest {
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
        adversariesDao = new Sql2oAdversariesDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addingAdversariesSetsId() throws Exception {
        Adversaries testAdversaries = setupAdversaries();
        int originalAdversariesId = testAdversaries.getId();
        adversariesDao.add(testAdversaries);
        assertNotEquals(originalAdversariesId,testAdversaries.getId());
    }

    @Test
    public void addedAdversariesAreReturnedFromGetAll() throws Exception {
        Adversaries testAdversaries = setupAdversaries();
        adversariesDao.add(testAdversaries);
        assertEquals(1, adversariesDao.getAll().size());
    }

    @Test
    public void deleteByIdDeletesCorrectAdversaries() throws Exception {
        Adversaries testAdversaries = setupAdversaries();
        adversariesDao.add(testAdversaries);
        adversariesDao.deleteById(testAdversaries.getId());
        assertEquals(0, adversariesDao.getAll().size());
    }



    public Adversaries setupAdversaries (){
        return new Adversaries("Aqualish Thug", "Minion", "SoF:126");

    }

    public Adversaries setupAltAdversary (){
        return new Adversaries("Defel Assasin", "Nemisis", "E-CRB:392");

    }
}

















