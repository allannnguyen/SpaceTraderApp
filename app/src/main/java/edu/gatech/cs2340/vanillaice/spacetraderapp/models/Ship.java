package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

/**
 * Represents the player's current ship
 */
public class Ship {
    private int fuel;
    private int health;
    private boolean escapepod;
    private boolean insurance;
    private ShipType type;
    private int water, fur, food, ore, game, firearm, medicine,
    machine, narcotic, robot;

    /**
     * Default constructor for player with a GNAT ship
     */
    public Ship() {
        this(ShipType.GNAT, false, false);
    }

    /**
     * Constructor for ship
     * @param type the ShipType
     * @param escapepod boolean whether the ship has an escape pod
     * @param insurance boolean whether the ship has insurance
     */
    public Ship(ShipType type, boolean escapepod, boolean insurance) {
        this.type = type;
        health = type.getHullHealth();
        this.escapepod = escapepod;
        this.insurance = insurance;
    }

    /**
     * Gets the total amount of cargo on ship
     * @return the total amount of cargo on ship
     */
    public int getTotal() {
        return water + fur + food + ore + game + firearm + medicine + machine + narcotic + robot;
    }

    /**
     * Gets whether the ship has an escape pod
     * @return whether the ship has an escape pod
     */
    public boolean hasEscapepod() {
        return escapepod;
    }

    /**
     *  Gets whether the ship has insurance
     * @return whether the ship has insurance
     */
    public boolean hasInsurance() {
        return insurance;
    }

    /**
     * Gets the amount of fuel in the tank
     * @return fuel in tank
     */
    public int getFuel() {
        return fuel;
    }

    /**
     * Gets the current health
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Gets the quantity of water in cargo
     * @return quantity of water
     */
    public int getWater() {
        return water;
    }

    /**
     * Sets the quantity of water in cargo
     * @param quantity new quantity of water in cargo
     */
    public void setWater(int quantity) {
        water = quantity;
    }

    /**
     * Gets the quantity of fur in cargo
     * @return quantity of fur
     */
    public int getFur() {
        return fur;
    }

    /**
     * Sets the quantity of fur in cargo
     * @param quantity new quantity of fur in cargo
     */
    public void setFur(int quantity) {
        fur = quantity;
    }

    /**
     * Gets the quantity of food in cargo
     * @return quantity of food in cargo
     */
    public int getFood() {
        return food;
    }

    /**
     * Sets the quantity of food in cargo
     * @param quantity new quantity of food in cargo
     */
    public void setFood(int quantity) {
        food = quantity;
    }

    /**
     * Gets the quantity of ore in cargo
     * @return quantity of ore in cargo;
     */
    public int getOre() {
        return ore;
    }

    /**
     * Sets the quantity of ore in cargo
     * @param quantity new quantity of ore in cargo
     */
    public void setOre(int quantity) {
        ore = quantity;
    }

    /**
     * Gets the quantity of games in cargo
     * @return quantity of games in cargo
     */
    public int getGame() {
        return game;
    }

    /**
     * Sets the quantity of games in cargo
     * @param quantity new quantity of games in cargo
     */
    public void setGame(int quantity) {
        game = quantity;
    }

    /**
     * Gets the quantity of firearms in cargo
     * @return quantity of firearms in cargo
     */
    public int getFirearm() {
        return firearm;
    }

    /**
     * Sets the quantity of firearms in cargo
     * @param quantity new quantity of firearms in cargo
     */
    public void setFirearm(int quantity) {
        firearm = quantity;
    }

    /**
     * Gets the quantity of medicine in cargo
     * @return quantity of medicine in cargo
     */
    public int getMedicine() {
        return medicine;
    }

    /**
     * Sets the quantity of medicine in cargo
     * @param quantity new quantity of medicine in cargo
     */
    public void setMedicine(int quantity) {
        medicine = quantity;
    }

    /**
     * Gets the quantity of machines in cargo
     * @return quantity of machines in cargo
     */
    public int getMachine() {
        return machine;
    }

    /**
     * Sets the quantity of machines in cargo
     * @param quantity new quantity of machines in cargo
     */
    public void setMachine(int quantity) {
        machine = quantity;
    }

    /**
     * Gets the quantity of narcotics in cargo
     * @return quantity of narcotics in cargo
     */
    public int getNarcotic() {
        return narcotic;
    }

    /**
     * Sets the quantity of narcotics in cargo
     * @param quantity new quantity of narcotics in cargo
     */
    public void setNarcotic(int quantity) {
        narcotic = quantity;
    }

    /**
     * Gets the quantity of robots in cargo
     * @return quantity of robots in cargo
     */
    public int getRobot() {
        return robot;
    }

    /**
     * Sets the quantity of robots in cargo
     * @param quantity new quantity of robots in cargo
     */
    public void setRobot(int quantity) {
        robot = quantity;
    }

}
