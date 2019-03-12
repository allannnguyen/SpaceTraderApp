package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

/**
 * Represents a planet. A planet has a name, coordinates, a tech level, and a resource level.
 */
public class Planet {
    private String name;
    private int xcoord;
    private int ycoord;
    private Technology techLevel;
    private Resource resourceLevel;
    private Market market;
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
    public Planet(String name, int xcoord, int ycoord, Technology techLevel, Resource resourceLevel) {
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
     * Prints the planet information to the logs.
     *
     * @ A string listing the planet's parameters.
     */

    public String getName() {
        return name;
    }
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
        distance = (int) Math.sqrt(Math.pow(this.xcoord - planet.getXcoord(), 2) + Math.pow((this.ycoord - planet.getYcoord()), 2));
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
}
