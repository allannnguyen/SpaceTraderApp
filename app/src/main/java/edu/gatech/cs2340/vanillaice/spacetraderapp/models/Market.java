package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents the marketplace of a planet.
 */
public class Market implements Serializable {
    private final Technology techLevel;
    private final Resource resourceLevel;
    private final Map<Good, Boolean> goodsBuy;
    private final Map<Good, Boolean> goodsSell;

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

        for (Good good : Good.values()) {
            goodsBuy.put(good, false);
            goodsSell.put(good, false);

            // If they can produce, they can buy and sell
            if (techLevel.ordinal() >= good.getMtlp()) {
                goodsBuy.put(good, true);
                goodsSell.put(good, true);

            // if they can use, they can buy but not sell
            } else if (techLevel.ordinal() >= good.getMtlu()) {
                //goodsBuy.put(good, false);
                goodsSell.put(good, true);
            }
        }
    }

    /**
     * Gets the sell status of a good.
     * @param good The good whose sell status is being checked.
     * @return True if the good is sellable. False otherwise.
     */
    public boolean getGoodsSell(Good good) {
        return goodsSell.get(good);
    }

    /**
     * Gets the buy status of a good.
     * @param good The good whose buy status is being checked
     * @return True if the good is buyable. False otherwise.
     */
    public boolean getGoodsBuy(Good good) {
        return goodsBuy.get(good);
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
                return (good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) / 2;
            } else if (resourceLevel == Resource.DESERT) {
                return ((good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) * 3) / 2;
            }
        } else if (good == Good.FURS) {
            if (resourceLevel == Resource.RICHFAUNA) {
                return (good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) / 2;
            } else if (resourceLevel == Resource.LIFELESS) {
                return ((good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) * 3) / 2;
            }
        } else if (good == Good.FOOD) {
            if (resourceLevel == Resource.RICHSOIL) {
                return (good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) / 2;
            } else if (resourceLevel == Resource.POORSOIL) {
                return ((good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) * 3) / 2;
            }
        } else if (good == Good.ORE) {
            if (resourceLevel == Resource.MINERALRICH) {
                return (good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) / 2;
            } else if (resourceLevel == Resource.MINERALPOOR) {
                return ((good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) * 3) / 2;
            }
        } else if (good == Good.GAMES) {
            if (resourceLevel == Resource.ARTISTIC) {
                return (good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) / 2;
            }
        } else if (good == Good.FIREARMS) {
            if (resourceLevel == Resource.WARLIKE) {
                return (good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) / 2;
            }
        } else if (good == Good.MEDICINE) {
            if (resourceLevel == Resource.LOTSOFHERBS) {
                return (good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) / 2;
            }
        } else if (good == Good.NARCOTICS) {
            if (resourceLevel == Resource.WEIRDMUSHROOMS) {
                return (good.getBasePrice() + (good.getIpl() * (techLevel.ordinal()
                        - good.getMtlp()))) / 2;
            }
        }

        return good.getBasePrice() + (good.getIpl() * (techLevel.ordinal() - good.getMtlp()));
    }
}