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
    Planet CharlesTheRed = new Planet("Charles The Red", 19, 56, Technology.PREAGRICULTURAL, Resource.WARLIKE); //ANARCHY
    Planet Wrangler = new Planet("Wrangler", 78, 77, Technology.AGRICULTURAL, Resource.RICHSOIL); //DICTATORSHIP
    Planet Yojimbo = new Planet("Yojimbo", 22, 5, Technology.MEDIEVAL, Resource.RICHFAUNA); //FEUDALSTATE
    Planet Cobaltea = new Planet("Cobaltea", 120, 47, Technology.RENAISSANCE, Resource.ARTISTIC); //DEMOCRACY
    Planet SuperFunTimeLand = new Planet("Super-Fun-Time-Land", 7, 89, Technology.EARLYINDUSTRIAL, Resource.WEIRDMUSHROOMS); //MONARCHY
    Planet StreronR2Y = new Planet("Streron R2Y", 10, 99, Technology.INDUSTRIAL, Resource.MINERALRICH); //FACISTSTATE
    Planet Cendicarro = new Planet("Cendicarro", 144, 11, Technology.POSTINDUSTRIAL, Resource.MINERALPOOR); //DICTATORSHIP
    Planet Nunvolla = new Planet("Nunvolla", 101, 33, Technology.HITECH, Resource.LOTSOFWATER); //PACIFISTSTATE
    Planet Laewei = new Planet("Laewei", 147, 95, Technology.PREAGRICULTURAL, Resource.LIFELESS); //DEMOCRACY
    Planet Huthone = new Planet("Huthone", 60, 20, Technology.AGRICULTURAL, Resource.LOTSOFHERBS); //CONFEDERACY
    Planet Besars = new Planet("Besars", 55, 15, Technology.MEDIEVAL, Resource.DESERT); //COMMUNISTSTATE
    Planet Gninda9D3 = new Planet("Gninda 9D3", 62, 1, Technology.RENAISSANCE, Resource.NOSPECIALRESOURCES); //FACISTSTATE
    Planet Cusurn = new Planet("Cusurn", 132, 51, Technology.EARLYINDUSTRIAL, Resource.MINERALPOOR); //SOCIALISTSTATE
    Planet Choivis = new Planet("Choivis", 123, 18, Technology.INDUSTRIAL, Resource.POORSOIL); //DEMOCRACY
    Planet GaraDPX = new Planet("Gara DPX", 71, 90, Technology.POSTINDUSTRIAL, Resource.NOSPECIALRESOURCES); //DICTATORSHIP
    Planet Broanus = new Planet("Broanus", 15, 40, Technology.HITECH, Resource.MINERALRICH); //CYBERNETICSTATE
    Planet Gunkilia = new Planet("Gunkilia", 80, 36, Technology.HITECH, Resource.WARLIKE); //ANARCHY
    Planet Bralatune = new Planet("Bralatune", 67, 74, Technology.POSTINDUSTRIAL, Resource.ARTISTIC); //THEOCRACY
    Planet Ebbichi = new Planet("Ebbichi", 44, 37, Technology.INDUSTRIAL, Resource.LOTSOFWATER); //CAPITALISTSTATE
    Planet Xamecarro = new Planet("Xamecarro", 1, 25, Technology.MEDIEVAL, Resource.WEIRDMUSHROOMS); //STATEOFSTAORI
    Planet Lichetune = new Planet("Lichetune", 127, 69, Technology.HITECH, Resource.NOSPECIALRESOURCES); //TECHNOCRACY
    Planet Brichi8X5 = new Planet("Brichi8X5", 70, 2, Technology.POSTINDUSTRIAL, Resource.RICHSOIL); //FEUDALSTATE

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

    public List<Planet> getPlanets() {
        return tenplanets;
    }
}
