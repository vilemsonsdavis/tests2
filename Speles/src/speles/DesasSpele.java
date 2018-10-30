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
public class DesasSpele {
    
    public void gameField(int bigField[][]) { //deklarejam funkciju ar dividimensiju masiivu tajaa un izveidojam speles laukumu ar 0
        for (int i = 0; i < 3; i++) {

            for (int k = 0; k < 3; k++) {
                bigField[i][k] = 0;
            }
        }
    }
    
    public void printGameField (int bigField[][]){ //funkcija aks peec katra gaajiena izprinte speles laukumu
        
        for (int i = 0; i < 3; i++) {

            for (int k = 0; k < 3; k++) {
                System.out.print(bigField[i][k]);
            }
            System.out.println();
        }
        
    }

    public void Move(boolean player, int bigField[][]) { //gaajiena funkcija

        Scanner sc = new Scanner(System.in);

        if (player) { //pirmais speletajs
            System.out.println("Pirmais speletajs izdara gaajienu! Ievadiet laucinja koordinatas!");

            int coordinateOne = sc.nextInt(); //ievadam koordinatas
            int coordinateTwo = sc.nextInt();

            boolean smallFieldIsNotNull = checkTheSmallField(bigField, coordinateOne, coordinateTwo); //parbaudam vai ievadiitas koordinatas jau nav aiznjemtas

            if (smallFieldIsNotNull) { //ja nav tad ieliekam jauno vertibu
                bigField[coordinateOne][coordinateTwo] = 1;
            } else { // ja ir tad izpildam funkciju 'Move'no jauna
                System.out.println("Laucinjs ar ievaditajam koordinatam jau ir aiznemts, izvelieties citu!");
                Move(player, bigField);
            }

        } else { //otrais speletajs
            System.out.println("Otrais speletajs izdara gaajienu! Ievadiet laucinja koordinatas!");

            int coordinateOne = sc.nextInt();
            int coordinateTwo = sc.nextInt();

            boolean smallFieldIsNotNull = checkTheSmallField(bigField, coordinateOne, coordinateTwo);

            if (smallFieldIsNotNull) {
                bigField[coordinateOne][coordinateTwo] = 2;
            } else {
                System.out.println("Laucinjs ar ievaditajam koordinatam jau ir aiznemts, izvelieties citu!");
                Move(player, bigField);
            }
        }

    }

    public boolean checkTheSmallField(int bigField[][], int coordinateOne, int coordinateTwo) {

        if (bigField[coordinateOne][coordinateTwo] != 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkIfThereIsAWinner(int bigField[][], boolean player) { 

        int playerValue;

        if (player) { //attiecigi pec speletaja nosakam vertibu kuru mums vajadzes parbaudit
            playerValue = 1;
        } else {
            playerValue = 2;
        }

        for (int i = 0; i < 3; i++) {  //parbauda visas horizantalas linijas vai nav 3 vienadi simboli jeb speletajs ir uzvarejis

            for (int k = 0; k < 3; k++) {

                if (bigField[i][k] != playerValue) {
                    break;
                }

                if (k == 2) {
                    return true;
                }

            }
        }

        for (int i = 0; i < 3; i++) { //parbauda visas vertikalas linijas vai nav 3 vienadi simboli

            for (int k = 0; k < 3; k++) {

                if (bigField[k][i] != playerValue) {
                    break;
                }

                if (k == 2) {
                    return true;
                }

            }
        }
        //sekojoshais ifs paarbauda abas diagonales
        if ((bigField[0][0]==playerValue && bigField[1][1]==playerValue && bigField[2][2]==playerValue) || (bigField[0][2]==playerValue && bigField[1][1]==playerValue && bigField[2][0]==playerValue)){
        
            return true;
        
        }
        
        return false;

    }
    
}
