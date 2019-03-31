package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import android.support.annotation.NonNull;
import java.io.Serializable;

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
    private Ship ship;
    private Planet currPlanet;

    /**
     * Constructs the player based on various parameters.
     * @param name the player's name
     * @param difficulty the selected difficulty for the game
     * @param pilot number of skill points allocated to the pilot skill
     * @param fighter number of skill points allocated to the fighter skill
     * @param trader number of skill points allocated to the trader skill
     * @param engineer number of skill points allocated to the engineer skill
     * @param currPlanet the player's current location
     */
    public Player(String name, Difficulty difficulty, int pilot, int fighter, int trader,
                  int engineer, Planet currPlanet) {
        this.name = name;
        this.difficulty = difficulty;
        this.pilot = pilot;
        this.fighter = fighter;
        this.trader = trader;
        this.engineer = engineer;
        this.credits = 1000;
        this.ship = new Ship();
        this.currPlanet = currPlanet;
    }

    /**
     * Gets the name of the player
     * @return this player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the amount of skill points allocated to the pilot skill
     * @return player's pilot skill points
     */
    public int getPilot(){
        return pilot;
    }

    /**
     * Gets the amount of skill points allocated to the fighter skill
     * @return player's fighter skill points
     */
    public int getFighter(){
        return fighter;
    }

    /**
     * Gets the amount of skill points allocated to the trader skill
     * @return player's trader skill points
     */
    public int getTrader(){
        return trader;
    }

    /**
     * Gets the amount of skill points allocated to the engineer skill
     * @return player's engineer skill points
     */
    public int getEngineer(){
        return engineer;
    }

    /**
     * Gets the amount of credits the player has
     * @return player's number of credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Gets the difficulty the player selected
     * @return player's difficulty setting
     */
    public Difficulty getDifficulty(){
        return difficulty;
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
     * Sets the current ship for the player
     * @param ship player's new ship
     */
    public void setShip(Ship ship) {
        this.ship = ship;
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
