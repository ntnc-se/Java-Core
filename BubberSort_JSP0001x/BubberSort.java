/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubberSort_JSP0001x;

import static BubberSort_JSP0001x.Main.in;

/**
 *
 * @author HH
 */
public class BubberSort {

    public int getInput(String mess, int MIN, int MAX) {
        do {
            try {
                System.out.println(mess);
                int number = Integer.parseInt(in.readLine());
                if (number < MIN || number > MAX) {
                    System.out.println("Please enter number in range!");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.println("Please enter a number!");
            }
        } while (true);
    }

    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public void sort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
    public void sort2(int[] array) {
        int count = 0;
        int size = array.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                count ++;
            }
        }
        System.out.println("\n"+count );
    }
}
