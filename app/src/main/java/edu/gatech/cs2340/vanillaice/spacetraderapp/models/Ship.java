package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import java.util.HashMap;

/**
 * Represents the player's current ship
 */
public class Ship {
    private int fuel;
    private int health;
    private boolean escapepod;
    private boolean insurance;
    private ShipType type;
    private HashMap<Good, Integer> goods;

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
        this.health = type.getHullHealth();
        this.fuel = type.getFuelEconomy();
        this.escapepod = escapepod;
        this.insurance = insurance;
        goods = new HashMap<>();
        for (Good good : Good.values()) {
            goods.put(good, 0);
        }
    }

    /**
     * Gets the total amount of cargo on ship
     * @return the total amount of cargo on ship
     */
    public int getTotal() {
        int total = 0;
        for (Good good : Good.values()) {
            total += goods.get(good);
        }
        return total;
    }

    /**
     * Gets the amount of cargo space left on ship
     * @return the amount of cargo space left
     */
    public int getCargoSpace() {
        return type.getCargoHolds() - getTotal();
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
     * Sets the fuel of the ship
     *
     * @param distance The distance that the ship travelled.
     */
    public void setFuel(int distance) {
        this.fuel = this.fuel - distance;
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
        return goods.get(Good.WATER);
    }

    /**
     * Sets the quantity of water in cargo
     * @param quantity new quantity of water in cargo
     */
    public void setWater(int quantity) {
        goods.put(Good.WATER, quantity);
    }

    /**
     * Gets the quantity of fur in cargo
     * @return quantity of fur
     */
    public int getFur() {
        return goods.get(Good.FURS);
    }

    /**
     * Sets the quantity of fur in cargo
     * @param quantity new quantity of fur in cargo
     */
    public void setFur(int quantity) {
        goods.put(Good.FURS, quantity);
    }

    /**
     * Gets the quantity of food in cargo
     * @return quantity of food in cargo
     */
    public int getFood() {
        return goods.get(Good.FOOD);
    }

    /**
     * Sets the quantity of food in cargo
     * @param quantity new quantity of food in cargo
     */
    public void setFood(int quantity) {
        goods.put(Good.FOOD, quantity);
    }

    /**
     * Gets the quantity of ore in cargo
     * @return quantity of ore in cargo;
     */
    public int getOre() {
        return goods.get(Good.ORE);
    }

    /**
     * Sets the quantity of ore in cargo
     * @param quantity new quantity of ore in cargo
     */
    public void setOre(int quantity) {
        goods.put(Good.ORE, quantity);
    }

    /**
     * Gets the quantity of games in cargo
     * @return quantity of games in cargo
     */
    public int getGame() {
        return goods.get(Good.GAMES);
    }

    /**
     * Sets the quantity of games in cargo
     * @param quantity new quantity of games in cargo
     */
    public void setGame(int quantity) {
        goods.put(Good.GAMES, quantity);
    }

    /**
     * Gets the quantity of firearms in cargo
     * @return quantity of firearms in cargo
     */
    public int getFirearm() {
        return goods.get(Good.FIREARMS);
    }

    /**
     * Sets the quantity of firearms in cargo
     * @param quantity new quantity of firearms in cargo
     */
    public void setFirearm(int quantity) {
        goods.put(Good.FIREARMS, quantity);
    }

    /**
     * Gets the quantity of medicine in cargo
     * @return quantity of medicine in cargo
     */
    public int getMedicine() {
        return goods.get(Good.MEDICINE);
    }

    /**
     * Sets the quantity of medicine in cargo
     * @param quantity new quantity of medicine in cargo
     */
    public void setMedicine(int quantity) {
        goods.put(Good.MEDICINE, quantity);
    }

    /**
     * Gets the quantity of machines in cargo
     * @return quantity of machines in cargo
     */
    public int getMachine() {
        return goods.get(Good.MACHINES);
    }

    /**
     * Sets the quantity of machines in cargo
     * @param quantity new quantity of machines in cargo
     */
    public void setMachine(int quantity) {
         goods.put(Good.MACHINES, quantity);
    }

    /**
     * Gets the quantity of narcotics in cargo
     * @return quantity of narcotics in cargo
     */
    public int getNarcotic() {
        return goods.get(Good.NARCOTICS);
    }

    /**
     * Sets the quantity of narcotics in cargo
     * @param quantity new quantity of narcotics in cargo
     */
    public void setNarcotic(int quantity) {
        goods.put(Good.NARCOTICS, quantity);
    }

    /**
     * Gets the quantity of robots in cargo
     * @return quantity of robots in cargo
     */
    public int getRobot() {
        return goods.get(Good.ROBOTS);
    }

    /**
     * Sets the quantity of robots in cargo
     * @param quantity new quantity of robots in cargo
     */
    public void setRobot(int quantity) {
        goods.put(Good.ROBOTS, quantity);
    }

    /**
     * Gets the quantity of a good in cargo
     * @param good type of good to be checked
     * @return quantity of that good in cargo
     */
    public int getGood(Good good) {
        return goods.get(good);
    }

    /**
     * Sets the quantity of a good in cargo
     * @param good type of good to be changed in cargo
     * @param quantity new quantity of that good in cargo
     */
    public void setGood(Good good, int quantity) {
        goods.put(good, quantity);
    }

    /**
     * Prints out the ship
     * @return string representing the ship
     */
    public String toString() {
        return type.toString();
    }

}
