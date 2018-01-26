package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdversariesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNameReturnsCorrectName() throws Exception {
        Adversaries testAdversaries = setupAdversaries();
        assertEquals("Aqualish Thug", testAdversaries.getAdversaryName());
    }

    @Test
    public void getLevelCorrectLevel() throws Exception {
        Adversaries testAdversaries = setupAdversaries();
        assertEquals("Minion", testAdversaries.getLevel());
    }

    @Test
    public void getIndexReturnsCorrectIndex() throws Exception {
        Adversaries testAdversaries = setupAdversaries();
        assertEquals("SoF:126", testAdversaries.getIndex());
    }

    @Test
    public void setNameSetsCorrectName() throws Exception {
        Adversaries testAdversaries = setupAdversaries();
        testAdversaries.setAdversaryName("Defel Assasin");
        assertNotEquals("Aqualish Thug", testAdversaries.getAdversaryName());
    }

    @Test
    public void setLevelSetsCorrectLevel() throws Exception {
        Adversaries testAdversaries = setupAdversaries();
        testAdversaries.setLevel("Nemisis");
        assertNotEquals("Minion", testAdversaries.getLevel());
    }

    @Test
    public void setIndexSetsCorrectIndex() throws Exception {
        Adversaries testAdversaries = setupAdversaries();
        testAdversaries.setIndex("E-CRB:392");
        assertNotEquals("SoF:126", testAdversaries.getIndex());
    }


    public Adversaries setupAdversaries (){
        return new Adversaries("Aqualish Thug", "Minion", "SoF:126");

    }

    public Adversaries setupAltAdversary (){
        return new Adversaries("Defel Assasin", "Nemisis", "E-CRB:392");

    }
}