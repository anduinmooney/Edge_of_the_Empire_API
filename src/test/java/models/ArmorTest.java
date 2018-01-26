package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArmorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNameReturnsCorrectName() throws Exception {
        Armor testArmor = setupArmor();
        assertEquals("Armored Clothing", testArmor.getArmorName());
    }

    @Test
    public void getDefenseCorrectDefense() throws Exception {
        Armor testArmor = setupArmor();
        assertEquals("1", testArmor.getDefense());
    }

    @Test
    public void getSoakReturnsCorrectSoak() throws Exception {
        Armor testArmor = setupArmor();
        assertEquals("1", testArmor.getSoak());
    }
    @Test
    public void getPriceReturnsCorrectPrice() throws Exception {
        Armor testArmor = setupArmor();
        assertEquals("1000", testArmor.getArmorPrice());
    }

    @Test
    public void getEncumberanceReturnsCorrectEncumberance() throws Exception {
        Armor testArmor = setupArmor();
        assertEquals("3", testArmor.getArmorEncumberance());
    }

    @Test
    public void getHardPointReturnsCorrectHardPoint() throws Exception {
        Armor testArmor = setupArmor();
        assertEquals("1", testArmor.getArmorHardPoint());
    }

    @Test
    public void getRarityReturnsRarity() throws Exception {
        Armor testArmor = setupArmor();
        assertEquals("6", testArmor.getArmorRarity());
    }

    @Test
    public void setNameSetsCorrectName() throws Exception {
        Armor testArmor = setupArmor();
        testArmor.setArmorName("Heavy Clothing");
        assertNotEquals("Blaster Rifle",testArmor.getArmorName());
    }

    @Test
    public void setDefenseSetsCorrectDefense() throws Exception {
        Armor testArmor = setupArmor();
        testArmor.setDefense("0");
        assertNotEquals("1", testArmor.getDefense());
    }

    @Test
    public void setSoakSetsCorrectSoak() throws Exception {
        Armor testArmor = setupArmor();
        testArmor.setSoak("1");
        assertEquals("1", testArmor.getSoak());
    }
    @Test
    public void setPriceSetsCorrectPrice() throws Exception {
        Armor testArmor = setupArmor();
        testArmor.setArmorPrice("50");
        assertNotEquals("1000", testArmor.getArmorPrice());
    }

    @Test
    public void setEncumberanceSetsCorrectEncumberance() throws Exception {
        Armor testArmor = setupArmor();
        testArmor.setArmorEncumberance("1");
        assertNotEquals("3", testArmor.getArmorEncumberance());
    }

    @Test
    public void setHardPointSetsCorrectHardPoint() throws Exception {
        Armor testArmor = setupArmor();
        testArmor.setArmorHardPoint("0");
        assertNotEquals("1",testArmor.getArmorHardPoint());
    }

    @Test
    public void setRaritySetsCorrectRarity() throws Exception {
        Armor testArmor = setupArmor();
        testArmor.setArmorRarity("0");
        assertNotEquals("6",testArmor.getArmorRarity());
    }

    public Armor setupArmor (){
        return new Armor("Armored Clothing", "1", "1", "1000", "3", "1", "6");

    }

    public Armor setupAltArmor (){
        return new Armor("Heavy Clothing", "0", "1", "50", "1", "0", "0");

    }
}