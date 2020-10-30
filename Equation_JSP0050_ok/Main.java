/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equation_JSP0050_ok;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HH
 */
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validation v = new Validation();
        NumberChecker nc = new NumberChecker();
        SimpleEquation s = new SimpleEquation();
        QuadraticEquation q = new QuadraticEquation();
        NumberInput ni = new NumberInput();
        while (true) {
            System.out.println("\n========= Equation Program =========");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            int option = v.getInputInteger("Please choice one option:", 0, 3);
            switch (option) {
                case 1:
                    nc.displayResult(s.solve(ni.inputSimpleNumber()));
                    break;
                case 2:
                    nc.displayResult(q.solve(ni.inputQuadraticNumber()));
                    break;
                case 3:
                    return;
            }
        }
    }
}
