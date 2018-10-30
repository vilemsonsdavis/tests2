/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture10_konsole;

/**
 *
 * @author Davis
 */
public class Lecture10_konsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int divdimensijuMasivs[][] = new int [4][4];
        aizpildamMasivu(divdimensijuMasivs);
        printetMasivu(divdimensijuMasivs);
        
    }
    
    
    public static void aizpildamMasivu (int divdMasivs[][]){
        
        boolean viensVaiNulle = true;
        
        for (int i=0; i<4;i++){
            
            for (int k=0; k<4; k++){
                
                if (viensVaiNulle){
                    divdMasivs[i][k] = 1;
                }else{
                    divdMasivs[i][k] = 0;
                }
                
            }
            
            viensVaiNulle = !viensVaiNulle;
            
        }
        
    }
    
    public static void printetMasivu (int divdMasivs[][]){
        
        for (int i =0; i<4; i++){
            
            for (int k=0; k<4; k++){
                
                System.out.print(divdMasivs[i][k]);
                
            }
            
            System.out.println();
            
        }
        
    }
}
