package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNameReturnsCorrectName() throws Exception {
        Weapon testWeapon = setupWeapon();
        assertEquals("Blaster Rifle", testWeapon.getName());
    }

    @Test
    public void getSkillReturnsCorrectSkill() throws Exception {
        Weapon testWeapon = setupWeapon();
        assertEquals("Ranged Heavy", testWeapon.getSkill());
    }

    @Test
    public void getDamageReturnsCorrectDamage() throws Exception {
        Weapon testWeapon = setupWeapon();
        assertEquals("9", testWeapon.getDamage());
    }
    @Test
    public void getCriticalReturnsCorrectCritical() throws Exception {
        Weapon testWeapon = setupWeapon();
        assertEquals("3", testWeapon.getCritical());
    }

    @Test
    public void getRangeReturnsCorrectRange() throws Exception {
        Weapon testWeapon = setupWeapon();
        assertEquals("Long", testWeapon.getRange());
    }

    @Test
    public void getEncumberanceReturnsCorrectEncumberance() throws Exception {
        Weapon testWeapon = setupWeapon();
        assertEquals("4", testWeapon.getEncumberance());
    }

    @Test
    public void getHardPointReturnsCorrectHardPoint() throws Exception {
        Weapon testWeapon = setupWeapon();
        assertEquals("4", testWeapon.getHardPoint());
    }

    @Test
    public void getRarityReturnsRarity() throws Exception {
        Weapon testWeapon = setupWeapon();
        assertEquals("5", testWeapon.getRarity());
    }

    @Test
    public void getPriceReturnsCorrectPrice() throws Exception {
        Weapon testWeapon = setupWeapon();
        assertEquals("900", testWeapon.getPrice());
    }

    @Test
    public void setNameSetsCorrectName() throws Exception {
        Weapon testWeapon = setupWeapon();
        testWeapon.setName("Blaster Pistol");
        assertNotEquals("Blaster Rifle",testWeapon.getName());
    }

    @Test
    public void setSkillSetsCorrectSkill() throws Exception {
        Weapon testWeapon = setupWeapon();
        testWeapon.setSkill("Ranged Light");
        assertNotEquals("Ranged Heavy", testWeapon.getSkill());
    }

    @Test
    public void setDamageSetsCorrectDamage() throws Exception {
        Weapon testWeapon = setupWeapon();
        testWeapon.setDamage("6");
        assertNotEquals("9", testWeapon.getDamage());
    }
    @Test
    public void setCriticalSetsCorrectCritical() throws Exception {
        Weapon testWeapon = setupWeapon();
        testWeapon.setCritical("3");
        assertEquals("3", testWeapon.getCritical());
    }

    @Test
    public void setRangeSetsCorrectRange() throws Exception {
        Weapon testWeapon = setupWeapon();
        testWeapon.setRange("Long");
        assertNotEquals("Medium", testWeapon.getRange());
    }

    @Test
    public void setEncumberanceSetsCorrectEncumberance() throws Exception {
        Weapon testWeapon = setupWeapon();
        testWeapon.setEncumberance("1");
        assertNotEquals("4", testWeapon.getEncumberance());
    }

    @Test
    public void setHardPointSetsCorrectHardPoint() throws Exception {
        Weapon testWeapon = setupWeapon();
        testWeapon.setHardPoint("3");
        assertNotEquals("4",testWeapon.getHardPoint());
    }

    @Test
    public void setRaritySetsCorrectRarity() throws Exception {
        Weapon testWeapon = setupWeapon();
        testWeapon.setRarity("4");
        assertNotEquals("5",testWeapon.getRarity());
    }

    @Test
    public void setPriceSetsCorrectPrice() throws Exception {
        Weapon testWeapon = setupWeapon();
        testWeapon.setPrice("400");
        assertNotEquals("900",testWeapon.getPrice());
    }

    public Weapon setupWeapon (){
        return new Weapon("Blaster Rifle", "Ranged Heavy", "9", "3", "Long", "4", "4", "5", "900");

    }

    public Weapon setupAltWeapon (){
        return new Weapon("Blaster Pistol", "Ranged Light", "6", "3", "Medium", "1", "3", "4", "4F00");

    }

}