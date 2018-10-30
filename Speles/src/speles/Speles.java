/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speles;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Speles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean turpinatVaiNe = true;

        while (turpinatVaiNe) {

            System.out.println("Izvelies, ko tu gribi spelet, ievadot attieciigo ciparu - karatavas (1) vai desas (2)!");

            int spele = sc.nextInt();

            switch (spele) {
                case 1:
                    Karatavas spele1 = new Karatavas();
                    spele1.KaratavasGo();
                    break;

                case 2:
                    Desas spele2 = new Desas();
                    spele2.DesasGo();
                    break;

                default:
                    System.out.println("Nepareiza ievade! Ievadi veelreiz - karatavas (1) vai desas (2)!");
                    break;
            }
            
            System.out.println("Ja gribi spelet vel ievadi true, ja negribi ievadi false! ");
            
            turpinatVaiNe = sc.nextBoolean();
            
        }
        
        System.out.println("Programmas beigas!");

    }

}
