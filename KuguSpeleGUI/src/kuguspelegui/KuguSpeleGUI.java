/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuguspelegui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Davis
 */
public class KuguSpeleGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run(){
                    JFrame frame = new JFrame();
                    frame.setTitle("Spēle kuģi by Dāvis Vilemsons");
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.getContentPane().add(new kugiSpele());
                    frame.pack();
                    frame.setVisible(true);
                }
            });
        
    }
    
}
