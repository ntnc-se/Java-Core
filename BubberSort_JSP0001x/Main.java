/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubberSort_JSP0001x;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author NTNC
 */
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BubberSort b = new BubberSort();
        int length = b.getInput("Enter number of array", 0, Integer.MAX_VALUE);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Random().nextInt(length);
        }
        System.out.println("Unsorted array: ");
        b.displayArray(array);
        b.sort(array);
        System.out.println("\nSorted array: ");
        b.displayArray(array);
    }
}
