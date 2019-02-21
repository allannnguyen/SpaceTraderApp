package edu.gatech.cs2340.vanillaice.spacetraderapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Universe {
    Planet A = new Planet("A", 0, 0, Technology.PREAGRICULTURAL, Resource.WARLIKE); //ANARCHY
    Planet B = new Planet("B", 0, 0, Technology.AGRICULTURAL, Resource.RICHSOIL); //DICTATORSHIP
    Planet C = new Planet("C", 0, 0, Technology.MEDIEVAL, Resource.RICHFAUNA); //FEUDALSTATE
    Planet D = new Planet("D", 0, 0, Technology.RENAISSANCE, Resource.ARTISTIC); //DEMOCRACY
    Planet E = new Planet("E", 0, 0, Technology.EARLYINDUSTRIAL, Resource.WEIRDMUSHROOMS); //MONARCHY
    Planet F = new Planet("F", 0, 0, Technology.INDUSTRIAL, Resource.MINERALRICH); //FACISTSTATE
    Planet G = new Planet("G", 0, 0, Technology.POSTINDUSTRIAL, Resource.MINERALPOOR); //DICTATORSHIP
    Planet H = new Planet("H", 0, 0, Technology.HITECH, Resource.LOTSOFWATER); //PACIFISTSTATE
    Planet I = new Planet("I", 0, 0, Technology.PREAGRICULTURAL, Resource.LIFELESS); //DEMOCRACY
    Planet J = new Planet("J", 0, 0, Technology.AGRICULTURAL, Resource.LOTSOFHERBS); //CONFEDERACY
    Planet K = new Planet("K", 0, 0, Technology.MEDIEVAL, Resource.DESERT); //COMMUNISTSTATE
    Planet L = new Planet("L", 0, 0, Technology.RENAISSANCE, Resource.NOSPECIALRESOURCES); //FACISTSTATE
    Planet M = new Planet("M", 0, 0, Technology.EARLYINDUSTRIAL, Resource.MINERALPOOR); //SOCIALISTSTATE
    Planet N = new Planet("N", 0, 0, Technology.INDUSTRIAL, Resource.POORSOIL); //DEMOCRACY
    Planet O = new Planet("O", 0, 0, Technology.POSTINDUSTRIAL, Resource.NOSPECIALRESOURCES); //DICTATORSHIP
    Planet P = new Planet("P", 0, 0, Technology.HITECH, Resource.MINERALRICH); //CYBERNETICSTATE
    Planet Q = new Planet("Q", 0, 0, Technology.HITECH, Resource.WARLIKE); //ANARCHY
    Planet R = new Planet("R", 0, 0, Technology.POSTINDUSTRIAL, Resource.ARTISTIC); //THEOCRACY
    Planet S = new Planet("S", 0, 0, Technology.INDUSTRIAL, Resource.LOTSOFWATER); //CAPITALISTSTATE
    Planet T = new Planet("T", 0, 0, Technology.MEDIEVAL, Resource.WEIRDMUSHROOMS); //STATEOFSTAORI
    Planet U = new Planet("U", 0, 0, Technology.HITECH, Resource.NOSPECIALRESOURCES); //TECHNOCRACY
    Planet V = new Planet("V", 0, 0, Technology.POSTINDUSTRIAL, Resource.RICHSOIL); //FEUDALSTATE

    public Universe() {
        ArrayList<Planet> planets = new ArrayList<Planet>();
        planets.add(A);
        planets.add(B);
        planets.add(C);
        planets.add(D);
        planets.add(E);
        planets.add(F);
        planets.add(G);
        planets.add(H);
        planets.add(I);
        planets.add(J);
        planets.add(K);
        planets.add(L);
        planets.add(M);
        planets.add(N);
        planets.add(O);
        planets.add(P);
        planets.add(Q);
        planets.add(R);
        planets.add(S);
        planets.add(T);
        planets.add(U);
        planets.add(V);
        Random nextInt = new Random();

    }
}
