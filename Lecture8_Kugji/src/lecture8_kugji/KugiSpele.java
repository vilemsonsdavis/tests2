/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture8_kugji;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class KugiSpele {

    Scanner sc = new Scanner(System.in);

    public void LaukumaIzveide(int laukums1[][], int laukums2[][]) {

        for (int i = 0; i < 11; i++) {

            for (int k = 0; k < 11; k++) {

                if (i == 0) {

                    laukums1[i][k] = k;
                    laukums2[i][k] = k;

                } else if (k == 0) {

                    laukums1[i][k] = i;
                    laukums2[i][k] = i;

                } else {

                    laukums1[i][k] = 0;
                    laukums2[i][k] = 0;

                }
            }

        }

    }

    public void LaukumaIzvade(int laukums[][]) {

        for (int i = 0; i < 11; i++) {

            for (int k = 0; k < 11; k++) {

                System.out.print(laukums[i][k] + " ");

            }

            System.out.println();

        }

    }

    public void LaukumaAizpilde(int laukums[][], int spel) {

        System.out.print(spel + ". speletajs aizpilda savu laukumu! Tava riciba ir 4 kugi ar lielumu 1, 3 kugi ar lielumu 2, 2 kugi ar lielumu 3 un 1 kugis ar lielumu 4. Ievadi kugu sakumu un beigu koordinati (tiem kas lielaki pa 1 laucinju)");
        System.out.println("Laukums: ");
        LaukumaIzvade(laukums);

        for (int i = 0; i < 10; i++) {

            if (i < 4) {

                System.out.println("Ievadi koordinatas kugim ar lielumu 1! Beigu koordinatas ievadi tadas pashas kaa sakuma.");

                KoordinatuIevade(laukums);

            } else if (i < 7) {

                System.out.println("Ievadi 2 sakuma un 2 beigu koordinatas kugim ar garumu 2 laucini!");

                KoordinatuIevade(laukums);

            } else if (i < 9) {

                System.out.println("Ievadi 2 sakuma un 2 beigu koordinatas kugim ar lielumu 3 laucini!");

                KoordinatuIevade(laukums);

            } else {

                System.out.println("Ievadi 2 sakuma un 2 beigu koordinatas kugim ar lielumu 4 laucini!");

                KoordinatuIevade(laukums);

                System.out.println("Tavs aizpilditais laukums: ");
                LaukumaIzvade(laukums);
                break;

            }

            System.out.println("Tavs pashreizejais laukums :");
            LaukumaIzvade(laukums);

        }

    }

    public void KugaIevietosana(int laukums[][], int sakKoord1, int sakKoord2, int beigKoord1, int beigKoord2) {

        if (beigKoord1 < sakKoord1) {

            int a = beigKoord1;
            beigKoord1 = sakKoord1;
            sakKoord1 = a;

        }

        if (beigKoord2 < sakKoord2) {

            int b = beigKoord2;
            beigKoord2 = sakKoord2;
            sakKoord2 = b;

        }

        for (int i = sakKoord1; i <= beigKoord1; i++) {

            for (int k = sakKoord2; k <= beigKoord2; k++) {

                laukums[i][k] = 1;

            }

        }

    }

    public void KoordinatuIevade(int laukums[][]) {

        int sakumaKoordinata1, sakumaKoordinata2, beiguKoordinata1, beiguKoordinata2;

        sakumaKoordinata1 = sc.nextInt();
        sakumaKoordinata2 = sc.nextInt();
        beiguKoordinata1 = sc.nextInt();
        beiguKoordinata2 = sc.nextInt();

        KugaIevietosana(laukums, sakumaKoordinata1, sakumaKoordinata2, beiguKoordinata1, beiguKoordinata2);

    }

    public void Gajiens(int laukums[][], int spel) {

        System.out.println("Laukums pa kuru tu shauj: ");
        LaukumaIzvade(laukums);

        System.out.println(spel + ". speletajs ievada koordinatas, kuraas vinjs grib shaut pretinieka laukumaa");

        int koord1 = sc.nextInt();
        int koord2 = sc.nextInt();

        parbauditSavienu(laukums, koord1, koord2);

    }

    public void parbauditSavienu(int laukums1[][], int laukums2[][], int koord1, int koord2) {

        if (laukums1[koord1][koord2] == 5 || laukums1[koord1][koord2] == 9) {

            System.out.println("Tu jau pa shiim koordinatam esi shavis! Ievadi koordinatas velreiz!");

            koord1 = sc.nextInt();
            koord2 = sc.nextInt();

            parbauditSavienu(laukums1, laukums2, koord1, koord2);

        } else {

            Shaut(laukums1, laukums2, koord1, koord2);

        }

    }

    public void Shaut(int laukums1[][], int laukums2, int koord1, int koord2) {

        if (laukums1[koord1][koord2]==1){
            laukums2[koord1][koord2]=9;
        }else{
            laukums2[koord1][koord2]=5;
        }

    }

}
