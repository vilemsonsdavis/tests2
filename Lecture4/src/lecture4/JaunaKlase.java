/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;

/**
 *
 * @author Davis
 */
public class JaunaKlase {
    
    public void Izvade (){ //ne-galvenaja klase nav jalieto static, lai ertak varetu izsaukt funkciju
        System.out.println("Kaut ko izvadam");
    }
    
    private void  Izvade2 (){ //private funkciju nevar izmantot citaas klases, bet public var
        System.out.println("Kaut ko izvadam");
    }
    
    public int Atgriez(){
        return 3+2;
    }
            
}
