package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import android.support.annotation.NonNull;
import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents a player for the game.
 * A player has a name, four skills with sixteen skill points allocated across them,
 * a difficulty setting for the game, their number of credits, and a ship they own.
 */
public class Player implements Serializable{
    private final  String name;
    private final int pilot;
    private final int fighter;
    private final int trader;
    private final int engineer;
    private int credits;
    private final Difficulty difficulty;
    private final Ship ship;
    private Planet currPlanet;

    /**
     * Constructs the player based on various parameters.
     * @param name the player's name
     * @param difficulty the selected difficulty for the game
     * @param currPlanet the player's current location
     * @param skills hashmap containing the pilot, fighter, trader, and engineer skill points
     */
    public Player(String name, Difficulty difficulty, Planet currPlanet, HashMap<String, Integer> skills) {
        this.name = name;
        this.difficulty = difficulty;
        this.pilot = skills.get("pilot");
        this.fighter = skills.get("fighter");
        this.trader = skills.get("trader");
        this.engineer = skills.get("engineer");
        this.credits = 1000;
        this.ship = new Ship();
        this.currPlanet = currPlanet;
    }

    /**
     * Gets the amount of credits the player has
     * @return player's number of credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Gets the ship the player owns
     * @return player's current ship
     */
    public Ship getShip(){
        return ship;
    }

    /**
     * Sets the amount of credits the player has
     * @param credits new credit value for the player
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * Prints the player's information to the logs
     * @return a string that lists the player's parameters
     */
    @NonNull
    public String toString() {
        return "|Commander Name: " + name + "|Difficulty: " + difficulty.toString()
                + "|Ship: " + ship.toString() + "| SKILLS -- Pilot: "
                + pilot + " Fighter: " + fighter + " Trader: " + trader + " Engineer: " + engineer;
    }

    /**
     * Gets the planet the player is currently on
     * @return the current planet
     */
    public Planet getPlanet() {
        return currPlanet;
    }

    /**
     * Gets the name of the player's current planet.
     * @return A string of the current planet's name.
     */
    public String getPlanetName() {
        return currPlanet.getName();
    }

    /**
     * Sets the current location of the player.
     *
     * @param planet The planet where the player is located.
     */
    public void setPlanet(Planet planet) {
        this.currPlanet = planet;
    }

    /**
     * Gets the market of the planet the player is currently on
     * @return the current planet's market
     */
    public Market getMarket() { return currPlanet.getMarket(); }
}
