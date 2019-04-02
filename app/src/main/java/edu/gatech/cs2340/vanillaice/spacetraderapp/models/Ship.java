package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Represents the player's current ship
 */
public class Ship implements Serializable {
    private int fuel;
    private ShipType type;
    private final HashMap<Good, Integer> goods;

    /**
     * Default constructor for player with a GNAT ship
     */
    public Ship() {
        this(ShipType.GNAT);
    }

    /**
     * Constructor for ship
     * @param type the ShipType
     */
    public Ship(ShipType type) {
        this.type = type;
        this.fuel = type.getFuelEconomy();
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
            Integer value = goods.get(good);
            if (value != null){
                total += value;
            }
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
     * Gets the amount of fuel in the tank
     * @return fuel in tank
     */
    public int getFuel() {
        return fuel;
    }

    /**
     * Sets the fuel of the ship
     *
     * @param newFuel The distance that the ship travelled.
     */
    public void setFuel(int newFuel) {
        this.fuel = newFuel;
    }

    /**
     * Gets the quantity of a good in cargo
     * @param good type of good to be checked
     * @return quantity of that good in cargo
     */
    public int getGood(Good good) {
        Integer value = goods.get(good);
        if (value != null) {
            return value;
        } else {
            return 0;
        }
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
     * Gets the type of the ship
     * @return The type of the ship
     */
    @NonNull
    public String toString() {
        return type.toString();
    }

}
