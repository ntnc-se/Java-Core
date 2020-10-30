/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person_JSP0063x;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author HH
 */
public class Validation {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public double getInput(String mess, double MIN, double MAX){
        do{
            try{
                System.out.print(mess);
                double number = Double.parseDouble(in.readLine());
                if(number < MIN || number >MAX){
                    System.out.println("Please enter number in range");
                    continue;
                }
                return number;
            }catch(Exception e){
                System.out.println("Please enter number");
            }
        }while(true);
    }
}
