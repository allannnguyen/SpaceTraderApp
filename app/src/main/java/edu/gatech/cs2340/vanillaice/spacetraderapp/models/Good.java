package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

public enum Good {
    WATER(0, 0, 2, 30, 3, 4, 30, 50),
    FURS(0, 0, 0, 250, 10, 10, 2300, 280),
    FOOD(1, 0, 1, 100, 5, 5, 90, 160),
    ORE(2, 2, 3, 350, 20, 10, 350, 420),
    GAMES(3, 1, 6, 250, -10, 5, 160, 270),
    FIREARMS(3, 1, 5, 1250, -75, 100, 600, 1100),
    MEDICINE(4, 1, 6, 650, -20, 10, 400, 700),
    MACHINES(4, 3, 5, 900, -30, 5, 600, 800),
    NARCOTICS(5, 0, 5, 3500, -125, 150, 2000, 3000),
    ROBOTS(6, 4, 7, 5000, -150, 100, 3500, 5000);

    private int basePrice;
    private int mtlp;
    private int mtlu;
    private int ttp;
    private int ipl;
    private int var;
    private int mtl;
    private int mth;

    /**
     *
     * @param basePrice the base price before calculation
     * @param mtlp Minimum Tech Level to Produce this resource
     * @param mtlu Minimum Tech Level to Use this resource
     * @param ttp Tech Level which produces the most of this item
     * @param ipl Price increase per tech level
     * @param var variance is the maximum percentage that the price can vary above or below the base
     * @param mtl Min price offered in space trade with random trader
     * @param mth Max price offered in space trade with random trader
     */
    Good(int mtlp, int mtlu, int ttp, int basePrice, int ipl, int var, int mtl, int mth) {
        this.basePrice = basePrice;
        this.mtlp = mtlp;
        this.mtlu = mtlu;
        this.ttp = ttp;
        this.ipl = ipl;
        this.var = var;
        this.mtl = mtl;
        this.mth = mth;
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
     * Gets the tech level which produces the most of this resource
     * @return tech level which produces the most
     */
    public int getTtp() {
        return ttp;
    }

    /**
     * Gets the price increase per tech level
     * @return price increase per tech level
     */
    public int getIpl() {
        return ipl;
    }

    /**
     * Gets the variance which is the maximum percentage that the price can
     * vary above or below the base
     * @return variance
     */
    public int getVar() {
        return var;
    }

    /**
     * Gets the minimum price offered in space trade with a random trader
     * @return min price offered in random space trade
     */
    public int getMtl() {
        return mtl;
    }

    /**
     * Gets the max price offered in space trade with a random trader
     * @return max price offered in random space trade
     */
    public int getMth() {
        return mth;
    }
}
