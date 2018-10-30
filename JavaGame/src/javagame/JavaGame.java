package javagame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JavaGame extends JFrame implements Runnable {

    int x, y, xDirection, yDirection;
    private Image dbImage;
    private Graphics dbg;
    Image face;
    ImageIcon i = new ImageIcon("C://Users//Davis//Desktop//testsGH/tests2//JavaGame//src//javagame//faceLeft.png");
    ImageIcon k = new ImageIcon("C://Users//Davis//Desktop//testsGH/tests2//JavaGame//src//javagame//faceRight.png");
    
    public void run(){
        try{
            while(true){
                
                move();
                Thread.sleep(5); //kontrole kusteshanas atrumu
            }
        }
        catch(Exception e){
            System.out.println("ERROR!");
        }
    }

    public void move() {
        x += xDirection;
        y += yDirection;
        
        if ( x<=0){
            x=0;
        }
        if (x>=450){
            x=450;
        }
        if ( y<=25){
            y=25;
        }
        if (y>=450){
            y=450;
        }
    }

    public void setXDir(int xDir) {
        xDirection = xDir;
    }

    public void setYDir(int yDir) {
        yDirection = yDir;
    }

    public class AL extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == e.VK_A) {
                setXDir(-1);
                face = i.getImage();
            }
            if (keyCode == e.VK_D) {
                setXDir(+1);
                face = k.getImage();
            }
            if (keyCode == e.VK_W) {
                setYDir(-1);
            }
            if (keyCode == e.VK_S) {
                setYDir(+1);
            }
        }

        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == e.VK_A) {
                setXDir(0);
            }
            if (keyCode == e.VK_D) {
                setXDir(0);
            }
            if (keyCode == e.VK_W) {
                setYDir(0);
            }
            if (keyCode == e.VK_S) {
                setYDir(0);
            }
        }
    }

    public JavaGame() {
        
        face = i.getImage();

        //Game properties
        addKeyListener(new AL());

        setTitle("Java game by Davis Vilemsons");
        setSize(500, 500);
        setResizable(false);
        setVisible(true);
        setBackground(Color.MAGENTA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        x = 150;
        y = 150;

    }

    public void paint(Graphics g) {

        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }

    public void paintComponent(Graphics g) {

        g.setColor(Color.ORANGE);
        g.drawImage(face, x, y, this);

        repaint();

    }

    public static void main(String[] args) {

       JavaGame jg = new JavaGame();
        
        //Threads
        Thread t1 = new Thread(jg);
        t1.start();
    }

}
