/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11;

/**
 *
 * @author Davis
 */
public class Apreikini {
    
    public int Saskaitit (int sk1, int sk2){
        return sk1 + sk2;
    }  
    
    public int Atnemt (int sk1, int sk2){
        return sk1 - sk2;
    }
    
    public int Reizinat (int sk1, int sk2){
        return sk1 * sk2;
    }
    
    public int Dalit (int sk1, int sk2){
        return sk1 / sk2;
    }
    
    public int Equals (int sk1, int sk2, char symbol, int result){
        if (symbol == '+') {
            result = Saskaitit(sk1, sk2);
        }
        if (symbol == '-') {
            result = Atnemt(sk1, sk2);
        }
        if (symbol == '*') {
            result = Reizinat(sk1, sk2);
        }
        if (symbol == '/') {
            result = Dalit(sk1, sk2);
        }
        
        return result;
    }
}