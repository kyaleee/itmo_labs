package com.company.pokemon;

import com.company.attack.*;
import ru.ifmo.se.pokemon.*;

public class Skorupi extends Pokemon{
    public Skorupi(String name, int level) {
        super(name, level);
        this.setStats(40, 50, 90, 30, 55, 65);
        this.setMove(new DarkPulse(), new CrossPoison(), new PinMissile());
    }
}
