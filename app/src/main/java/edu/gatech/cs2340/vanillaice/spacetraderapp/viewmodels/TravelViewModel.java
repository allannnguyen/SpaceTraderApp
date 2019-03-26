package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Planet;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Ship;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Universe;

public class TravelViewModel {

    private Player player;
    private Ship ship;
    private Universe universe;
    private Activity context;

    /**
     * Creates an instance of a Travel viewmodel
     *
     * @param player The player that is traveling
     * @param universe The universe in which the player is traveling.
     */
    public TravelViewModel(Player player, Universe universe) {
        this.player = player;
        this.ship = player.getShip();
        this.universe = universe;
    }
    
    /**
     * Gets the remaining fuel in the ship.
     *
     * @return The fuel in the ship.
     */
    public int getFuel() {
        return ship.getFuel();
    }

    public Planet getCurrentPlanet() {
        return player.getPlanet();
    }

    public List<Planet> planetsInRange() {
        List<Planet> planetList = new ArrayList<Planet>();
        for (Planet planet: universe.getPlanets()) {
            if (planet.calcDistance(player.getPlanet()) <= ship.getFuel()) {
                planetList.add(planet);
            }
        }

        return planetList;
    }

    /**
     * Changes the player's location.
     *
     * @param planet The planet that we want to travel to.
     */
    public String travel(Planet planet) {
        Random rand = new Random();
        int chance = rand.nextInt(100);
        player.setPlanet(planet);
        if (chance >= 49) {
            return "You found a wormhole and spent no fuel to travel!";


            
        } else {
            ship.setFuel(ship.getFuel() - planet.getDistance());
        }

        if (chance <= 50) {
            player.setCredits(player.getCredits() + 100);
            //display toast about finding money in back pocket
            return "You found extra money in your toilet!";
        }
        return "";
    }
}
