/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equation_JSP0050_ok;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HH
 */
public class SimpleEquation {

    Validation v = new Validation();

    public List solve(List<Float> number) {
        List<Float> list = new ArrayList<>();
        System.out.println("----- Calculate Equation -----");
        float coeA = number.get(0);
        float coeB = number.get(1);
        list.add(coeA);
        list.add(coeB);
        if (coeA == 0) {
            if (coeB == 0) {
                System.out.println("There are infinitive solution !");
            } else {
                System.out.println("There are no solution !");
            }
        } else {
            float x = -coeB / coeA;
            System.out.println("Solution: x = " + x);
            list.add(x);
        }
        return list;
    }
}
