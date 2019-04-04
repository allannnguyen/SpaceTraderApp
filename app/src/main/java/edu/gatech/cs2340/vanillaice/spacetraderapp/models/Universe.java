package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
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
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Charles The Red", 1, 1, Technology.PREAGRICULTURAL,
                Resource.WARLIKE));
        planets.add(new Planet("Wrangler", (3*9) + 3, 10*3, Technology.AGRICULTURAL,
                Resource.RICHSOIL));
        planets.add(new Planet("Yojimbo", (3*4) + 1, 10*3, Technology.MEDIEVAL,
                Resource.RICHFAUNA));
        planets.add(new Planet("Cobaltea", 5*5, 10*3, Technology.RENAISSANCE, Resource.ARTISTIC));
        planets.add(new Planet("Super-Fun-Time-Land", (4*4) + 1, 10*2, Technology.EARLYINDUSTRIAL,
                Resource.WEIRDMUSHROOMS));
        planets.add(new Planet("Streron R2Y", 4*4, 10, Technology.INDUSTRIAL,
                Resource.MINERALRICH));
        planets.add(new Planet("Cendicarro", (4*4) + 1, 10 + 1, Technology.POSTINDUSTRIAL,
                Resource.MINERALPOOR));
        planets.add(new Planet("Nunvolla", 5*5, (10 *2) + 2, Technology.HITECH,
                Resource.LOTSOFWATER));
        planets.add(new Planet("Laewei", 9, 10*3, Technology.PREAGRICULTURAL, Resource.LIFELESS));
        planets.add(new Planet("Huthone", 5*3, 4, Technology.AGRICULTURAL, Resource.LOTSOFHERBS));
        planets.add(new Planet("Besars", (5*2) +1, 1, Technology.MEDIEVAL, Resource.DESERT));
        planets.add(new Planet("Gninda 9D3", (4*4) + 3, 5*3, Technology.RENAISSANCE,
                Resource.NOSPECIALRESOURCES));
        planets.add(new Planet("Cusurn", 3 * 10, 5 * 5, Technology.EARLYINDUSTRIAL,
                Resource.MINERALPOOR));
        planets.add(new Planet("Choivis", 10, (5 * 5) + 1, Technology.INDUSTRIAL,
                Resource.POORSOIL));
        planets.add(new Planet("Gara DPX", 2 * 10, 6 * 3, Technology.POSTINDUSTRIAL,
                Resource.NOSPECIALRESOURCES));
        planets.add(new Planet("Broanus", 3 * 5, 9, Technology.HITECH, Resource.MINERALRICH));
        planets.add(new Planet("Gunkilia", (10*3) -1, (10*3) -1, Technology.HITECH,
                Resource.WARLIKE));
        planets.add(new Planet("Bralatune", (5*5) + 1, 7 * 2, Technology.POSTINDUSTRIAL,
                Resource.ARTISTIC));
        planets.add(new Planet("Ebbichi", 6 * 4, 6, Technology.INDUSTRIAL, Resource.LOTSOFWATER));
        planets.add(new Planet("Xamecarro", 9, (10*3) -1, Technology.MEDIEVAL,
                Resource.WEIRDMUSHROOMS));
        planets.add(new Planet("Lichetune", 6 * 3, 10 + 1, Technology.HITECH,
                Resource.NOSPECIALRESOURCES));
        planets.add(new Planet("Brichi 8X5", 5, 10 + 3, Technology.POSTINDUSTRIAL,
                Resource.RICHSOIL));
        tenplanets = new ArrayList<>();
        Random planetRandom = new Random();
        for (int i = 0; i < 10; i++) {
            int random = planetRandom.nextInt(planets.size());
            tenplanets.add(planets.get(random));
            planets.remove(random);
        }
    }

    /**
     * Gets the list of planets in the universe
     * @return a list of planets contained within the universe
     */
    public List<Planet> getPlanets() {
        return Collections.unmodifiableList(tenplanets);
    }
}
