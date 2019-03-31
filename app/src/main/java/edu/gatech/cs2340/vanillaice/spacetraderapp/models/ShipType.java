package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

/**
 * Represents the base stats of each type of ship
 */
public enum ShipType {
    FLEA(3, 0, 0, 0, 20, 0, 0, 0), //weak hull, cheap
    GNAT(15, 1, 0, 1, 14, 0, 10, 100),
    FIREFLY(20, 1, 1, 1, 17, 0, 0, 0), //fairly cheap
    MOSQUITO(15, 2, 1, 1, 13, 0, 0, 0), //fairly strong hull
    BUMBLEBEE(20, 1, 2, 2, 15, 1, 0, 0), //same hull strength as firefly
    BEETLE(50, 0, 1, 1, 14, 3, 0, 0), //weak hull
    HORNET(20, 3, 2, 1, 16, 2, 0, 0), //fairly strong hull
    GRASSHOPPER(30, 2, 2, 3, 15, 3, 0, 0),
    TERMITE(60, 1, 3, 2, 13, 3, 0, 0), //strong hull
    WASP(35, 3, 2, 2, 14, 3, 0, 0); //strong hull, expensive

    private final int cargoHolds;
    private final int weaponSlots;
    private final int shieldSlots;
    private final int gadgetSlots;
    private final int fuelEconomy;
    private final int crewQuarters;
    private final int basePrice;
    private final int hullHealth;

    /**
     * Constructs a ship with those stats
     * @param cargoHolds base cargo holds for the ship
     * @param weaponSlots base weapon slots for the ship
     * @param shieldSlots base shield slots for the ship
     * @param gadgetSlots base gadget slots for the ship
     * @param fuelEconomy parsecs able to be traveled per fuel tank
     * @param crewQuarters number of mercenaries able to be carried
     * @param basePrice base cost to purchase or sell ship
     * @param hullHealth base health of the ship
     */
    ShipType(int cargoHolds, int weaponSlots, int shieldSlots, int gadgetSlots, int fuelEconomy,
             int crewQuarters, int basePrice, int hullHealth) {
        this.cargoHolds = cargoHolds;
        this.weaponSlots = weaponSlots;
        this.shieldSlots = shieldSlots;
        this.gadgetSlots = gadgetSlots;
        this.fuelEconomy = fuelEconomy;
        this.crewQuarters = crewQuarters;
        this.basePrice = basePrice;
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
     * Gets the base number of weapon slots for the ship
     * @return max weapon slots of the ship
     */
    public int getWeaponSlots() {
        return weaponSlots;
    }

    /**
     * Gets the base number of shield slots for the ship
     * @return max shield slots of the ship
     */
    public int getShieldSlots() {
        return shieldSlots;
    }

    /**
     * Gets the base number of gadget slots for the ship
     * @return max gadget slots of the ship
     */
    public int getGadgetSlots() {
        return gadgetSlots;
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

    /**
     * Gets the base number of crew slots for the ship
     * @return max crew slots of the ship
     */
    public int getCrewQuarters() {
        return crewQuarters;
    }

    /**
     * Gets the base price of the ship
     * @return the base price of the ship
     */
    public int getBasePrice() {
        return basePrice;
    }
}
