package com.company.pokemon;

import com.company.attack.*;
import ru.ifmo.se.pokemon.*;

public class Pheromosa extends Pokemon{
    public Pheromosa(String name, int level) {
        super(name, level);
        this.setStats(71, 137, 37, 137, 37, 151);
        this.setType(Type.BUG, Type.FIGHTING);
        this.setMove(new Swagger(), new MegaPunch(), new FocusEnergy(), new Confide());
    }
}
