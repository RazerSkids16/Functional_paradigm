/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mguga
 */
import java.util.*;

public class Functional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Functional Paradigm");
        while (true) {
            System.out.println("1. ADD\n"
                    + "2. SUBTRACT\n"
                    + "3. MULTIPLY\n"
                    + "4. DIVIDE\n"
                    + "5. MODULO\n"
                    + "6. EXIT");
            System.out.print("Select Operation: ");

            int option = sc.nextInt();
            if(option == 6 ){
                System.exit(0);
            }
            System.out.print("Enter 1st value: ");
            double a = sc.nextDouble();
            System.out.print("Enter 2nd value: ");
            double b = sc.nextDouble();
            if(option == 1){
                System.out.println("Answer: "+ Math.addExact((int)a, (int)b));
            }
            if(option == 2){
                System.out.println("Answer: "+ Math.subtractExact((int)a, (int)b));
            }
            if(option == 3){
                System.out.println("Answer: "+ Math.multiplyExact((int)a,(int)b));
            }
            if(option == 4){
                System.out.println("Answer: "+ Math.floorDiv((int)a, (int)b));
            }
            if(option == 5){
                System.out.println("Answer: "+ Math.floorMod((int)a, (int)b));
            }
        }

    }
}
