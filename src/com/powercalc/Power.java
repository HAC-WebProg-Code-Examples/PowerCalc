package com.powercalc;

import il.ac.hac.cs.calc.BinaryOperation;
import il.ac.hac.cs.calc.Statement;

public class Power extends BinaryOperation {

    public Power(Statement base, Statement exponent) {
        super(base, exponent);
    }

    @Override
    protected double innerEvaluate(Statement base, Statement exponent) {
        return Math.pow(base.evaluate(), exponent.evaluate());
    }
}
