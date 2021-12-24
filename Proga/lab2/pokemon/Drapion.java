package com.company.pokemon;

import com.company.attack.*;
import ru.ifmo.se.pokemon.*;

public class Drapion extends Skorupi{
    public Drapion(String name, int level) {
        super(name, level);
        this.setStats(70, 90, 110, 60, 75,95);
        this.setType(Type.POISON, Type.DARK);
        this.setMove(new DarkPulse(), new CrossPoison(), new PinMissile(), new BrutalSwing());
    }
}
