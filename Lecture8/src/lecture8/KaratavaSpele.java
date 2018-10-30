/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture8;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class KaratavaSpele {

    Scanner sc = new Scanner(System.in);

    public String Ievade() {

        System.out.println("Speles saakums. Pirmais speletajs ievada minamo vardu!");

        String vards = sc.nextLine();

        return vards;

    }

    public void printVirkne(char virkne[], String vards) {

        for (int i = 0; i < vards.length() * 2; i++) {

            System.out.print(virkne[i]);

        }

        System.out.println();
    }

    public boolean Gajiens(String vards, int dzivibas, char virkne[]) {

        System.out.println("Otrs speletajs ievada kadu burtu no latiinju alfabeta! Speletajam ir palikusas " + dzivibas + " dzivibas! ");

        char burts = sc.next().charAt(0); //shaadi ielasa char veertibu

        boolean minejums = false;

        for (int i = 1; i <= vards.length(); i++) {

            if (vards.charAt(i - 1) == burts) {

                int pozicija = i * 2 - 2;
                virkne[pozicija] = burts;

                minejums = true;

            }

        }

        if (minejums) {

            System.out.println("Tu uzmineji simbolu! Pashreizejais varda stavoklis: ");
            printVirkne(virkne, vards);
            System.out.println("Tev ir palikusas " + dzivibas + " dzivibas! ");

            return true;

        } else {

            System.out.print("Tu neuzmineeji simbolu! Pashreizejais varda stavoklis: ");
            printVirkne(virkne, vards);

            dzivibas--;

            System.out.println("Tev ir palikusas " + dzivibas + " dzivibas! ");

            return false;

        }

    }

    public boolean Uzvara(char virkne[]) {

        for (int i = 0; i < virkne.length; i++) {

            if (virkne[i] == '_') {
                return false;
            }

        }

        return true;
    }
}
