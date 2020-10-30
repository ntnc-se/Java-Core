/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTotal_JSP0060x;

import static CalculateTotal_JSP0060x.Main.in;

/**
 *
 * @author HH
 */
public class BillPayment {

    public int getInput(String mess, int MIN, int MAX) {
        do {
            try {
                System.out.print(mess);
                int number = Integer.parseInt(in.readLine());
                if (number < MIN || number > MAX) {
                    System.out.println("Please enter number in range !");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.println("Please enter number !");
            }
        } while (true);
    }

    public int[] inputValue(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = getInput("Input value of bill " + (i + 1) + ":", 0, Integer.MAX_VALUE);
        }
        return array;
    }

    public int calculateSumValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public void compareMoney(int total, int value) {
        if (total > value) {
            System.out.println("You can't buy it.");
        } else {
            System.out.println("You can buy it.");
        }
    }
}
