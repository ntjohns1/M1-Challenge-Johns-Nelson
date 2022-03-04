package com.company;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.io.InputStream;

import static org.junit.Assert.*;

public class CharacterTest {

    //------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------          Setup           -----------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    private InputStream original;
    Farmer farmer;
    Constable constable;
    Warrior warrior;

    @Before
    public void setUp() throws Exception {
        farmer = new Farmer("farmerBill");
        constable = new Constable("constableRosalyn", "Durham");
        warrior = new Warrior("warriorKyle");

        systemOutRule.clearLog();
        original = System.in;
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    //------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------          Tests           -----------------------------------------------
    //------------------------------------------------------------------------------------------------------------------


    //------------------------------------------------------------------------------------------------------------------
    //  Class Character:
    //  attack() method
    //------------------------------------------------------------------------------------------------------------------
    @Test
    public void attackMethodShouldDecreaseHealth() {

        // character starting health =10
        // farmer attack power = 1
        farmer.attack(constable);
        assertEquals(99, constable.getHealth());

        // Constable attack power = 5
        constable.attack(warrior);
        assertEquals(95, warrior.getHealth());

        // Warrior attack power = 10
        warrior.attack(farmer);
        assertEquals(90, farmer.getHealth());
    }

    @Test
    public void attackMethodShouldPrintFormattedString() {
        farmer.attack(constable);
        constable.attack(warrior);
        warrior.attack(farmer);

        String output = systemOutRule.getLog();
        String failMessage = "Incorrect Message";
        assertTrue(failMessage, output.contains("farmerBill has attacked constableRosalyn for 1 points of damage"));
        assertTrue(failMessage, output.contains("constableRosalyn has attacked warriorKyle for 5 points of damage"));
        assertTrue(failMessage, output.contains("warriorKyle has attacked farmerBill for 10 points of damage"));
    }


    // ------------------------------------------------------------------------------------------------------------------
    //  Class Character:
    //  run() method
    //------------------------------------------------------------------------------------------------------------------

    @Test
    public void shouldSetRunningValueToTrue() {
        farmer.run();
        constable.run();
        warrior.run();

        assertTrue(farmer.isRunning());
        assertTrue(constable.isRunning());
        assertTrue(warrior.isRunning());
    }

    //------------------------------------------------------------------------------------------------------------------
    // Class Constable:
    //  arrest() Method
    //------------------------------------------------------------------------------------------------------------------
    @Test
    public void shouldSetArrestedValueToTrueForParam() {
        constable.arrest(warrior);
        assertTrue(warrior.isArrested());

        constable.arrest(farmer);
        assertTrue(farmer.isArrested());
    }

    @Test
    public void shouldPrintFormattedStringToConsole() {

        farmer.harvest();
        String output = systemOutRule.getLog();
        String failMessage = "Incorrect Message";
        assertTrue(failMessage, output.contains("farmerBill is harvesting"));

    }
}
