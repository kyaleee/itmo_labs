package com.company.attack;

import ru.ifmo.se.pokemon.*;

public class CrossPoison extends PhysicalMove {
    public CrossPoison(){
        super(Type.POISON, 70, 100);
    }
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1){
            Effect.poison(p);
        }
    }
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 3.0;
    }
    protected String describe(){
        return "использует Cross Poison";
    }
}
