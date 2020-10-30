/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch_JSP0006_ok;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
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
        BinarySearch b = new BinarySearch();
        int size = b.getInput("Enter number of array:", 0, Integer.MAX_VALUE);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(size);
        }

        int value = b.getInput("Enter search value:", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.print("Sorted array:");
        b.bubbleSort(array);
        b.displayArray(array); 
        System.out.println();

        int index = b.search(array, value, 0, size);
        if (index == -1) {
            System.out.println("value doesn't exist");
        } else {
            System.out.println("Found " + value + " at index: " + index);
        }
    }
}
