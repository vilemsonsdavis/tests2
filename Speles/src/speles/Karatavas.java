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
public class Karatavas {

    public void KaratavasGo() {
        
        boolean turpinatVaiNe = true;

        while (turpinatVaiNe) {

            Scanner sc = new Scanner(System.in);

            KaratavasSpele spele = new KaratavasSpele();

            String vards = spele.Ievade();
            char virkne[] = new char[vards.length() * 2];

            for (int i = 0; i < vards.length() * 2; i++) {

                if (i % 2 == 0) {

                    virkne[i] = '_';

                } else {

                    virkne[i] = ' ';

                }

            }

            boolean uzvarejis = false;

            int dzivibas = 5;

            while (dzivibas != 0) {

                //spele.Gajiens(vards, dzivibas, virkne);
                if (!spele.Gajiens(vards, dzivibas, virkne)) {
                    dzivibas--;
                }

                uzvarejis = spele.Uzvara(virkne);
                if (uzvarejis) {
                    System.out.println("Tu esi atminejis vardu un uzvarejis!");
                    break;
                }
            }

            if (uzvarejis == false) {
                System.out.println("Tu neatmineji vardu, zaudejot visas dziivbas un esi zaudejis!");
            }

            System.out.println("Ja gribi spelet velreiz karatavas ievadi true, ja negribi ievadi false! ");

            turpinatVaiNe = sc.nextBoolean();

        }

    }
}
