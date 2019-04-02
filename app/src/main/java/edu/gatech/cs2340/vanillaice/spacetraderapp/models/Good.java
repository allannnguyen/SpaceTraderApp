package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

/**
 * Represents each good available to trade in the game
 */
public enum Good {
    WATER(0, 0, 30, 3),
    FURS(0, 0, 250, 10),
    FOOD(1, 0, 100, 5),
    ORE(2, 2, 350, 20),
    GAMES(3, 1, 250, -10),
    FIREARMS(3, 1, 1250, -75),
    MEDICINE(4, 1, 650, -20),
    MACHINES(4, 3, 900, -30),
    NARCOTICS(5, 0, 3500, -125),
    ROBOTS(6, 4, 5000, -150);

    private final int basePrice;
    private final int mtlp;
    private final int mtlu;
    private final int ipl;

    /**
     * Constructs an individual good's stats
     * @param basePrice the base price before calculation
     * @param mtlp Minimum Tech Level to Produce this resource
     * @param mtlu Minimum Tech Level to Use this resource
     * @param ipl Price increase per tech level
     */
    Good(int mtlp, int mtlu, int basePrice, int ipl) {
        this.basePrice = basePrice;
        this.mtlp = mtlp;
        this.mtlu = mtlu;
        this.ipl = ipl;
    }

    /**
     * Gets the base price of the resource
     * @return base price
     */
    public int getBasePrice() {
        return basePrice;
    }

    /**
     * Gets the minimum tech level to produce this resource
     * @return minimum tech level to produce
     */
    public int getMtlp() {
        return mtlp;
    }

    /**
     * Gets the minimum tech level to use this resource
     * @return minimum tech level to use
     */
    public int getMtlu() {
        return mtlu;
    }

    /**
     * Gets the price increase per tech level
     * @return price increase per tech level
     */
    public int getIpl() {
        return ipl;
    }
}
