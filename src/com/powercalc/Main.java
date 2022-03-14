package com.powercalc;

import il.ac.hac.cs.calc.*;

public class Main {

    /**
     * Usage example of the library
     *
     * @param args ignored
     */
    public static void main(String[] args) {

        PowerCalc.registerDefaults();

        try {
            Scalar two = Scalar.valueOf(2);
            Scalar three = Scalar.valueOf(3);

            Statement nine = StatementFactory.create("pow", three, two);
            System.out.println(nine);

            Statement backToThree = StatementFactory.create("root", two, nine);
            System.out.println(backToThree);

        } catch (StatementNotRegisteredException e) {
            e.printStackTrace();
        }
    }
}
