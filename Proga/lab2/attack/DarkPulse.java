package com.company.attack;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
    public DarkPulse() {
        super(Type.DARK, 80, 100);
    }
    protected void addOppEffects(Pokemon p){
        if (Math.random() <= 0.2){
            Effect.flinch(p);
        }
    }
    protected String describe() {
        return "использует Dark Pulse";
    }
}
