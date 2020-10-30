/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person_JSP0063x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HH
 */
public class Manager {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Validation v = new Validation();
    ArrayList<Person> list = new ArrayList<>();

    public Manager() {
    }

    public void inputInfo(int size) throws IOException {
        for (int i = 0; i < size; i++) {
            System.out.println("Input Information of Person");
            System.out.print("Please input name:");
            String name = in.readLine();
            System.out.print("Please input address:");
            String address = in.readLine();
            double salary = v.getInput("Please input salary:", 0, Double.MAX_VALUE);
            Person t = new Person(name, address, salary);
            list.add(t);
        }
    }

    public void displayInfo() {
        for (Person t : list) {
            System.out.println(t);
            System.out.println();
        }
    }

    public void sortBySalary() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                Person t = new Person();
                if (list.get(i).getSalary() < list.get(j).getSalary()) {
                    Person tmp = new Person();
                    tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        displayInfo();
    }
}
