package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    //------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------          Setup           -----------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    Farmer farmer;
    Constable constable;
    Warrior warrior;

    @Before
    public void setUp() throws Exception {
        farmer = new Farmer("farmerBill");
        constable = new Constable("constableRosalyn", "Durham");
        warrior = new Warrior("warriorKyle");
    }


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
}
