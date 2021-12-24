package com.company.attack;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }
    protected void applyOppEffects(Pokemon p){
        Effect.freeze(p);
    }
}
