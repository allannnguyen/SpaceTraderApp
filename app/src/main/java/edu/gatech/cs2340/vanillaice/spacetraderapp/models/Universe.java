package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import java.util.ArrayList;
import java.util.Random;

/**
 * Represents the Universe the game takes place in
 * A universe has a list of randomly selected planets from all precreated options
 */
public class Universe {
    Planet CharlesTheRed = new Planet("Charles The Red", 0, 0, Technology.PREAGRICULTURAL, Resource.WARLIKE); //ANARCHY
    Planet Wrangler = new Planet("Wrangler", 0, 0, Technology.AGRICULTURAL, Resource.RICHSOIL); //DICTATORSHIP
    Planet Yojimbo = new Planet("Yojimbo", 0, 0, Technology.MEDIEVAL, Resource.RICHFAUNA); //FEUDALSTATE
    Planet Cobaltea = new Planet("Cobaltea", 0, 0, Technology.RENAISSANCE, Resource.ARTISTIC); //DEMOCRACY
    Planet SuperFunTimeLand = new Planet("Super-Fun-Time-Land", 0, 0, Technology.EARLYINDUSTRIAL, Resource.WEIRDMUSHROOMS); //MONARCHY
    Planet StreronR2Y = new Planet("Streron R2Y", 0, 0, Technology.INDUSTRIAL, Resource.MINERALRICH); //FACISTSTATE
    Planet Cendicarro = new Planet("Cendicarro", 0, 0, Technology.POSTINDUSTRIAL, Resource.MINERALPOOR); //DICTATORSHIP
    Planet Nunvolla = new Planet("Nunvolla", 0, 0, Technology.HITECH, Resource.LOTSOFWATER); //PACIFISTSTATE
    Planet Laewei = new Planet("Laewei", 0, 0, Technology.PREAGRICULTURAL, Resource.LIFELESS); //DEMOCRACY
    Planet Huthone = new Planet("Huthone", 0, 0, Technology.AGRICULTURAL, Resource.LOTSOFHERBS); //CONFEDERACY
    Planet Besars = new Planet("Besars", 0, 0, Technology.MEDIEVAL, Resource.DESERT); //COMMUNISTSTATE
    Planet Gninda9D3 = new Planet("Gninda 9D3", 0, 0, Technology.RENAISSANCE, Resource.NOSPECIALRESOURCES); //FACISTSTATE
    Planet Cusurn = new Planet("Cusurn", 0, 0, Technology.EARLYINDUSTRIAL, Resource.MINERALPOOR); //SOCIALISTSTATE
    Planet Choivis = new Planet("Choivis", 0, 0, Technology.INDUSTRIAL, Resource.POORSOIL); //DEMOCRACY
    Planet GaraDPX = new Planet("Gara DPX", 0, 0, Technology.POSTINDUSTRIAL, Resource.NOSPECIALRESOURCES); //DICTATORSHIP
    Planet Broanus = new Planet("Broanus", 0, 0, Technology.HITECH, Resource.MINERALRICH); //CYBERNETICSTATE
    Planet Gunkilia = new Planet("Gunkilia", 0, 0, Technology.HITECH, Resource.WARLIKE); //ANARCHY
    Planet Bralatune = new Planet("Bralatune", 0, 0, Technology.POSTINDUSTRIAL, Resource.ARTISTIC); //THEOCRACY
    Planet Ebbichi = new Planet("Ebbichi", 0, 0, Technology.INDUSTRIAL, Resource.LOTSOFWATER); //CAPITALISTSTATE
    Planet Xamecarro = new Planet("Xamecarro", 0, 0, Technology.MEDIEVAL, Resource.WEIRDMUSHROOMS); //STATEOFSTAORI
    Planet Lichetune = new Planet("Lichetune", 0, 0, Technology.HITECH, Resource.NOSPECIALRESOURCES); //TECHNOCRACY
    Planet Brichi8X5 = new Planet("Brichi8X5", 0, 0, Technology.POSTINDUSTRIAL, Resource.RICHSOIL); //FEUDALSTATE

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
        Random nextInt = new Random();

    }
}
