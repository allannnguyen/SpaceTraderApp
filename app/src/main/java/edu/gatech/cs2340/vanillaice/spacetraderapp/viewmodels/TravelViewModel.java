package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;

import java.util.ArrayList;
import java.util.List;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Planet;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Ship;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Universe;

public class TravelViewModel {

    private Player player;
    private Ship ship;
    private Universe universe;

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

    public List<Planet> planetsInRange() {
        List<Planet> planetList = new ArrayList<Planet>();
        for (Planet planet: universe.getPlanets()) {
            if (player.getPlanet().calcDistance(planet) <= ship.getFuel()) {
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
    public void travel(Planet planet) {
        player.setPlanet(planet);
        ship.setFuel(ship.getFuel() - planet.getDistance());
    }
}
