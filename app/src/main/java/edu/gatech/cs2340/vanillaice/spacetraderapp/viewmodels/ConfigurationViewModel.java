package edu.gatech.cs2340.vanillaice.spacetraderapp.viewmodels;

import android.util.Log;

import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Difficulty;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Good;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Player;
import edu.gatech.cs2340.vanillaice.spacetraderapp.models.Universe;

/**
 * Handles the player creation process and subsequent checks
 */
public class ConfigurationViewModel {
    private static Player player;
    private static Universe universe;
    private MarketViewModel marketVM;

    /**
     * Creates the player based on input parameters
     * @param name player's name
     * @param difficulty selected game difficulty
     * @param pilot player's selected pilot skillpoints
     * @param fighter player's selected fighter skillpoints
     * @param trader player's selected trader skillpoints
     * @param engineer player's selected engineer skillpoints
     */
    public void createPlayer(String name, Difficulty difficulty, int pilot, int fighter, int trader, int engineer) {
        universe = new Universe();
        player = new Player(name, difficulty, pilot, fighter, trader, engineer, universe.getPlanets().get(0));
        Log.d("Player", player.toString());
        largeLog("Universe", universe.toString());
        marketVM = new MarketViewModel(player);
    }

    /**
     * Gets the player
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the universe
     * @return the universe
     */
    public Universe getUniverse() {
        return universe;
    }

    /**
     * Prints out large log numbers
     * @param tag
     * @param content
     */
    public static void largeLog(String tag, String content) {
        if (content.length() > 4000) {
            Log.d(tag, content.substring(0, 4000));
            largeLog(tag, content.substring(4000));
        } else {
            Log.d(tag, content);
        }
    }

    /**
     * Calls the buy function for the marketVM
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
    public void buyVM(int waterBuy, int furBuy, int foodBuy, int oreBuy, int gameBuy, int firearmBuy, int medicineBuy, int machineBuy, int narcoticBuy, int robotBuy) {
        marketVM.buy(waterBuy, furBuy, foodBuy, oreBuy, gameBuy, firearmBuy, medicineBuy, machineBuy, narcoticBuy, robotBuy);
    }

    /**
     * Calls the sell function for the marketVM
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
    public void sellVM(int waterSold, int furSold, int foodSold, int oreSold, int gameSold, int firearmSold, int medicineSold, int machineSold, int narcoticSold, int robotSold) {
        marketVM.sell(waterSold, furSold, foodSold, oreSold, gameSold, firearmSold, medicineSold, machineSold, narcoticSold, robotSold);
    }

    /**
     * Returns the player's current credits
     * @param player current player
     * @return player's credits
     */
    public int getPlayerCredits(Player player) {
        return player.getCredits();
    }

    /**
     * Returns the amount of a good in cargo
     * @param good good to be checked
     * @return amount of that good currently in cargo
     */
    public int getGoodInCargo(Good good) {
        return player.getShip().getGood(good);
    }

    /**
     * Calls the isBuyable function for the marketVM
     * @param good
     * @return if the good is buyable
     */
    public boolean isBuyableConfig(Good good) {
        return marketVM.isBuyable(good);
    }

    /**
     * Calls the isSellable function for the marketVM
     * @param good
     * @return if the good is sellable
     */
    public boolean isSellableConfig(Good good) {
        return marketVM.isSellable(good);
    }
}
