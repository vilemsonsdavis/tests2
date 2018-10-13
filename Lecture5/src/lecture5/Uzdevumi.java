/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture5;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Uzdevumi {
    
    private String Izvade1(){
        return "Man patik";
    }
    
    private String Izvade2(){
        return " programmet";
    }
    
    public String virknesGarums (){
        Scanner sc = new Scanner(System.in);
        String virkne = sc.nextLine();
        String rezultats;
        if ( virkne.length()<7 && virkne.length()>0){
            rezultats = "Veiksmigi";
        }else if (virkne.length()>6){
            rezultats = "Neveiksmigi";
        }else{
            rezultats = "Nav nekas ievadits";
        }
        return rezultats;
    }
    
    public boolean numberCheck (){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        return number>=0;  //shajaa gadiijumaa, atgriezhot veertiibu, ja skaitlis buus lielaks par 0, tad bus veertiba true, otherwise false
    }
}
