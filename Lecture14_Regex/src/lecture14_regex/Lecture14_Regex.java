/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture14_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Davis
 */
public class Lecture14_Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String virkne = input.nextLine();
        String pattern = "(\\w)";

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(virkne);

        int i = 0;

        if (m.find()) {
            while (true) {
                try {
                   // System.out.println(m.end()));
                    i++;
                } catch (Exception e) {
                    break;
                }
            }
        }else{
            System.out.println("NO MATCH");
        }
    }

}
