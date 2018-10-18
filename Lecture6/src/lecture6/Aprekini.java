/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture6;

/**
 *
 * @author Davis
 */
public class Aprekini {
    
    public double Saskaitit (double a, double b){
        
        double result = a+b;
        
        return result;
    }
    
    public double Atnemt (double a, double b){
        
        double result = a-b;
        
        return result;
    }
    
    public double Reizinat (double a, double b){
        
        double result = a*b;
        
        return result;
    }
    
    public double Dalit (double a, double b){
        
        double result = a/b;
        
        return result;
    }
    
    public double Kapinasana (double a, double pakape){
        
        double result=1;
        for (int i = 0; i<pakape; i++){
            result=result*a;
        }
        return result;
    }
    
    public int Factorial (int skaitlis){
        
        int result=1;
        
        for (int i=2; i<=skaitlis; i++){
            result *= i;
        }
        return result;
    }
    
}
