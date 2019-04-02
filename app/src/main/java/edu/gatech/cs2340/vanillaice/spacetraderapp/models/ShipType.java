package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

/**
 * Represents the base stats of each type of ship
 */
public enum ShipType {
    GNAT(15, 14, 100);

    private final int cargoHolds;
    private final int fuelEconomy;
    private final int hullHealth;

    /**
     * Constructs a ship with those stats
     * @param cargoHolds base cargo holds for the ship
     * @param fuelEconomy parsecs able to be traveled per fuel tank
     * @param hullHealth base health of the ship
     */
    ShipType(int cargoHolds, int fuelEconomy, int hullHealth) {
        this.cargoHolds = cargoHolds;
        this.fuelEconomy = fuelEconomy;
        this.hullHealth = hullHealth;
    }

    /**
     * Gets the base cargo holds for the ship
     * @return max number of cargo
     */
    public int getCargoHolds() {
        return cargoHolds;
    }

    /**
     * Gets the base health of the ship
     * @return max health of the ship
     */
    public int getHullHealth() {
        return hullHealth;
    }

    /**
     * Gets the max fuel capacity of the shiptype.
     *
     * @return The max fuel capacity of the shiptype.
     */
    public int getFuelEconomy() {
        return this.fuelEconomy;
    }
}
