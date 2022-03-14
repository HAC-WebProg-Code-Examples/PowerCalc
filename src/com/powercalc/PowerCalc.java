package com.powercalc;

import il.ac.hac.cs.calc.StatementFactory;

public class PowerCalc {

    public static final String POW_OP_STR = "pow";
    public static final String ROOT_OP_STR = "root";

    public static void registerDefaults() {
        StatementFactory.register(POW_OP_STR, Power::new);
        StatementFactory.register(ROOT_OP_STR, Root::new);
    }

    public static void unRegisterDefaults() {
        StatementFactory.unRegister(POW_OP_STR);
        StatementFactory.unRegister(ROOT_OP_STR);
    }
}
