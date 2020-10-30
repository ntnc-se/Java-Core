/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertSort_JSP0003x;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

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
        InsertSort s = new InsertSort();
        int size = s.getInput("Enter number of array:", 0, Integer.MAX_VALUE);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(size);
        }

        System.out.print("Unsorted array:");
        s.displayArray(array);
        System.out.println();

        System.out.print("Sorted array:");
        s.sort(array);
        s.displayArray(array);
    }
}
