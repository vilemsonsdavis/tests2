/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Lecture32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Zarosanas();
        Scanner sc = new Scanner(System.in);
        double skaitlis = sc.nextDouble();
        
        if (skaitlis > 15.5){
            System.out.println("#");
        }else{ // taads ir pienemts stils shaadi rakstit else zarosanos
            System.out.println("##");
        }
    }
    public static void Zarosanas() {
        int a = 5;
        if (a>6){
            System.out.println("a ir lielaks par 6!");
        }else System.out.println("a ir mazaks par 6!");
        String b = "Coding";
        if (b.equals("Coding")){  //lai parbauditu vai tekst ir vienads, savadak nevar JAVAA!
            System.out.println(b);
        }
    }

}
