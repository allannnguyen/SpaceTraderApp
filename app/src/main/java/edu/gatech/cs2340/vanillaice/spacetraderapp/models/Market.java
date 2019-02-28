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
     * Gets the hash map of sellable goods
     * @return hash map of sellable goods
     */
    public HashMap<Good, Boolean> getGoodsSell() {
        return goodsSell;
    }

    /**
     * Gets the hash map of buyable goods
     * @return hash map of buyable goods
     */
    public HashMap<Good, Boolean> getGoodsBuy() {
        return goodsBuy;
    }

    /**
     * Calculates the price of a good.
     *
     * @param good The good whose price is being calculated.
     * @return The price of the good
     */
    public int getPrice(Good good) {
        if (good == Good.WATER) {
            if (resourceLevel == Resource.LOTSOFWATER) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 1 / 2;
            } else if (resourceLevel == Resource.DESERT) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 3 / 2;
            }
        } else if (good == Good.FURS) {
            if (resourceLevel == Resource.RICHFAUNA) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 1 / 2;
            } else if (resourceLevel == Resource.LIFELESS) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 3 / 2;
            }
        } else if (good == Good.FOOD) {
            if (resourceLevel == Resource.RICHSOIL) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 1 / 2;
            } else if (resourceLevel == Resource.POORSOIL) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 3 / 2;
            }
        } else if (good == Good.ORE) {
            if (resourceLevel == Resource.MINERALRICH) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 1 / 2;
            } else if (resourceLevel == Resource.MINERALPOOR) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 3 / 2;
            }
        } else if (good == Good.GAMES) {
            if (resourceLevel == Resource.ARTISTIC) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 1 / 2;
            }
        } else if (good == Good.FIREARMS) {
            if (resourceLevel == Resource.WARLIKE) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 1 / 2;
            }
        } else if (good == Good.MEDICINE) {
            if (resourceLevel == Resource.LOTSOFHERBS) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 1 / 2;
            }
        } else if (good == Good.NARCOTICS) {
            if (resourceLevel == Resource.WEIRDMUSHROOMS) {
                return (good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()))) * 1 / 2;
            }
        }

        return good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp()));
    }
}