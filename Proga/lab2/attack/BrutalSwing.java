package com.company.attack;
import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove {
    public BrutalSwing(){
        super(Type.DARK, 60, 100);
    }
    protected String describe(){
        return "использует Brutal Swing";
    }
}
