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
    private List<Planet> tenplanets;
    Planet CharlesTheRed = new Planet("Charles The Red", 1, 1, Technology.PREAGRICULTURAL, Resource.WARLIKE); //ANARCHY
    Planet Wrangler = new Planet("Wrangler", 30, 30, Technology.AGRICULTURAL, Resource.RICHSOIL); //DICTATORSHIP
    Planet Yojimbo = new Planet("Yojimbo", 13, 30, Technology.MEDIEVAL, Resource.RICHFAUNA); //FEUDALSTATE
    Planet Cobaltea = new Planet("Cobaltea", 25, 30, Technology.RENAISSANCE, Resource.ARTISTIC); //DEMOCRACY
    Planet SuperFunTimeLand = new Planet("Super-Fun-Time-Land", 17, 20, Technology.EARLYINDUSTRIAL, Resource.WEIRDMUSHROOMS); //MONARCHY
    Planet StreronR2Y = new Planet("Streron R2Y", 16, 10, Technology.INDUSTRIAL, Resource.MINERALRICH); //FACISTSTATE
    Planet Cendicarro = new Planet("Cendicarro", 17, 11, Technology.POSTINDUSTRIAL, Resource.MINERALPOOR); //DICTATORSHIP
    Planet Nunvolla = new Planet("Nunvolla", 25, 22, Technology.HITECH, Resource.LOTSOFWATER); //PACIFISTSTATE
    Planet Laewei = new Planet("Laewei", 9, 30, Technology.PREAGRICULTURAL, Resource.LIFELESS); //DEMOCRACY
    Planet Huthone = new Planet("Huthone", 15, 4, Technology.AGRICULTURAL, Resource.LOTSOFHERBS); //CONFEDERACY
    Planet Besars = new Planet("Besars", 11, 1, Technology.MEDIEVAL, Resource.DESERT); //COMMUNISTSTATE
    Planet Gninda9D3 = new Planet("Gninda 9D3", 19, 15, Technology.RENAISSANCE, Resource.NOSPECIALRESOURCES); //FACISTSTATE
    Planet Cusurn = new Planet("Cusurn", 30, 25, Technology.EARLYINDUSTRIAL, Resource.MINERALPOOR); //SOCIALISTSTATE
    Planet Choivis = new Planet("Choivis", 10, 26, Technology.INDUSTRIAL, Resource.POORSOIL); //DEMOCRACY
    Planet GaraDPX = new Planet("Gara DPX", 20, 18, Technology.POSTINDUSTRIAL, Resource.NOSPECIALRESOURCES); //DICTATORSHIP
    Planet Broanus = new Planet("Broanus", 15, 9, Technology.HITECH, Resource.MINERALRICH); //CYBERNETICSTATE
    Planet Gunkilia = new Planet("Gunkilia", 22, 29, Technology.HITECH, Resource.WARLIKE); //ANARCHY
    Planet Bralatune = new Planet("Bralatune", 26, 14, Technology.POSTINDUSTRIAL, Resource.ARTISTIC); //THEOCRACY
    Planet Ebbichi = new Planet("Ebbichi", 24, 6, Technology.INDUSTRIAL, Resource.LOTSOFWATER); //CAPITALISTSTATE
    Planet Xamecarro = new Planet("Xamecarro", 9, 29, Technology.MEDIEVAL, Resource.WEIRDMUSHROOMS); //STATEOFSTAORI
    Planet Lichetune = new Planet("Lichetune", 18, 11, Technology.HITECH, Resource.NOSPECIALRESOURCES); //TECHNOCRACY
    Planet Brichi8X5 = new Planet("Brichi 8X5", 5, 13, Technology.POSTINDUSTRIAL, Resource.RICHSOIL); //FEUDALSTATE

    /**
     * Selects the planets for this game randomly from all options
     */
    public Universe() {
        ArrayList<Planet> planets = new ArrayList<Planet>();
        planets.add(CharlesTheRed);
        planets.add(Wrangler);
        planets.add(Yojimbo);
        planets.add(Cobaltea);
        planets.add(SuperFunTimeLand);
        planets.add(StreronR2Y);
        planets.add(Cendicarro);
        planets.add(Nunvolla);
        planets.add(Laewei);
        planets.add(Huthone);
        planets.add(Besars);
        planets.add(Gninda9D3);
        planets.add(Cusurn);
        planets.add(Choivis);
        planets.add(GaraDPX);
        planets.add(Broanus);
        planets.add(Gunkilia);
        planets.add(Bralatune);
        planets.add(Ebbichi);
        planets.add(Xamecarro);
        planets.add(Lichetune);
        planets.add(Brichi8X5);
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
