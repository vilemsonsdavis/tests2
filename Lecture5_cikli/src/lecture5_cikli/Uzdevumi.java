/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture5_cikli;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Uzdevumi {
    
    public void Pakaapes (){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ievadi skaitli!");
        int skaitlis = sc.nextInt();
        System.out.println("Ievadi pakaapi, kuraa gribi kaapinaat ievadito skaitli!");
        int pakape = sc.nextInt();
        int rezultats = skaitlis;
        for (int i=0; i<pakape; i++){
            System.out.println("Ievadiitais skaitlis " + (i+1) + ". pakaapee ir " + rezultats);
            rezultats = rezultats*skaitlis;
        }
    }
    
    public void Minesana (){
//        System.out.println("Ievadi skaitli no 1-10!");
        Scanner sc = new Scanner (System.in);
//        int skaitlis = sc.nextInt();
        Random rand = new Random(); //izmantosim random klasi

        int  skaitlis = rand.nextInt(10) + 1; //dators uzgenere random skaitli no 1-10
        System.out.println("Megini uzminet skaitli, ievadot no 1-10. Tev ir palikusas 5 iespejas!");
        
        for (int i=0; i<5;i++){
            int minejums = sc.nextInt();
            if (minejums==skaitlis){
                System.out.println("Tu uzmineji!");
                break;
            }else{
                System.out.println("Tu neuzmineji, tev ir palikusas " + (5-i-1)+ " iespejas!");
            }
        }
    }
    
}
