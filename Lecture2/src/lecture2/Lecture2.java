/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture2;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Lecture2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet 1. skaitli!");
        int skaitlis1 = sc.nextInt();  //Ja pie integer ievades ievadīs simbolu vai simbolu virkni, tad izmetīs kļūdu
        int rezultats = skaitlis1*7;
        System.out.println("Rezultats ir " + rezultats);
        System.out.println("Ievadiet 2. skaitl!");
        int skaitlis2 = sc.nextInt();
        rezultats = rezultats + skaitlis2;
        System.out.println("Tagadejais rezultats ir "+ rezultats + 5); //Ja izvadot rezultātu tiks ierakstīts vienkārši skaitlis,
                                                                        //      tad viņš to paņems kā simbolu
         */
       //dzimsanasGadaAprekins();
      // saskaitisana(51,49);
      Scanner sc = new Scanner (System.in);
      int skaitlis1 = sc.nextInt();
      int skaitlis2 = sc.nextInt();
      atnemsana(skaitlis1,skaitlis2);
      int reizinajums = reizinasana(5,5);
      System.out.println(reizinajums);
    }
    
    public static void dzimsanasGadaAprekins (){
        System.out.println("Kurs gads sobriid ir?");  //Lai sakartotu kodu smuki pa rindinjam, jaspiezh Alt+Shift+F taustiņš
        Scanner sc = new Scanner(System.in);
        int gads = sc.nextInt();
        System.out.println("Kuraa gadaa tu esi dzimis?");
        int dzimsanasGads = sc.nextInt();
        System.out.println("Tavs vecums ir " + (gads - dzimsanasGads));
    }
    
    public static void saskaitisana(int a, int b){
        int rezultats = a+b;
        System.out.println(rezultats); //CTRL + '/'taustiņš - lai aizkomentētu ātri vienu rindiņu
    }
    
    public static void atnemsana (int skaitlis1, int skaitlis2){
        int rezultats = skaitlis1-skaitlis2;
        System.out.println(rezultats);
    } 
    
    public static int reizinasana (int skaitlis1, int skaitlis2){
        int rezultats = skaitlis1 * skaitlis2;
        return rezultats;
    }
}
