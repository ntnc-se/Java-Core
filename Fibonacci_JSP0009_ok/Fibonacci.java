/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci_JSP0009_ok;

/**
 *
 * @author HH
 */
public class Fibonacci {

    public int calculateFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
