/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture12_lists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Lecture12_Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //PIEMEERS 1 - APREKINAT VIDEJO AR SARAKSTU
//        ArrayList<Integer> saraksts = new ArrayList<>();
//        int skaitlis;
//        
//        for (int i=0; i<5; i++){
//            
//            skaitlis = input.nextInt();
//            saraksts.add(skaitlis);
//        }
//        System.out.println("Vidējais ir " + average(saraksts));
        //PIEMEERS 2 - apgriezt sarakstu un iznemt dublikatus
//        ArrayList<Integer> sarakstsViens = new ArrayList<>();
//        ArrayList<Integer> sarakstsDivi = new ArrayList<>();
//        int skaitlis2, daudzums;
//
//        System.out.println("Cik skaitlus gribi ievadit?");
//        daudzums = input.nextInt();
//
//        System.out.println("Ievadi " + daudzums + " skaitlus!");
//
//        for (int i = 0; i < daudzums; i++) {
//            skaitlis2 = input.nextInt();
//            sarakstsViens.add(skaitlis2);
//        }
//
//        System.out.print("Pirmais saraksts: ");
//        printInt(sarakstsViens);
//
//        sarakstsDivi.add(sarakstsViens.get(sarakstsViens.size() - 1));
//        makeSecondList(daudzums, sarakstsViens, sarakstsDivi);
        //PIEMEERS 3- MEKELTAJS
        ArrayList<String> varduVirkne = new ArrayList<>();
        ArrayList<String> varduVirkne2 = new ArrayList<>();
        String vards;
        int daudzums2;

        System.out.println("Cik vardus gribi ievadit?");
        daudzums2 = input.nextInt();
        System.out.println("Ievadi " + daudzums2 + " vaardus!");

        for (int i = 0; i < daudzums2; i++) {
            vards = input.next();
            varduVirkne.add(vards);
        }

        sakartotVirkni(varduVirkne, varduVirkne2);

    }

    public static void sakartotVirkni(ArrayList<String> varduVirkne, ArrayList<String> varduVirkne2) {
        int position = 0, min = varduVirkne.get(0).length(), reizes = varduVirkne.size();
        for (int k = 0; k < reizes; k++) {
            min = varduVirkne.get(0).length();
            for (int i = 0; i < varduVirkne.size(); i++) {
                if (varduVirkne.get(i).length() <= min) {
                    min = varduVirkne.get(i).length();
                    position = i;
                }
            }
            varduVirkne2.add(varduVirkne.get(position));
            varduVirkne.remove(position);
        }
        System.out.print("Sakartots saraksts: ");
        printString(varduVirkne2);
    }

    public static void makeSecondList(int daudzums, ArrayList<Integer> sarakstsViens, ArrayList<Integer> sarakstsDivi) {

        boolean irBijis = false;

        for (int k = daudzums - 2; k > -1; k--) {
            for (int elements : sarakstsDivi) { //shaadi var iziet cauri visam sarakstam ar for ciklu!!
                if (elements == sarakstsViens.get(k)) {
                    irBijis = true;
                }
            }
            if (!irBijis) {
                sarakstsDivi.add(sarakstsViens.get(k));
            }
            irBijis = false;
        }
        System.out.print("Otrais saraksts: ");
        printInt(sarakstsDivi);
    }

    public static void printInt(ArrayList<Integer> saraksts) {
        for (int i = 0; i < saraksts.size(); i++) {
            System.out.print(saraksts.get(i) + " ");
        }
    }
    
        public static void printString(ArrayList<String> saraksts) {
        for (int i = 0; i < saraksts.size(); i++) {
            System.out.print(saraksts.get(i) + " ");
        }
    }

    public static int average(ArrayList<Integer> saraksts) {
        int summa = 0;
        for (int i = 0; i < 5; i++) {

            summa += saraksts.get(i);
        }
        return summa / saraksts.size();
    }

}
