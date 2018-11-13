/*
 * To change game license header, choose License Headers in Project Properties.
 * To change game template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Davis
 */
public class PaintScreen {
    
    JPanel game = new JPanel();
    JLabel label = new JLabel();
    
    Image player, wall, arrowDown, grass, fireworks;
    ImageIcon wallzy = new ImageIcon("C://Users//Davis//Desktop//testsGH/tests2//JavaGame//src//javagame//wall.jpg");
    ImageIcon arrow = new ImageIcon("C://Users//Davis//Desktop//testsGH/tests2//JavaGame//src//javagame//arrow.png");
    ImageIcon grassy = new ImageIcon("C://Users//Davis//Desktop//testsGH/tests2//JavaGame//src//javagame//grass.jpg");
    ImageIcon fireworkssy = new ImageIcon("C://Users//Davis//Desktop//testsGH/tests2//JavaGame//src//javagame//fireworks.gif");
    int x, y;
    boolean win = false;
    String vards = "";
    int field[][] =new int [21][20];

    public PaintScreen(Image player, int x, int y, JPanel game, boolean win, String vards, int field[][]) {
        this.player = player;
        this.x = x;
        this.y = y;
        this.game = game;
        this.win = win;
        this.vards = vards;
        this.field = field;
       
        wall = wallzy.getImage();
        arrowDown = arrow.getImage();
        grass = grassy.getImage();
        fireworks = fireworkssy.getImage();

    }
    
    public void paintComponent(Graphics g) {
        
        for (int i=1; i<21;i++){
            for (int k=0;k<20;k++){
                if (field[i][k]==1){
                    g.drawImage(wall,k*25,i*25,game);
                }else{
                    g.drawImage(grass,k*25,i*25,game);
                }
            }
        }
        
        g.setColor(Color.RED);
        g.setFont(new Font("default", Font.BOLD, 20));
        g.drawImage(arrowDown, 250, 30, 25, 25, game);
        g.drawImage(arrowDown, 400, 500, 25, 25, game);
        g.drawImage(player, x, y, 20, 20, game);
        
        if (win){
            g.drawImage(fireworks, 0,525,500,225,game);
            g.drawString("Lieliski! Tu palīdzēji " + vards + " atrast izeju!", 50,700);
        }else{
           g.drawString("Palīdzi atrast "+ vards + " izeju!", 100,650);
        }
    }

}
