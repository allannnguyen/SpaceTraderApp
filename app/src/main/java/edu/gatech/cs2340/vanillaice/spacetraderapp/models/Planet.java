package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import android.support.annotation.NonNull;

import java.io.Serializable;

/**
 * Represents a planet. A planet has a name, coordinates, a tech level, and a resource level.
 */
public class Planet implements Serializable {
    private final String name;
    private final int xcoord;
    private final int ycoord;
    private final Technology techLevel;
    private final Resource resourceLevel;
    private final Market market;
    private int distance;

    /**
     * Creates an instance of a planet.
     *
     * @param name The name of the planet.
     * @param xcoord The x-axis location of teh planet.
     * @param ycoord The y-axis location of teh planet.
     * @param techLevel The technology level of the planet.
     * @param resourceLevel The resource level of the planet.
     */
    public Planet(String name, int xcoord, int ycoord, Technology techLevel,
                  Resource resourceLevel) {
        this.name = name;
        this.xcoord = xcoord;
        this.ycoord = ycoord;
        this.techLevel = techLevel;
        this.resourceLevel = resourceLevel;
        this.market = new Market(techLevel, resourceLevel);
    }

    /**
     * Gets the planet's market
     * @return the market of the planet
     */
    public Market getMarket() {
        return market;
    }

    /**
     * Gets the name of the planet.
     *
     * @return The planet's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the name and distance of the planet
     * @return The planet's name and distance
     */
    @NonNull
    public String toString() {
        return name + "   " + distance;
    }

    /**
     * Gets the x coordinate of the planet.
     *
     * @return The x-coordinate of the planet
     */
    public int getXcoord() {
        return this.xcoord;
    }

    /**
     * Gets the y-coordinate of the planet.
     *
     * @return The y-coordinate of the planet
     */
    public int getYcoord() {
        return this.ycoord;
    }

    /**
     * Calculates the distance between two planets.
     *
     * @param planet player's current planet.
     * @return The distance between two planets.
     */
    public int calcDistance(Planet planet) {
        distance = (int) Math.sqrt(Math.pow(this.xcoord - planet.getXcoord(), 2)
                + Math.pow((this.ycoord - planet.getYcoord()), 2));
        return distance;
    }


    /**
     * Gets the distance of this planet from the current planet.
     *
     * @return The distance of this planet.
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Gets the planet's technology level.
     * @return The planet's tech level
     */
    public Technology getTechLevel() {
        return this.techLevel;
    }

    /**
     * Gets the planet's resource level.
     * @return The planet's resource level
     */
    public Resource getResourceLevel() {
        return this.resourceLevel;
    }
}
