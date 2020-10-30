/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci_JSP0009_ok;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        Fibonacci f = new Fibonacci();
        System.out.println("The 45 sequence fibonacci");
        for (int i = 0; i < 45; i++) {
            System.out.print(" " + f.calculateFibonacci(i));
            if (i < 44) {
                System.out.print(",");
            }
        }
    }
}
