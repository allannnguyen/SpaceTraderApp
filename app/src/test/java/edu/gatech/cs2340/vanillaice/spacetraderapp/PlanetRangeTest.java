package edu.gatech.cs2340.vanillaice.spacetraderapp;

import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Difficulty;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Planet;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Resource;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Technology;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Universe;
import edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels.TravelViewModel;

import static org.junit.Assert.*;

public class PlanetRangeTest {
    private List<Planet> allPlanets;
    private Universe universe;
    private Player player;
    private TravelViewModel tvm;

    private static final int TIMEOUT = 200;

    @Before
    public void setUp() {
        allPlanets = new ArrayList<>();
        allPlanets.add(new Planet("Alpha", 0, 0, Technology.HITECH, Resource.WARLIKE));
        allPlanets.add(new Planet("Bravo", 0, 7, Technology.HITECH, Resource.WARLIKE));
        allPlanets.add(new Planet("Charlie", 0, 14, Technology.HITECH, Resource.WARLIKE));
        allPlanets.add(new Planet("Delta", 0, 15, Technology.HITECH, Resource.WARLIKE));
        allPlanets.add(new Planet("Echo", 0, -7, Technology.HITECH, Resource.WARLIKE));
        allPlanets.add(new Planet("Foxtrot", 0, -14, Technology.HITECH, Resource.WARLIKE));
        allPlanets.add(new Planet("Golf", 0, -15, Technology.HITECH, Resource.WARLIKE));

        universe = new Universe(allPlanets);

        player = new Player("Bart", Difficulty.HARD, 4, 4, 4, 4, allPlanets.get(0));

        tvm = new TravelViewModel(player, universe);
    }

    @Test (timeout = TIMEOUT)
    public void testPlanetsInRange() {
        List<Planet> inPlanets = tvm.planetsInRange();
        assertEquals("The ship's range should be 14", player.getShip().getFuel(), 14);
        assertEquals("The number of planets in range should be five", inPlanets.size(), 5);
        assertEquals("Alpha should be in range of itself.", inPlanets.get(0),allPlanets.get(0));
        assertEquals("Bravo should be in range of Alpha.", inPlanets.get(1),allPlanets.get(1));
        assertEquals("Charlie should be in range of Alpha.", inPlanets.get(2),allPlanets.get(2));
        assertEquals("Echo should be in range of Alpha.", inPlanets.get(3),allPlanets.get(4));
        assertEquals("Foxtrot should be in range of Alpha.", inPlanets.get(4),allPlanets.get(5));
    }
}
