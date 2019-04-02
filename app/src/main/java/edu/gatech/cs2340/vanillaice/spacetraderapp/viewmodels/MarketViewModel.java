package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;


import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Good;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Market;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Ship;
import java.io.Serializable;

/**
 * Handles the creation of each planet's market and trade actions.
 */
public class MarketViewModel implements Serializable {
    private final Player player;
    private final Ship ship;
    private final Market market;

    /**
     * Constructor for the MarketViewModel
     * @param player The player whose is at the market.
     */
    public MarketViewModel(Player player) {
        this.player = player;
        this.ship = player.getShip();
        this.market = player.getMarket();
    }

    /**
     * Purchases items if player has enough credits
     * @param waterBuy quantity of water bought
     * @param furBuy quantity of fur bought
     * @param foodBuy quantity of food bought
     * @param oreBuy quantity of ore bought
     * @param gameBuy quantity of game bought
     * @param firearmBuy quantity of firearm bought
     * @param medicineBuy quantity of medicine bought
     * @param machineBuy quantity of machine bought
     * @param narcoticBuy quantity of narcotic bought
     * @param robotBuy quantity of robot bought
     */
    public void buy(int waterBuy, int furBuy, int foodBuy, int oreBuy, int gameBuy,
                    int firearmBuy, int medicineBuy, int machineBuy, int narcoticBuy
            , int robotBuy) {
        int total = 0;
        total += getGoodPrice(Good.WATER) * waterBuy;
        total += getGoodPrice(Good.FURS) * furBuy;
        total += getGoodPrice(Good.FOOD) * foodBuy;
        total += getGoodPrice(Good.ORE) * oreBuy;
        total += getGoodPrice(Good.GAMES) * gameBuy;
        total += getGoodPrice(Good.FIREARMS) * firearmBuy;
        total += getGoodPrice(Good.MEDICINE) * medicineBuy;
        total += getGoodPrice(Good.MACHINES) * machineBuy;
        total += getGoodPrice(Good.NARCOTICS) * narcoticBuy;
        total += getGoodPrice(Good.ROBOTS) * robotBuy;

        if (total <= player.getCredits()) {
            setGood(Good.WATER, getGoodQuantity(Good.WATER) + waterBuy);
            setGood(Good.FURS, getGoodQuantity(Good.FURS) + furBuy);
            setGood(Good.FOOD, getGoodQuantity(Good.FOOD) + foodBuy);
            setGood(Good.ORE, getGoodQuantity(Good.ORE) + oreBuy);
            setGood(Good.GAMES, getGoodQuantity(Good.GAMES) + gameBuy);
            setGood(Good.FIREARMS, getGoodQuantity(Good.FIREARMS) + firearmBuy);
            setGood(Good.MEDICINE, getGoodQuantity(Good.MEDICINE) + medicineBuy);
            setGood(Good.MACHINES, getGoodQuantity(Good.MACHINES) + machineBuy);
            setGood(Good.NARCOTICS, getGoodQuantity(Good.NARCOTICS) + narcoticBuy);
            setGood(Good.ROBOTS, getGoodQuantity(Good.ROBOTS) + robotBuy);
            setCredits(getCredits() - total);
        }
    }

    /**
     * Checks if a good is able to be bought at the current market
     * @param good the good to check
     * @return if the good is buyable
     */
    public boolean isBuyable(Good good) {
        return market.getGoodsBuy(good);
    }

    /**
     * Checks if a good is able to be sold at the current market
     * @param good the good to check
     * @return if the good is sellable
     */
    public boolean isSellable(Good good) {
        return market.getGoodsSell(good);
    }

    /**
     * Gets the player's current credits
     * @return amount of player's credits
     */
    public int getPlayerCredits() {
        return player.getCredits();
    }

    /**
     * Returns the amount of cargo space left in the ship
     * @return empty cargo space remaining
     */
    public int getCargoSpace() {
        return ship.getCargoSpace();
    }

    /**
     * Gets the quantity of a good in the ship's cargo
     * @param good the good to check
     * @return quantity of good currently in cargo
     */
    public int getGoodQuantity(Good good) {
        return ship.getGood(good);
    }

    /**
     * Sells items of players
     * @param waterSold the quantity of water sold
     * @param furSold the quantity of fur sold
     * @param foodSold the quantity of food sold
     * @param oreSold the quantity of ore sold
     * @param gameSold the quantity of game sold
     * @param firearmSold the quantity of firearm sold
     * @param medicineSold the quantity of medicine sold
     * @param machineSold the quantity of machine sold
     * @param narcoticSold the quantity of narcotic sold
     * @param robotSold the quantity of robot sold
     */
    public void sell(int waterSold, int furSold, int foodSold, int oreSold, int gameSold,
                     int firearmSold, int medicineSold, int machineSold, int narcoticSold
            , int robotSold) {
        int total = 0;
        total += getGoodPrice(Good.WATER) * waterSold;
        total += getGoodPrice(Good.FURS) * furSold;
        total += getGoodPrice(Good.FOOD) * foodSold;
        total += getGoodPrice(Good.ORE) * oreSold;
        total += getGoodPrice(Good.GAMES) * gameSold;
        total += getGoodPrice(Good.FIREARMS) * firearmSold;
        total += getGoodPrice(Good.MEDICINE) * medicineSold;
        total += getGoodPrice(Good.MACHINES) * machineSold;
        total += getGoodPrice(Good.NARCOTICS) * narcoticSold;
        total += getGoodPrice(Good.ROBOTS) * robotSold;

        setGood(Good.WATER, getGoodQuantity(Good.WATER) - waterSold);
        setGood(Good.FURS, getGoodQuantity(Good.FURS) - furSold);
        setGood(Good.FOOD, getGoodQuantity(Good.FOOD) - foodSold);
        setGood(Good.ORE, getGoodQuantity(Good.ORE) - oreSold);
        setGood(Good.GAMES, getGoodQuantity(Good.GAMES) - gameSold);
        setGood(Good.FIREARMS, getGoodQuantity(Good.FIREARMS) - firearmSold);
        setGood(Good.MEDICINE, getGoodQuantity(Good.MEDICINE) - medicineSold);
        setGood(Good.MACHINES, getGoodQuantity(Good.MACHINES) - machineSold);
        setGood(Good.NARCOTICS, getGoodQuantity(Good.NARCOTICS) - narcoticSold);
        setGood(Good.ROBOTS, getGoodQuantity(Good.ROBOTS) - robotSold);

        setCredits(getCredits() + total);
    }

    /**
     * Returns the price of a good from the current market
     * @param good the good to check
     * @return the good's price at this market
     */
    public int getGoodPrice(Good good) {
        return market.getPrice(good);
    }

    /**
     * Sets the quantity of a good from the current market
     * @param good the good to change
     * @param quantity the good's quantity
     */
    private void setGood(Good good, int quantity) {
        ship.setGood(good, quantity);
    }

    /**
     * Sets the amount of credits player has
     * @param credit amount of credits
     */
    private void setCredits(int credit) {
       player.setCredits(credit);
    }

    /**
     * Gets the player's credits.
     * @return The player's credits.
     */
    private int getCredits() {
        return player.getCredits();
    }
}
