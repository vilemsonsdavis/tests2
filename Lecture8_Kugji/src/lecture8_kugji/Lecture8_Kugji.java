/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture8_kugji;

/**
 *
 * @author Davis
 */
public class Lecture8_Kugji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        KugiSpele spele = new KugiSpele();

        int laukums1[][] = new int[11][11];
        int laukums2[][] = new int[11][11];
        
        int laukums11[][]= new int [11][11];
        int laukums22[][] = new int [11][11];

        spele.LaukumaIzveide(laukums1, laukums2);

        int spel = 1;

        spele.LaukumaAizpilde(laukums1, spel);
laukums2, spel);
        spel++;

        spele.LaukumaAizpilde(

    }

}
