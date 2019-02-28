package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import java.util.HashMap;

public class Market {
    private Technology techLevel;
    private Resource resourceLevel;
    private HashMap<Good, Boolean> goodsBuy;
    private HashMap<Good, Boolean> goodsSell;
    private HashMap<Good, Integer> goodsPrice;

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

    public int getPrice(Good good) {
        // base price * (IPL * (PTL - MTLP)) + variance
        return good.getBasePrice() * (good.getIpl() * (techLevel.ordinal() - good.getMtlp())) + good.getVar();
    }

    public void exchange() {

    }
}