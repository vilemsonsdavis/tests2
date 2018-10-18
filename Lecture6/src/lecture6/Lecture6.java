/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture6;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Lecture6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       /* boolean a = true, b = false, izeja = false;
        while (izeja == false) {

            double skaitlis1 = SkaitlaIevade(a);
            double skaitlis2 = SkaitlaIevade(b);

            System.out.println("Izvelies darbibu, ievadot attiecigo ciparu - Saskaitit (1); Atnemt (2); Reizinat (3); Dalit(4) vai Kapinat(5)!");

            Scanner sc = new Scanner(System.in);
            int izvele = sc.nextInt();
            
            Aprekini apr = new Aprekini();
            
            switch (izvele) {
                case 1:
                    System.out.println("Saskaitisanas rezultats: " + apr.Saskaitit(skaitlis1, skaitlis2));
                    break;
                case 2:
                    System.out.println("Atnemsanas rezultats: " + apr.Atnemt(skaitlis1, skaitlis2));
                    break;
                case 3:
                    System.out.println("Reizinasanas rezultats: " + apr.Reizinat(skaitlis1, skaitlis2));
                    break;
                case 4:
                    System.out.println("Dalisanas rezultats: " + apr.Dalit(skaitlis1, skaitlis2));
                    break;
                case 5:
                    System.out.println("Kapinasanas rezultats: " + apr.Kapinasana(skaitlis1, skaitlis2));
                    break;
                default:
                    System.out.println("Nepareiza ievade!");
                    break;
            }
            
            System.out.println("Izvelies, ievadot noradito vertibu iekavas,- beigt(true) vai turpinat" + " (false) programmu!");
            
            izeja = sc.nextBoolean();
            if (izeja) {
                System.out.println("Programmas beigas!");
            }
        }*/
       Scanner input = new Scanner (System.in);
       int a = input.nextInt();
       
       Aprekini apr = new Aprekini();
        System.out.println(apr.Factorial(a));
    }

    public static double SkaitlaIevade(boolean a) {
        if (a) {
            System.out.println("Ievadiet 1. skaitli!");
        } else {
            System.out.println("Ievadiet 2. skaitli!");
        }
        Scanner sc = new Scanner(System.in);
        double result = 0;
        try {
            result = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Nepareiza ievade, ievadi skaitli!");
            result = SkaitlaIevade(a);
        }
        return result;
    }
}
