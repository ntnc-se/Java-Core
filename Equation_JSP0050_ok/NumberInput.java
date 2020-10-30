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
public class NumberInput {

    Validation v = new Validation();
    

    public List inputSimpleNumber() {
        List<Float> list = new ArrayList<>();
        float coeA = v.getInputFloat("Enter A:", Integer.MIN_VALUE, Float.MAX_VALUE);
        float coeB = v.getInputFloat("Enter B:", Integer.MIN_VALUE, Float.MAX_VALUE);
        list.add(coeA);
        list.add(coeB);
        return list;
    }

    public List inputQuadraticNumber() {
        List<Float> list = new ArrayList<>();
        float coeA = v.getInputFloat("Enter A: ", Integer.MIN_VALUE, Float.MAX_VALUE);
        float coeB = v.getInputFloat("Enter B: ", Integer.MIN_VALUE, Float.MAX_VALUE);
        float coeC = v.getInputFloat("Enter C: ", Integer.MIN_VALUE, Float.MAX_VALUE);
        list.add(coeC);
        list.add(coeB);
        list.add(coeA);
        return list;
    }
}
