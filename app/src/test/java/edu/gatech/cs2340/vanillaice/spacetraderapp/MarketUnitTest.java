package edu.gatech.cs2340.vanillaice.spacetraderapp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Good;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Market;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Resource;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Technology;

import static org.junit.Assert.*;

public class MarketUnitTest {
    private Good[] goods;

    @Before
    public void setUp() {
        goods = Good.values();
    }

    @Test (expected = IllegalArgumentException.class)
    public void testConstructorTechLevelExceptions() {
        new Market(null, Resource.ARTISTIC);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testConstructorResourceLevelExceptions() {
        new Market(Technology.AGRICULTURAL, null);
    }
    @Test
    public void testConstructorBuyableGoods() {
        Market market1 = new Market(Technology.PREAGRICULTURAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 2; i++) {
            Assert.assertTrue("The market technology level is "
                    + market1.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be true", market1.getGoodsBuy(goods[i]));
        }
        for (int i = 2; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market1.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be false", !market1.getGoodsBuy(goods[i]));
        }

        Market market2 = new Market(Technology.AGRICULTURAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 3; i++) {
            Assert.assertTrue("The market technology level is "
                    + market2.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be true", market2.getGoodsBuy(goods[i]));
        }
        for (int i = 3; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market2.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be false", !market2.getGoodsBuy(goods[i]));
        }
        Market market3 = new Market(Technology.MEDIEVAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 4; i++) {
            Assert.assertTrue("The market technology level is "
                    + market3.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be true", market3.getGoodsBuy(goods[i]));
        }
        for (int i = 4; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market3.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be false", !market3.getGoodsBuy(goods[i]));
        }
        Market market4 = new Market(Technology.RENAISSANCE, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 6; i++) {
            Assert.assertTrue("The market technology level is "
                    + market4.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be true", market4.getGoodsBuy(goods[i]));
        }
        for (int i = 6; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market4.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be false", !market4.getGoodsBuy(goods[i]));
        }
        Market market5 = new Market(Technology.EARLYINDUSTRIAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 8; i++) {
            Assert.assertTrue("The market technology level is "
                    + market5.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be true", market5.getGoodsBuy(goods[i]));
        }
        for (int i = 8; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market5.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be false", !market5.getGoodsBuy(goods[i]));
        }
        Market market6 = new Market(Technology.INDUSTRIAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 9; i++) {
            Assert.assertTrue("The market technology level is "
                    + market6.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be true", market6.getGoodsBuy(goods[i]));
        }
        for (int i = 9; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market6.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be false", !market6.getGoodsBuy(goods[i]));
        }
        Market market7 = new Market(Technology.POSTINDUSTRIAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 10; i++) {
            Assert.assertTrue("The market technology level is "
                    + market7.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be true", market7.getGoodsBuy(goods[i]));
        }
        for (int i = 10; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market7.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be false", !market7.getGoodsBuy(goods[i]));
        }
        Market market8 = new Market(Technology.HITECH, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 10; i++) {
            Assert.assertTrue("The market technology level is "
                    + market8.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be true", market8.getGoodsBuy(goods[i]));
        }
        for (int i = 10; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market8.getTechLevel().ordinal() + ", the good minimum level to produce is "
                    + goods[i].getMtlp() + ". It should be false", !market8.getGoodsBuy(goods[i]));
        }
    }

    @Test
    public void testConstructorSellableGoods() {
        Market market1 = new Market(Technology.PREAGRICULTURAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 3; i++) {
            Assert.assertTrue("The market technology level is "
                    + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be true", market1.getGoodsSell(goods[i]));
        }
        for (int i = 3; i < 8; i++) {
            Assert.assertTrue("The market technology level is "
                    + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be false", !market1.getGoodsSell(goods[i]));
        }
        Assert.assertTrue("The market technology level is "
                + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                + Good.NARCOTICS.getMtlu() + ". It should be true",
                market1.getGoodsSell(Good.NARCOTICS));
        Assert.assertTrue("The market technology level is "
                + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                + Good.ROBOTS.getMtlu() + ". It should be false", !market1.getGoodsSell(Good.ROBOTS));


        Market market2 = new Market(Technology.AGRICULTURAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 3; i++) {
            Assert.assertTrue("The market technology level is "
                    + market2.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be false", market2.getGoodsSell(goods[i]));
        }

        for (int i = 4; i < 7; i++) {
            Assert.assertTrue("The market technology level is "
                    + market2.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be false", market2.getGoodsSell(goods[i]));
        }
        Assert.assertTrue("The market technology level is "
                        + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                        + Good.NARCOTICS.getMtlu() + ". It should be true",
                market1.getGoodsSell(Good.NARCOTICS));
        Assert.assertTrue("The market technology level is "
                + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                + Good.MACHINES.getMtlu() + ". It should be false", !market1.getGoodsSell(Good.MACHINES));
        Assert.assertTrue("The market technology level is "
                + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                + Good.ROBOTS.getMtlu() + ". It should be false", !market1.getGoodsSell(Good.ROBOTS));


        Market market3 = new Market(Technology.MEDIEVAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 7; i++) {
            Assert.assertTrue("The market technology level is "
                    + market3.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be false", market3.getGoodsSell(goods[i]));
        }
        Assert.assertTrue("The market technology level is "
                        + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                        + Good.NARCOTICS.getMtlu() + ". It should be true",
                market1.getGoodsSell(Good.NARCOTICS));
        Assert.assertTrue("The market technology level is "
                + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                + Good.MACHINES.getMtlu() + ". It should be false", !market1.getGoodsSell(Good.MACHINES));
        Assert.assertTrue("The market technology level is "
                + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                + Good.ROBOTS.getMtlu() + ". It should be false", !market1.getGoodsSell(Good.ROBOTS));


        Market market4 = new Market(Technology.RENAISSANCE, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < 8; i++) {
            Assert.assertTrue("The market technology level is "
                    + market4.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be false", market4.getGoodsSell(goods[i]));
        }
        Assert.assertTrue("The market technology level is "
                        + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                        + Good.NARCOTICS.getMtlu() + ". It should be true",
                market1.getGoodsSell(Good.NARCOTICS));
        Assert.assertTrue("The market technology level is "
                + market1.getTechLevel().ordinal() + ", the good minimum level to use is "
                + Good.ROBOTS.getMtlu() + ". It should be false", !market1.getGoodsSell(Good.ROBOTS));

        Market market5 = new Market(Technology.EARLYINDUSTRIAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market5.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be false", market5.getGoodsSell(goods[i]));
        }

        Market market6 = new Market(Technology.INDUSTRIAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market6.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be false", market6.getGoodsSell(goods[i]));
        }

        Market market7 = new Market(Technology.POSTINDUSTRIAL, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market7.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be false", market7.getGoodsSell(goods[i]));
        }

        Market market8 = new Market(Technology.HITECH, Resource.NOSPECIALRESOURCES);
        for (int i = 0; i < goods.length; i++) {
            Assert.assertTrue("The market technology level is "
                    + market8.getTechLevel().ordinal() + ", the good minimum level to use is "
                    + goods[i].getMtlu() + ". It should be false", market8.getGoodsSell(goods[i]));
        }
    }
}
