package com.company;
import com.company.pokemon.*;
import ru.ifmo.se.pokemon.Battle;


public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pheromosa p1 = new Pheromosa("Shinji", 1);
        Drapion p2 = new Drapion("Asuka", 1);
        Skorupi p3 = new Skorupi("Rei", 2);
        Lotad p4 = new Lotad("Misato", 1);
        Lombre p5 = new Lombre("Kaworu", 2);
        Ludicolo p6 = new Ludicolo("Gendo", 3);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
