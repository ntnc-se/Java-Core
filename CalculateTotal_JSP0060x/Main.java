/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTotal_JSP0060x;

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
        BillPayment b = new BillPayment();
        System.out.println("======= Shopping Program =======");
        int number = b.getInput("Enter number of bill:", 0, Integer.MAX_VALUE);
        int[] array = b.inputValue(number);
        int sum = b.calculateSumValue(array);
        System.out.print("This is total of bill:" + sum);
        int value = b.getInput("\nInput value of wallet:", 0, Integer.MAX_VALUE);
        b.compareMoney(sum, value);
    }
}
