/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desasspelegui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Davis
 */
public class DesasSpeleGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run(){
                    
                    JFrame frame2 = new JFrame();
                    frame2.setTitle("Spēle desas by Dāvis Vilemsons");
                    frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame2.getContentPane().add(new speleSakums());
                    frame2.pack();
                    frame2.setVisible(true);
                }
            });
        
    }
    
}
