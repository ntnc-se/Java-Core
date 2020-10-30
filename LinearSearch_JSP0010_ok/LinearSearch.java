/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSearch_JSP0010_ok;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author __ntnc__
 */
public class LinearSearch {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public int getInput(String mess, int MIN, int MAX) {
        do {
            try {
                System.out.println(mess);
                int number = Integer.parseInt(in.readLine());
                if (number < MIN || number > MAX) {
                    System.out.println("Please enter number in range !");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.println("Please enter a number !");
            }
        } while (true);
    }

    public void displayArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            // see the first element equal search value, return its index
            if (array[i] == value) {
                return i;
            }
        }
        // not found any search value
        return -1;
    }
}
