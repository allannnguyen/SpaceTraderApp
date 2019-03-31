package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents the Universe the game takes place in
 * A universe has a list of randomly selected planets from all precreated options
 */
public class Universe implements Serializable {
    private final List<Planet> tenplanets;

    /**
     * Selects the planets for this game randomly from all options
     */
    public Universe() {
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Charles The Red", 1, 1, Technology.PREAGRICULTURAL,
                Resource.WARLIKE));
        planets.add(new Planet("Wrangler", 30, 30, Technology.AGRICULTURAL, Resource.RICHSOIL));
        planets.add(new Planet("Yojimbo", 13, 30, Technology.MEDIEVAL, Resource.RICHFAUNA));
        planets.add(new Planet("Cobaltea", 25, 30, Technology.RENAISSANCE, Resource.ARTISTIC));
        planets.add(new Planet("Super-Fun-Time-Land", 17, 20, Technology.EARLYINDUSTRIAL,
                Resource.WEIRDMUSHROOMS));
        planets.add(new Planet("Streron R2Y", 16, 10, Technology.INDUSTRIAL, Resource.MINERALRICH));
        planets.add(new Planet("Cendicarro", 17, 11, Technology.POSTINDUSTRIAL,
                Resource.MINERALPOOR));
        planets.add(new Planet("Nunvolla", 25, 22, Technology.HITECH, Resource.LOTSOFWATER));
        planets.add(new Planet("Laewei", 9, 30, Technology.PREAGRICULTURAL, Resource.LIFELESS));
        planets.add(new Planet("Huthone", 15, 4, Technology.AGRICULTURAL, Resource.LOTSOFHERBS));
        planets.add(new Planet("Besars", 11, 1, Technology.MEDIEVAL, Resource.DESERT));
        planets.add(new Planet("Gninda 9D3", 19, 15, Technology.RENAISSANCE,
                Resource.NOSPECIALRESOURCES));
        planets.add(new Planet("Cusurn", 30, 25, Technology.EARLYINDUSTRIAL, Resource.MINERALPOOR));
        planets.add(new Planet("Choivis", 10, 26, Technology.INDUSTRIAL, Resource.POORSOIL));
        planets.add(new Planet("Gara DPX", 20, 18, Technology.POSTINDUSTRIAL,
                Resource.NOSPECIALRESOURCES));
        planets.add(new Planet("Broanus", 15, 9, Technology.HITECH, Resource.MINERALRICH));
        planets.add(new Planet("Gunkilia", 22, 29, Technology.HITECH, Resource.WARLIKE));
        planets.add(new Planet("Bralatune", 26, 14, Technology.POSTINDUSTRIAL, Resource.ARTISTIC));
        planets.add(new Planet("Ebbichi", 24, 6, Technology.INDUSTRIAL, Resource.LOTSOFWATER));
        planets.add(new Planet("Xamecarro", 9, 29, Technology.MEDIEVAL, Resource.WEIRDMUSHROOMS));
        planets.add(new Planet("Lichetune", 18, 11, Technology.HITECH,
                Resource.NOSPECIALRESOURCES));
        planets.add(new Planet("Brichi 8X5", 5, 13, Technology.POSTINDUSTRIAL, Resource.RICHSOIL));
        tenplanets = new ArrayList<>();
        Random planetRandom = new Random();
        for (int i = 0; i < 10; i++) {
            int random = planetRandom.nextInt(planets.size());
            tenplanets.add(planets.get(random));
            planets.remove(random);
        }
    }

    /**
     * Prints a string of the planets in the universe
     *
     * @return A string of the planets in the universe
     */
    @NonNull
    public String toString() {
        String universeString = "The Universe: \n";
        for (Planet planet : tenplanets) {
            universeString += planet.toString() + "\n";
        }
        return universeString;
    }

    /**
     * Gets the list of planets in the universe
     * @return a list of planets contained within the universe
     */
    public List<Planet> getPlanets() {
        return tenplanets;
    }
}
