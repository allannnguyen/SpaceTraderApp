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
        return "|Planet Name: " + name + "| Coordinates: (" + xcoord + ", "+ ycoord
                + ")| Technology Level: " + techLevel.toString() + "| Resource Level: "
                + resourceLevel.toString();
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
     * @param planet The planet that we want to go to.
     * @return The distance between two planets.
     */
    public int getDistance(Planet planet) {
        return (int) Math.sqrt((this.xcoord - planet.getXcoord())^2 + (this.ycoord - planet.getYcoord())^2);
    }
}
