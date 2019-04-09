package edu.gatech.cs2340.vanillaice.spacetraderapp;

import org.junit.Before;
import org.junit.Test;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Planet;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Resource;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Technology;

import static org.junit.Assert.*;

public class PlanetUnitTest {
    private Planet newPlanetOne;
    private Planet newPlanetTwo;

    @Before
    public void setUp() throws Exception {
        newPlanetOne = new Planet("One",0,0,Technology.PREAGRICULTURAL, Resource.NOSPECIALRESOURCES);
        newPlanetTwo = new Planet("Two",3,4,Technology.PREAGRICULTURAL, Resource.NOSPECIALRESOURCES);
    }

    @Test
    public void testCalcDistance() {
        assertEquals(newPlanetOne.calcDistance(newPlanetTwo),5);
    }
}
