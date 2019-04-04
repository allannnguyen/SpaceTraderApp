package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;


import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Good;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Market;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Ship;
import java.io.Serializable;
import java.util.HashMap;

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
     * @param goodsinCart amount of each good to be bought
     */
    public void buy(HashMap<Good, Integer> goodsinCart) {

        int total = 0;
        for (Good good: Good.values()) {
            total += getGoodPrice(good) * goodsinCart.get(good);
        }

        if (total <= player.getCredits()) {
            for (Good good: Good.values()) {
                setGood(good, getGoodQuantity(good) + goodsinCart.get(good));
            }
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
     * @param goodstoSell hashmap of all the goods and how many to sell
     */
    public void sell(HashMap<Good, Integer> goodstoSell) {
        int total = 0;
        for (Good good: Good.values()) {
            total += getGoodPrice(good) * goodstoSell.get(good);
            setGood(good, getGoodQuantity(good) - goodstoSell.get(good));
        }

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

    /**
     * Gets the Player
     * @return Player
     */
    public Player getPlayer() {
        return player;
    }
}
