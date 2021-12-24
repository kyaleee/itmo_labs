package com.company.pokemon;

import com.company.attack.Confide;
import com.company.attack.HydroPump;
import ru.ifmo.se.pokemon.Pokemon;

public class Lombre extends Lotad{
    public Lombre(String name, int level) {
        super(name, level);
        this.setStats(60,50,50,60,70,50);
        this.setMove(new Confide(), new HydroPump());
    }
}
