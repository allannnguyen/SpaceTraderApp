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
        total += market.getPrice(Good.WATER) * waterBuy;
        total += market.getPrice(Good.FURS) * furBuy;
        total += market.getPrice(Good.FOOD) * foodBuy;
        total += market.getPrice(Good.ORE) * oreBuy;
        total += market.getPrice(Good.GAMES) * gameBuy;
        total += market.getPrice(Good.FIREARMS) * firearmBuy;
        total += market.getPrice(Good.MEDICINE) * medicineBuy;
        total += market.getPrice(Good.MACHINES) * machineBuy;
        total += market.getPrice(Good.NARCOTICS) * narcoticBuy;
        total += market.getPrice(Good.ROBOTS) * robotBuy;

        if (total <= player.getCredits()) {
            ship.setGood(Good.WATER, ship.getGood(Good.WATER) + waterBuy);
            ship.setGood(Good.FURS, ship.getGood(Good.FURS) + furBuy);
            ship.setGood(Good.FOOD, ship.getGood(Good.FOOD) + foodBuy);
            ship.setGood(Good.ORE, ship.getGood(Good.ORE) + oreBuy);
            ship.setGood(Good.GAMES, ship.getGood(Good.GAMES) + gameBuy);
            ship.setGood(Good.FIREARMS, ship.getGood(Good.FIREARMS) + firearmBuy);
            ship.setGood(Good.MEDICINE, ship.getGood(Good.MEDICINE) + medicineBuy);
            ship.setGood(Good.MACHINES, ship.getGood(Good.MACHINES) + machineBuy);
            ship.setGood(Good.NARCOTICS, ship.getGood(Good.NARCOTICS) + narcoticBuy);
            ship.setGood(Good.ROBOTS, ship.getGood(Good.ROBOTS) + robotBuy);
            player.setCredits(player.getCredits() - total);
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
        total += market.getPrice(Good.WATER) * waterSold;
        total += market.getPrice(Good.FURS) * furSold;
        total += market.getPrice(Good.FOOD) * foodSold;
        total += market.getPrice(Good.ORE) * oreSold;
        total += market.getPrice(Good.GAMES) * gameSold;
        total += market.getPrice(Good.FIREARMS) * firearmSold;
        total += market.getPrice(Good.MEDICINE) * medicineSold;
        total += market.getPrice(Good.MACHINES) * machineSold;
        total += market.getPrice(Good.NARCOTICS) * narcoticSold;
        total += market.getPrice(Good.ROBOTS) * robotSold;

        ship.setGood(Good.WATER, ship.getGood(Good.WATER) - waterSold);
        ship.setGood(Good.FURS, ship.getGood(Good.FURS) - furSold);
        ship.setGood(Good.FOOD, ship.getGood(Good.FOOD) - foodSold);
        ship.setGood(Good.ORE, ship.getGood(Good.ORE) - oreSold);
        ship.setGood(Good.GAMES, ship.getGood(Good.GAMES) - gameSold);
        ship.setGood(Good.FIREARMS, ship.getGood(Good.FIREARMS) - firearmSold);
        ship.setGood(Good.MEDICINE, ship.getGood(Good.MEDICINE) - medicineSold);
        ship.setGood(Good.MACHINES, ship.getGood(Good.MACHINES) - machineSold);
        ship.setGood(Good.NARCOTICS, ship.getGood(Good.NARCOTICS) - narcoticSold);
        ship.setGood(Good.ROBOTS, ship.getGood(Good.ROBOTS) - robotSold);

        player.setCredits(player.getCredits() + total);
    }

    /**
     * Returns the price of a good from the current market
     * @param good the good to check
     * @return the good's price at this market
     */
    public int getGoodPrice(Good good) {
        return market.getPrice(good);
    }
}
