/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture7_desas;

/**
 *
 * @author Davis
 */
public class Lecture7_desas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        desas game = new desas();

        int bigField[][] = new int[3][3];
        game.gameField(bigField); //shaadi padodam divdimensiju masiivu

        boolean player = true, winner = false;

        for (int i = 1; i < 10; i++) {

            game.Move(player, bigField);

            if (i > 4) {// atrakais gadijums kad bus kads uzvaretajs buus peec 5taa gaajiena, tapec tikai tad sakam parbaudit vai ir uzvaretajs
                winner = game.checkIfThereIsAWinner(bigField, player);
            }

            if (winner) {
                if (player) { //1st player
                    
                    System.out.println("Pashreizejais speeles laukuma aizpildijums: ");
                    game.printGameField(bigField);
                    
                    System.out.println("Pirmais speletajs ir uzvarejis!!!");
                    break;
                } else { //2nd player
                    
                    System.out.println("Pashreizejais speeles laukuma aizpildijums: ");
                    game.printGameField(bigField);
                    
                    System.out.println("Otrais speletajs ir uzvarejis!!!");
                    break;
                }
            }

            System.out.println("Pashreizejais speeles laukuma aizpildijums: ");
            game.printGameField(bigField);
            player = !player;
        }
    
        if (winner==false){
            System.out.println("Speles iznakums ir neizskjirts!");
        }
        
    }

}
