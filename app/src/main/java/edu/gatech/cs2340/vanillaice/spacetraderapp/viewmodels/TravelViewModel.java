package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Planet;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Ship;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Universe;

/**
 * Handles travel actions
 */
public class TravelViewModel {

    private final Player player;
    private final Ship ship;
    private final Universe universe;
    private final int chance1 = 44;
    private final int chance2 = 55;

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

    /**
     * Gets the planet on which the player is currently located.
     * @return The player's current planet
     */
    public Planet getCurrentPlanet() {
        return player.getPlanet();
    }

    /**
     * Gets all of the planets that are within travel range of teh player.
     * @return The list of planet the player can travel to
     */
    public List<Planet> planetsInRange() {
        List<Planet> planetList = new ArrayList<>();
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
     * @return A message describing what happened while travelling
     */
    public String travel(Planet planet) {
        Random rand = new Random();
        int chance = rand.nextInt(100);
        setPlanet(planet);

        if (chance >= chance2) {
            return "You found a wormhole and spent no fuel to travel!";
        } else {
            ship.setFuel(ship.getFuel() - planet.getDistance());
        }

        if (chance <= chance1) {
            addCredits(100);
            return "You found extra money in your toilet!";
        }

        return "Nothing eventful happened during your trip";
    }

    /**
     * Sets the planet of the player
     * @param planet the planet the player travels to
     */
    public void setPlanet(Planet planet) {
        player.setPlanet(planet);
    }

    /**
     * Adds credits for the player
     * @param credits number of credits to be adde
     */
    public void addCredits(int credits) {
        player.setCredits(player.getCredits() + credits);
    }
}
