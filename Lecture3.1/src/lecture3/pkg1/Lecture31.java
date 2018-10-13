/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class Lecture31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Izvade ("izvadam tekstu bez Sout");
        String firstName, secondName, thirdName;
        Scanner sc = new Scanner(System.in);
        firstName = sc.nextLine();
        secondName = sc.nextLine();
        thirdName = sc.nextLine();
        System.out.println(kombineVardus(firstName, secondName, thirdName));
    }
    
    public static String kombineVardus (String firstName, String secondName, String thirdName){
        String varduVirkne = firstName + " " + secondName + " " + thirdName;
        return varduVirkne;
    }
    
    public static void Izvade (String teksts){
        System.out.println(teksts);
    }
}
