/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubberSort_JSP0053_ok;

/**
 *
 * @author __ntnc__
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[0];
        Validation v = new Validation();
        BubberSort bs = new BubberSort();
        do {
            System.out.println("========= Bubble Sort program =========");
            System.out.println("1. Input Element");
            System.out.println("2. Sort Ascending");
            System.out.println("3. Sort Descending");
            System.out.println("4. Exit");
            int choice = v.getInputInteger("Please choice one optione:", 1, 4);
            switch (choice) {
                case 1:
                    array = bs.inputElementArray();
                    break;
                case 2:
                    bs.sortAscending(array);
                    bs.displayArrayAscending(array);
                    break;
                case 3:
                    bs.sortDescending(array);
                    bs.displayArrayDescending(array);
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

}
