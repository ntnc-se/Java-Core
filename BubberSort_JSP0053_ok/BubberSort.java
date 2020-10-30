/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubberSort_JSP0053_ok;

/**
 *
 * @author __ntnc__
 */
public class BubberSort {

    Validation v = new Validation();

    public int[] inputElementArray() {
        System.out.println("----- Input Element -----");
        System.out.println("Input Length Of Array");
        int size = v.getInputInteger("Enter number: ", 0, Integer.MAX_VALUE);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = v.getInputInteger("Enter number " + (i + 1) + ": ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        return array;
    }

    public int[] sortDescending(int[] array) {
        int size = array.length;
        if (size == 0) {
            System.out.println("No data input !");
        }
        int j = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < size - j; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return array;
    }

    public int[] sortAscending(int[] array) {
        int size = array.length;
        // user input nothing
        if (size == 0) {
            System.out.println("No data input !");
        }
        int j = 0;
        boolean swapped = true;
        while (swapped) {
            j++;
            swapped = false;
            for (int i = 0; i < size - j; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        return array;
    }

    public void displayArrayAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
            if (i < array.length - 1) {
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public void displayArrayDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
            if (i < array.length - 1) {
                System.out.print("<-");
            }
        }
        System.out.println("");
    }
}
