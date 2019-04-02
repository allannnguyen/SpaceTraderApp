package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

/**
 * Represents the base stats of each type of ship
 */
public enum ShipType {
    GNAT();

    private final int cargoHolds;
    private final int fuelEconomy;

    /**
     * Constructs a ship with those stats
     */
    ShipType() {
        this.cargoHolds = 15;
        this.fuelEconomy = 14;
    }

    /**
     * Gets the base cargo holds for the ship
     * @return max number of cargo
     */
    public int getCargoHolds() {
        return cargoHolds;
    }

    /**
     * Gets the max fuel capacity of the shiptype.
     * @return The max fuel capacity of the shiptype.
     */
    public int getFuelEconomy() {
        return this.fuelEconomy;
    }
}
