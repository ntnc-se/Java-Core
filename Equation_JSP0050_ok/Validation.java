/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equation_JSP0050_ok;

import static Equation_JSP0050_ok.Main.in;

/**
 *
 * @author HH
 */
public class Validation {

    public int getInputInteger(String mess, int MIN, int MAX) {
        do {
            try {
                System.out.println(mess);
                int number = Integer.parseInt(in.readLine());
                if (number < MIN || number > MAX) {
                    System.out.println("Please re-enter number between " + MIN + " and " + MAX);
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.println("Please enter a number !");
            }
        } while (true);
    }

    public float getInputFloat(String mess, int MIN, float MAX) {
        do {
            try {
                System.out.print(mess);
                float number = Float.parseFloat(in.readLine());
                if (number < MIN || number > MAX) {
                    System.out.println("Please re-enter number in range !");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.println("Please enter a number !");
            }
        } while (true);
    }
}
