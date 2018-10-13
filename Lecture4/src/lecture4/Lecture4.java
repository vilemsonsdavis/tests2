/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Lecture4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String a = "abcd";
        char simbols = a.charAt(2); // lai piekljuutu string simbolam konkretam
        int garums = a.length(); //stringa garums
        double kapinats = Math.pow(4.0,3.0); // kaapina skaitli 4 treshajaa pakaapee
        System.out.println(kapinats);
//        JaunaKlase piemers = new JaunaKlase(); //Izveido citas klases objektu
//        piemers.Izvade(); //izmanto citas klases objekta funkciju
//        
//        JaunaKlase piemers2 = new JaunaKlase();
//        piemers2.Izvade();
//        int a = piemers.Atgriez(); //saglabajam vertibu no citas klases int funkcijas
//        System.out.println(a);  //lai aizkomentetu/atkomentetu vairakas rindinas - iezimet un nospiest CTRL + '?'
        
        Kalkulators opcija = new Kalkulators();
        opcija.vards = "jaunsVards"; // shaadi piekljuust mainigajiem, kas ir veidoti citaa klasee
        opcija.Izvade();
//        int rezultats;
//        System.out.println("Ievadiet 1. skaitli!");
//        Scanner sc = new Scanner(System.in);
//        int skaitlis1 = sc.nextInt();
//        
//        System.out.println("Ievadiet 2. skaitli!");
//        int skaitlis2 = sc.nextInt();
//        
//        System.out.println("Izvelieties darbibu ar skaitliem, ievadot attiecigo ciparu : saskaitisana (1) vai atnemsana (2)!");
//        int izvele = sc.nextInt();
//        if (izvele==1){
//            rezultats = opcija.Saskaitisana(skaitlis1, skaitlis2);
//            System.out.println("Rezultats ir " + rezultats);
//        }else if (izvele==2){
//             rezultats = opcija.Atnemsana(skaitlis1, skaitlis2);
//             System.out.println("Rezultats ir " + rezultats);
//        }else{
//            System.out.println("Ievade ir nepareiza!");
//        }
    }
    
}
