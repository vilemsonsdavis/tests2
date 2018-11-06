/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Davis
 */
public class JavaGameStart extends JFrame {

    private JButton changeFrame;

    public JavaGameStart() {
        super("Maxis");
        setLayout(new FlowLayout());
        setSize(500,500);
        setResizable(false);
        setBackground(Color.BLACK);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

        changeFrame = new JButton("Sākt spēli!");
        changeFrame.setBounds(175,200,150,50);
        changeFrame.setBackground(Color.WHITE);
        add(changeFrame);

        HandlerClass handler = new HandlerClass();
        changeFrame.addActionListener(handler);
    }

    //Pogas strādās šeit
    private class HandlerClass implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JavaGame jg = new JavaGame();

            //Threads
            Thread t1 = new Thread(jg);
            t1.start();
        }
    }
}
