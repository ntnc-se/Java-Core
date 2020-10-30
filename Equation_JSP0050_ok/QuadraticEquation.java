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
public class QuadraticEquation {

    Validation v = new Validation();

    public List solve(List<Float> number) {
        List<Float> list = new ArrayList<>();
        System.out.println("----- Calculate Quadratic Equation -----");
        float coeA = number.get(0);
        float coeB = number.get(1);
        float coeC = number.get(2);
        list.add(coeC);
        list.add(coeB);
        list.add(coeA);

        if (coeA == 0) {
            if (coeB == 0) {
                if (coeC == 0) {
                    System.out.println("The Equation has infinitive roots !");
                } else {
                    System.out.println("The Equation has no root !");
                }
            } else {
                float x = -coeC / coeB;
                System.out.println("Solution x = " + x);
                list.add(x);
            }
        } else {
            float delta = coeB * coeB - 4 * coeA * coeC;
            if (delta < 0) {
                System.out.println("The Equation has no root !");
            } else if (delta == 0) {
                System.out.println("Solution x = " + -coeB / (2 * coeA));
                list.add(-coeB / (2 * coeA));
            } else {
                float x1 = (float) ((-coeB - Math.sqrt(delta)) / (2 * coeA));
                float x2 = (float) ((-coeB + Math.sqrt(delta)) / (2 * coeA));
                System.out.println("Solution x1 = " + x1 + " and x2 = " + x2);
                list.add(x1);
                list.add(x2);
            }
        }
        return list;
    }
}
