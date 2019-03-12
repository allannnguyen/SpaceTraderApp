package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents the Universe the game takes place in
 * A universe has a list of randomly selected planets from all precreated options
 */
public class Universe {
    private List<Planet> tenplanets;
    Planet CharlesTheRed = new Planet("Charles The Red", 1, 1, Technology.PREAGRICULTURAL, Resource.WARLIKE); //ANARCHY
    Planet Wrangler = new Planet("Wrangler", 2, 1, Technology.AGRICULTURAL, Resource.RICHSOIL); //DICTATORSHIP
    Planet Yojimbo = new Planet("Yojimbo", 3, 1, Technology.MEDIEVAL, Resource.RICHFAUNA); //FEUDALSTATE
    Planet Cobaltea = new Planet("Cobaltea", 4, 1, Technology.RENAISSANCE, Resource.ARTISTIC); //DEMOCRACY
    Planet SuperFunTimeLand = new Planet("Super-Fun-Time-Land", 5, 1, Technology.EARLYINDUSTRIAL, Resource.WEIRDMUSHROOMS); //MONARCHY
    Planet StreronR2Y = new Planet("Streron R2Y", 6, 1, Technology.INDUSTRIAL, Resource.MINERALRICH); //FACISTSTATE
    Planet Cendicarro = new Planet("Cendicarro", 7, 1, Technology.POSTINDUSTRIAL, Resource.MINERALPOOR); //DICTATORSHIP
    Planet Nunvolla = new Planet("Nunvolla", 8, 1, Technology.HITECH, Resource.LOTSOFWATER); //PACIFISTSTATE
    Planet Laewei = new Planet("Laewei", 9, 1, Technology.PREAGRICULTURAL, Resource.LIFELESS); //DEMOCRACY
    Planet Huthone = new Planet("Huthone", 10, 1, Technology.AGRICULTURAL, Resource.LOTSOFHERBS); //CONFEDERACY
    Planet Besars = new Planet("Besars", 11, 1, Technology.MEDIEVAL, Resource.DESERT); //COMMUNISTSTATE
    Planet Gninda9D3 = new Planet("Gninda 9D3", 12, 1, Technology.RENAISSANCE, Resource.NOSPECIALRESOURCES); //FACISTSTATE
    Planet Cusurn = new Planet("Cusurn", 13, 1, Technology.EARLYINDUSTRIAL, Resource.MINERALPOOR); //SOCIALISTSTATE
    Planet Choivis = new Planet("Choivis", 14, 1, Technology.INDUSTRIAL, Resource.POORSOIL); //DEMOCRACY
    Planet GaraDPX = new Planet("Gara DPX", 15, 1, Technology.POSTINDUSTRIAL, Resource.NOSPECIALRESOURCES); //DICTATORSHIP
    Planet Broanus = new Planet("Broanus", 16, 1, Technology.HITECH, Resource.MINERALRICH); //CYBERNETICSTATE
    Planet Gunkilia = new Planet("Gunkilia", 17, 1, Technology.HITECH, Resource.WARLIKE); //ANARCHY
    Planet Bralatune = new Planet("Bralatune", 18, 1, Technology.POSTINDUSTRIAL, Resource.ARTISTIC); //THEOCRACY
    Planet Ebbichi = new Planet("Ebbichi", 19, 1, Technology.INDUSTRIAL, Resource.LOTSOFWATER); //CAPITALISTSTATE
    Planet Xamecarro = new Planet("Xamecarro", 20, 1, Technology.MEDIEVAL, Resource.WEIRDMUSHROOMS); //STATEOFSTAORI
    Planet Lichetune = new Planet("Lichetune", 127, 1, Technology.HITECH, Resource.NOSPECIALRESOURCES); //TECHNOCRACY
    Planet Brichi8X5 = new Planet("Brichi 8X5", 70, 1, Technology.POSTINDUSTRIAL, Resource.RICHSOIL); //FEUDALSTATE

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
    @Override
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
