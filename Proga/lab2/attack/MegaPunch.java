package com.company.attack;

import ru.ifmo.se.pokemon.*;

public class MegaPunch extends PhysicalMove {
    public MegaPunch(){
        super(Type.NORMAL, 80, 85);
    }
    protected String describe(){
        return "использует Mega Punch";
    }
}
