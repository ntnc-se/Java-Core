/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equation_JSP0050_ok;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HH
 */
public class NumberChecker {

    public boolean isOdd(float number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEven(float number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSquareNumber(float number) {
        int x = (int) Math.sqrt(number);
        if (x * x == number) {
            return true;
        } else {
            return false;
        }
    }
 
    public void displayResult(List<Float> list) {
        System.out.print("Number is Odd: ");
        for (Float t : list) {
            if (isOdd(t)) {
                System.out.print(t + " ");
            }
        }
        System.out.print("\nNumber is Even: ");
        for (Float t : list) {
            if (isEven(t)) {
                System.out.print(t + " ");
            }
        }
        System.out.print("\nNumber is Perfect Square: ");
        for (Float t : list) {
            if (isSquareNumber(t)) {
                System.out.print(t + " ");
            }
        }
    }
}
