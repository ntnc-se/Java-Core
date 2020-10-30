/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubberSort_JSP0053_ok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author __ntnc__
 */
public class Validation {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public int getInputInteger(String mess, int min, int max) {
        do {
            try {
                System.out.print(mess);
                int number = Integer.parseInt(in.readLine());
                if (number < min || number > max) {
                    System.out.println("Please enter number in range !");
                    continue;
                }
                return number;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Please enter a number !");
            }
        } while (true);
    }
}
