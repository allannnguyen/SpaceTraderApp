package edu.gatech.cs2340.vanillaice.spacetraderapp;

import org.junit.Before;
import org.junit.Test;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Good;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Ship;

import static org.junit.Assert.*;

public class BenTest {
    private Ship testShip;

    @Before
    public void setUp() throws Exception {
        testShip = new Ship();
        testShip.setGood(Good.FIREARMS, 1000);
        testShip.setGood(Good.GAMES, 0);
        testShip.setGood(Good.FURS, -10);
        testShip.setGood(Good.FOOD, 1);
    }
    @Test
    public void testGetGood() {
        assertEquals(testShip.getGood(Good.MACHINES), 0);
        assertEquals(testShip.getGood(Good.FIREARMS), 1000);
        assertEquals(testShip.getGood(Good.FURS), -10);
        assertEquals(testShip.getGood(Good.FOOD), 1);
        assertEquals(testShip.getGood(null), 0);
    }
}
