package com.company.pokemon;

import com.company.attack.Blizzard;
import com.company.attack.Confide;
import com.company.attack.HydroPump;
import com.company.pokemon.*;

public class Ludicolo extends Lombre {
    public Ludicolo(String name, int level) {
        super(name, level);
        this.setStats(80,70,70,90,100,70);
        this.setMove(new Confide(), new HydroPump(), new Blizzard());
    }
}
