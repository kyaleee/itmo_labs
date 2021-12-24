package com.company.attack;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.FIGHTING, 0, 85);
    }

    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
    protected String describe(){
        return "использует Swagger";
    }
}