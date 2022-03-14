package com.powercalc;

import il.ac.hac.cs.calc.*;

public class Root extends BinaryOperation {

    public Root(Statement degree, Statement radicand) {
        super(degree, radicand);
    }

    @Override
    protected double innerEvaluate(Statement degree, Statement radicand) {
        return new Power(radicand, new Division(Scalar.valueOf(1), degree)).evaluate();
    }
}
