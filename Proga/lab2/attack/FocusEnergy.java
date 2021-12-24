package com.company.attack;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class FocusEnergy extends StatusMove {
    public FocusEnergy(){
        super(Type.NORMAL, 0, 0);
    }
    protected String describe(){
        return "использует Focus Energy";
    }
}
