/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture5_cikli;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Piemeri {
    
    public void Meginajums (){
        
        for (int i=0; i<5;i++){
            System.out.println("Hello world!");
        }
        
        for (int i =5; i>0;i--){
            System.out.println(i);
        }
    }
    
    public void citiCikli () {
        String ievade = "";
        Scanner sc = new Scanner (System.in);
        while (!ievade.equals("iziet")){ //shaadi, pieliekot priekshaa izsaukuma ziimi, mees apskatam preteejo vertibu jeb !=
            System.out.println("Hello world!");
            ievade= sc.nextLine();
        } 
        
        
    }
    
}
