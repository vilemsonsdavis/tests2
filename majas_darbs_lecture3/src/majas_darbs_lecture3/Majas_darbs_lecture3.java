/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majas_darbs_lecture3;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Majas_darbs_lecture3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ievadiet 1. skaitli !");
        Scanner sc = new Scanner (System.in);
        int skaitlis1 = sc.nextInt();
        System.out.println("Ievadiet 2. skaitli !"); // rakstot, sc.print kompilators neievada ENTER jeb jaunu rindinju
        int skaitlis2 = sc.nextInt();
        System.out.println("Izvelieties darbibu, kuru veiksiet ar siem skaitliem, ievadot attiecigo ciparu - saskaitisana (1); atnemsana (2)!");
        int cipars = sc.nextInt();
        if (cipars==1){
            System.out.println("Rezultats ir " + Saskaitisana(skaitlis1, skaitlis2));
        }else if (cipars==2){
            System.out.println("Rezultats ir " + Atnemsana(skaitlis1,skaitlis2));
        }else {
            System.out.println("Ievade nav pareiza!");
        }
    }
    
    public static int Saskaitisana (int a, int b){
        return a+b;
    }
    public static int Atnemsana (int a, int b){
        return a-b;
    }
}
