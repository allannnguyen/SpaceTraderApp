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
            if (techLevel.ordinal() >= getMtlp(good)) {
                goodsBuy.put(good, true);
                goodsSell.put(good, true);

            // if they can use, they can buy but not sell
            } else if (techLevel.ordinal() >= getMtlu(good)) {
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
        Object value = goodsSell.get(good);
        return (value != null) && ((boolean) value);
    }

    /**
     * Gets the buy status of a good.
     * @param good The good whose buy status is being checked
     * @return True if the good is buyable. False otherwise.
     */
    public boolean getGoodsBuy(Good good) {
        Object value = goodsBuy.get(good);
        if (value != null) {
            return (boolean) value;
        } else {
            return false;
        }    }

    /**
     * Calculates the price of a good.
     *
     * @param good The good whose price is being calculated.
     * @return The price of the good
     */
    public int getPrice(Good good) {
        Map<Good, Resource[]> hash = new HashMap<>();
        hash.put(Good.WATER, new Resource[] {Resource.LOTSOFWATER, Resource.DESERT});
        hash.put(Good.FURS, new Resource[] {Resource.RICHFAUNA, Resource.LIFELESS});
        hash.put(Good.FOOD, new Resource[] {Resource.RICHSOIL, Resource.POORSOIL});
        hash.put(Good.ORE, new Resource[] {Resource.MINERALRICH, Resource.MINERALPOOR});
        hash.put(Good.GAMES, new Resource[] {Resource.ARTISTIC});
        hash.put(Good.FIREARMS, new Resource[] {Resource.WARLIKE});
        hash.put(Good.MEDICINE, new Resource[] {Resource.LOTSOFHERBS});
        hash.put(Good.NARCOTICS, new Resource[] {Resource.WEIRDMUSHROOMS});

        Resource[] source = hash.get(good);
        if (source != null) {
            if ((source.length == 1) && (resourceLevel == source[0])) {
                return (getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) / 2;
            } else if ((source.length == 2) && (resourceLevel == source[1])) {
                return ((getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) * 3) / 2;
            }
        }

        return getBasePrice(good) + (getIpl(good) * (techLevel.ordinal() - getMtlp(good)));

        /*
        if (good == Good.WATER) {
            if (resourceLevel == Resource.LOTSOFWATER) {
                return (getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) / 2;
            } else if (resourceLevel == Resource.DESERT) {
                return ((getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) * 3) / 2;
            }
        } else if (good == Good.FURS) {
            if (resourceLevel == Resource.RICHFAUNA) {
                return (getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) / 2;
            } else if (resourceLevel == Resource.LIFELESS) {
                return ((getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) * 3) / 2;
            }
        } else if (good == Good.FOOD) {
            if (resourceLevel == Resource.RICHSOIL) {
                return (getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) / 2;
            } else if (resourceLevel == Resource.POORSOIL) {
                return ((getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) * 3) / 2;
            }
        } else if (good == Good.ORE) {
            if (resourceLevel == Resource.MINERALRICH) {
                return (getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) / 2;
            } else if (resourceLevel == Resource.MINERALPOOR) {
                return ((getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) * 3) / 2;
            }
        } else if (good == Good.GAMES) {
            if (resourceLevel == Resource.ARTISTIC) {
                return (getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - good.getMtlp()))) / 2;
            }
        } else if (good == Good.FIREARMS) {
            if (resourceLevel == Resource.WARLIKE) {
                return (getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) / 2;
            }
        } else if (good == Good.MEDICINE) {
            if (resourceLevel == Resource.LOTSOFHERBS) {
                return (getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) / 2;
            }
        } else if (good == Good.NARCOTICS) {
            if (resourceLevel == Resource.WEIRDMUSHROOMS) {
                return (getBasePrice(good) + (getIpl(good) * (techLevel.ordinal()
                        - getMtlp(good)))) / 2;
            }
        }

        return getBasePrice(good) + (getIpl(good) * (techLevel.ordinal() - getMtlp(good)));*/
    }

    /**
     * Gets the price increase per tech level
     * @return price increase per tech level
     */
    private int getIpl(Good good) {
        return good.getIpl();
    }

    /**
     * Gets the base price of the resource
     * @return base price
     */
    private int getBasePrice(Good good) {
        return good.getBasePrice();
    }

    /**
     * Gets the minimum tech level to produce this resource
     * @return minimum tech level to produce
     */
    private int getMtlp(Good good) {
        return good.getMtlp();
    }

    /**
     * Gets the minimum tech level to use this resource
     * @return minimum tech level to use
     */
    private int getMtlu(Good good) {
        return good.getMtlu();
    }
}

