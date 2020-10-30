/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertSort_JSP0003x;

import static InsertSort_JSP0003x.Main.in;

/**
 *
 * @author HH
 */
public class InsertSort {

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
                System.out.println("Please enter number !");
            }
        } while (true);
    }

    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int value = arr[i];
            while (j > 0 && arr[j - 1] > value) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = value;
        }
    }
}
