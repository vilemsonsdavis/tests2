/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture5;

/**
 *
 * @author Davis
 */
public class Piemeri {

    public void Zarosanas() {
        
        int a = 5;
        if (a>5 && a!=5){
            
        }
        
        int b = 6;
        if (b==7 || b<5){
            
        }
        
        if (a>0 && b>0){
            
        }
    }
    
    public void Zarosanas2(){ //piemeers switcham - sleedzim
        
        int a = 5;
        switch (a){ //iekavaas norada mainigo, kura veertiibu parbaudiiis
            case 1:  //1 ir veertiiba, ja a bus 1, ad izpildisies shis case
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:  //default ir tas pats kas else, jeb izvadas visi parejie gadijumi, kas nav aparakstiti
                System.out.println("ai, nav pareizi");
                break;
        }
        
    }
}
