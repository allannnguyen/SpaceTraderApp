package edu.gatech.cs2340.vanillaice.spacetraderapp;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Difficulty;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Planet;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Resource;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Technology;

import static org.junit.Assert.*;

public class PlayerUnitTest {
    private Player player1;
    private Player player2;

    @Before
    public void setUp() throws Exception {
        Planet planet1 = new Planet("One",0,0, Technology.PREAGRICULTURAL, Resource.NOSPECIALRESOURCES);
        Map<String, Integer> map =  new HashMap<String, Integer>();
        map.put("pilot", 3);
        map.put("fighter", 4);
        map.put("trader", 5);
        map.put("engineer", 4);

        player1 = new Player("John", Difficulty.BEGINNER, planet1, map);
        player1.setCredits(20);

        Planet planet2 = new Planet("Two",3,4,Technology.PREAGRICULTURAL, Resource.NOSPECIALRESOURCES);
        Map<String, Integer> map2 =  new HashMap<String, Integer>();
        map2.put("pilot", 5);
        map2.put("fighter", 5);
        map2.put("trader", 6);
        map2.put("engineer", 0);

        player2 = new Player("Tim", Difficulty.IMPOSSIBLE, planet2, map2);
        player2.setCredits(1030);

    }

    @Test
    public void testPlayerCredits() {

        assertEquals(player1.getCredits(), 20);
        assertEquals(player2.getCredits(), 1030);

    }

}
