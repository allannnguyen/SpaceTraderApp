package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

/**
 * Represents the base stats of each type of ship
 */
public enum ShipType {
    FLEA(3, 20),
    GNAT(15, 14),
    TERMITE(60, 13);

    private final int cargoHolds;
    private final int fuelEconomy;

    /**
     * Constructs a ship with those stats
     * @param cargoHolds base cargo holds for the ship
     * @param fuelEconomy parsecs able to be traveled per fuel tank
     */
    ShipType(int cargoHolds, int fuelEconomy) {
        this.cargoHolds = cargoHolds;
        this.fuelEconomy = fuelEconomy;
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
