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
        int x1 = 1, x2 = (3*9) + 3, x3 = (3*4) + 1, x4 = 5*5, x5 = (4*4) + 1, x6 = 4*4,
                x7 = (4*4) + 1, x8 = 5*5, x9 = 9, x10 = 5*3, x11 =(5*2) +1, x12 = (4*4) + 3,
                x13 = 3 * 10, x14 = 10, x15 = 2* 10, x16 = 3*5, x17 = (10*2) + 2, x18 = (5*5) + 1,
                x19 = 6*4, x20 = 9, x21 = 6*3, x22 = 5, y1 = 1, y2 = 10*3, y3 =10*3, y4 = 10*3,
                y5 =10*2, y6 =10, y7 =10 + 1, y8 = (10*2) + 2, y9 =10*3, y10 =4, y11 =1, y12 = 5*3,
                y13 =5*5, y14 =(5*5) + 1, y15 = 6*3, y16 = 9, y17 = (10*3) -1, y18 = 7*2, y19 = 6,
                y20 = (10*3) -1, y21 =10 + 1, y22 = 10 + 3;

        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Charles The Red", x1, y1, Technology.PREAGRICULTURAL,
                Resource.WARLIKE));
        planets.add(new Planet("Wrangler", x2, y2, Technology.AGRICULTURAL, Resource.RICHSOIL));
        planets.add(new Planet("Yojimbo", x3, y3, Technology.MEDIEVAL, Resource.RICHFAUNA));
        planets.add(new Planet("Cobaltea", x4, y4, Technology.RENAISSANCE, Resource.ARTISTIC));
        planets.add(new Planet("Super-Fun-Time-Land", x5, y5, Technology.EARLYINDUSTRIAL,
                Resource.WEIRDMUSHROOMS));
        planets.add(new Planet("Streron R2Y", x6, y6, Technology.INDUSTRIAL, Resource.MINERALRICH));
        planets.add(new Planet("Cendicarro", x7, y7, Technology.POSTINDUSTRIAL,
                Resource.MINERALPOOR));
        planets.add(new Planet("Nunvolla", x8, y8, Technology.HITECH, Resource.LOTSOFWATER));
        planets.add(new Planet("Laewei", x9, y9, Technology.PREAGRICULTURAL, Resource.LIFELESS));
        planets.add(new Planet("Huthone", x10, y10, Technology.AGRICULTURAL, Resource.LOTSOFHERBS));
        planets.add(new Planet("Besars", x11, y11, Technology.MEDIEVAL, Resource.DESERT));
        planets.add(new Planet("Gninda 9D3", x12, y12, Technology.RENAISSANCE,
                Resource.NOSPECIALRESOURCES));
        planets.add(new Planet("Cusurn", x13, y13, Technology.EARLYINDUSTRIAL,
                Resource.MINERALPOOR));
        planets.add(new Planet("Choivis", x14, y14, Technology.INDUSTRIAL, Resource.POORSOIL));
        planets.add(new Planet("Gara DPX", x15, y15, Technology.POSTINDUSTRIAL,
                Resource.NOSPECIALRESOURCES));
        planets.add(new Planet("Broanus", x16, y16, Technology.HITECH, Resource.MINERALRICH));
        planets.add(new Planet("Gunkilia", x17, y17, Technology.HITECH, Resource.WARLIKE));
        planets.add(new Planet("Bralatune", x18, y18, Technology.POSTINDUSTRIAL,
                Resource.ARTISTIC));
        planets.add(new Planet("Ebbichi", x19, y19, Technology.INDUSTRIAL, Resource.LOTSOFWATER));
        planets.add(new Planet("Xamecarro", x20, y20, Technology.MEDIEVAL,
                Resource.WEIRDMUSHROOMS));
        planets.add(new Planet("Lichetune", x21, y21, Technology.HITECH,
                Resource.NOSPECIALRESOURCES));
        planets.add(new Planet("Brichi 8X5", x22, y22, Technology.POSTINDUSTRIAL,
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
