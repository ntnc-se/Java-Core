/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch_JSP0006_ok;

import static BinarySearch_JSP0006_ok.Main.in;

/**
 *
 * @author HH
 */
public class BinarySearch {

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

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
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

    public int search(int[] arr, int value, int min, int max) {
        if (min > max) {
            return -1;
        }
        int mid = (min + max) / 2;
        if (arr[mid] > value) {
            return search(arr, value, min, mid - 1);
        }
        if (arr[mid] < value) {
            return search(arr, value, mid + 1, max);
        }
        return mid;
    }
}
