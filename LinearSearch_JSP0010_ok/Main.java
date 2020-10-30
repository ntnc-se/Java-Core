/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch_JSP0010_ok;

import java.util.Random;

/**
 *
 * @author __ntnc__
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinearSearch ls = new LinearSearch();
        int size = ls.getInput("Enter number of array:", 0, Integer.MAX_VALUE);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Random().nextInt(size);
        }
        int value = ls.getInput("Enter search value:", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.print("The array: ");
        ls.displayArray(array);
        if (ls.search(array, value) == -1) {
            System.out.println("\nValue doesn't exist !");
        } else {
            System.out.println("\nFound " + value + " at index: " + ls.search(array, value));
        }
    }
}
