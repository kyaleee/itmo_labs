package com.company.pokemon;

import com.company.attack.Confide;
import ru.ifmo.se.pokemon.*;

public class Lotad extends Pokemon{
    public Lotad(String name, int level) {
        super(name, level);
        this.setStats(40,30,30,40,50,30);
        this.setType(Type.WATER, Type.GRASS);
        this.setMove(new Confide());
    }
}
