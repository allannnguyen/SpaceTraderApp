package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import java.util.HashMap;

/**
 * Represents the marketplace of a planet.
 */
public class Market {
    private Technology techLevel;
    private Resource resourceLevel;
    private HashMap<Good, Boolean> goodsBuy;
    private HashMap<Good, Boolean> goodsSell;
    private HashMap<Good, Integer> goodsPrice;

    /**
     * Creates an instance of a planet's marketplace.
     *
     * @param techLevel The technology level of the market's planet.
     * @param resourceLevel The resource level of the market's planet.
     */
    public Market(Technology techLevel, Resource resourceLevel) {
        this.techLevel = techLevel;
        this.resourceLevel = resourceLevel;
        this.goodsBuy = new HashMap<>();
        this.goodsSell = new HashMap<>();
        this.goodsPrice = new HashMap<>();

        for (Good good : Good.values()) {
            // If they can produce, they can buy and sell
            if (techLevel.ordinal() >= good.getMtlp()) {
                goodsBuy.put(good, true);
                goodsSell.put(good, true);

            // if they can use, they can buy but not sell
            } else if (techLevel.ordinal() >= good.getMtlu()) {
                goodsBuy.put(good, true);
                goodsSell.put(good, false);
            }

            goodsPrice.put(good, getPrice(good));
        }
    }

    /**
     * Calculates the price of a good.
     *
     * @param good The good whose price is being calculated.
     * @return The price of the good
     */
    public int getPrice(Good good) {
        // base price * (IPL * (PTL - MTLP)) + variance
        return good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp())) + good.getVar();
    }

    /**
     * Performs the buy action
     */
    public void buy(int waterBuy, int furBuy, int foodBuy, int oreBuy, int gameBuy,
                    int firearmBuy, int medicineBuy, int machineBuy, int narcoticBuy
                    , int robotBuy) {

    }

    /**
     * Performs the sell action
     */
    public void sell(int waterSold, int furSold, int foodSold, int oreSold, int gameSold,
                     int firearmSold, int medicineSold, int machineSold, int narcoticSold
                    , int robotSold) {

    }
}