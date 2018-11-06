package javagame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaGame extends JFrame implements Runnable {

    int x, y, xDirection, yDirection, score = 0;
    private Image dbImage;
    private Graphics dbg;
    private JButton changeFrame;

    Random rand = new Random();
    int x2 = rand.nextInt(480) + 1;
    int y2 = rand.nextInt(480) + 1;
    int x3 = rand.nextInt(480) + 1;
    int y3 = rand.nextInt(480) + 1;
    int x4 = rand.nextInt(480) + 1;
    int y4 = rand.nextInt(480) + 1;

    Image face, ballzy;
    ImageIcon i = new ImageIcon("C://Users//Davis//Desktop//testsGH/tests2//JavaGame//src//javagame//maxisLeft.png");
    ImageIcon k = new ImageIcon("C://Users//Davis//Desktop//testsGH/tests2//JavaGame//src//javagame//maxisRight.png");
    ImageIcon ball = new ImageIcon("C://Users//Davis//Desktop//testsGH/tests2//JavaGame//src//javagame//ball.png");

    public void run() {
        try {
            while (true) {

                move();
                ballMove();
                ballEaten();
                Thread.sleep(5); //kontrole kusteshanas atrumu
            }
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }

    public void move() {
        x += xDirection;
        y += yDirection;

        if (x <= 0) {
            x = 0;
        }
        if (x >= 450) {
            x = 450;
        }
        if (y <= 25) {
            y = 25;
        }
        if (y >= 450) {
            y = 450;
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
        ballzy = ball.getImage();

        //Game properties
        addKeyListener(new AL());
        
        setTitle("Maxis eed bumbinjas by Davis Vilemsons");
        setSize(500, 500);
        setResizable(false);
        setVisible(true);
        setBackground(Color.RED);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        x = 50;
        y = 50;
    }

    public void paint(Graphics g) {

        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }

    public void paintComponent(Graphics g) {

        g.setColor(Color.BLACK);
        g.setFont(new Font("default", Font.BOLD, 16));
        g.drawImage(face, x, y, this);
        g.drawImage(ballzy, x2, y2, this);
        g.drawImage(ballzy, x3, y3, this);
        g.drawImage(ballzy, x4, y4, this);
        g.drawString("Maxis ir apēdis " + score + " bumbiņas!", 280, 50);
        g.drawLine(50, 50, 50, 50);

        repaint();

    }

    public void ballEaten() {
        if (((x + 50 >= x2 && x + 50 <= x2 + 20) || (x <= x2 + 20 && x >= x2)) && ((y <= y2 + 20 && y >= y2) || (y + 50 >= y2 && y + 50 <= y2 + 20))) {
            Random rand2 = new Random();
            x2 = rand2.nextInt(470) + 1;
            y2 = rand2.nextInt(480) + 1;
            score++;
        }

        if (((x + 50 >= x3 && x + 50 <= x3 + 20) || (x <= x3 + 20 && x >= x3)) && ((y <= y3 + 20 && y >= y3) || (y + 50 >= y3 && y + 50 <= y3 + 20))) {
            Random rand3 = new Random();
            x3 = rand3.nextInt(470) + 1;
            y3 = rand3.nextInt(470) + 1;
            score++;
        }

        if (((x + 50 >= x4 && x + 50 <= x4 + 20) || (x <= x4 + 20 && x >= x4)) && ((y <= y4 + 20 && y >= y4) || (y + 50 >= y4 && y + 50 <= y4 + 20))) {
            Random rand4 = new Random();
            x4 = rand4.nextInt(470) + 1;
            y4 = rand4.nextInt(470) + 1;
            score++;
        }

    }

    boolean rightTouched = false;
    boolean right2Touched = false;
    boolean right3Touched = false;
    boolean down2Touched = false;
    boolean down3Touched = false;
    boolean downTouched = false;

    public void ballMove() {

        if (x2 == 480) {
            rightTouched = true;
        } else if (x2 == 0) {
            rightTouched = false;
        }

        if (rightTouched) {
            x2--;
        } else {
            x2++;
        }
        if (x3 == 480) {
            right2Touched = true;
        } else if (x3 == 0) {
            right2Touched = false;
        }

        if (right2Touched) {
            x3--;
        } else {
            x3++;
        }
        if (x4 == 480) {
            right3Touched = true;
        } else if (x4 == 0) {
            right3Touched = false;
        }

        if (right3Touched) {
            x4--;
        } else {
            x4++;
        }

        if (y2 == 480) {
            downTouched = true;
        } else if (y2 == 20) {
            downTouched = false;
        }

        if (downTouched) {
            y2--;
        } else {
            y2++;
        }
        if (y3 == 480) {
            down2Touched = true;
        } else if (y3 == 20) {
            down2Touched = false;
        }

        if (down2Touched) {
            y3--;
        } else {
            y3++;
        }
        if (y4 == 480) {
            down3Touched = true;
        } else if (y4 == 20) {
            down3Touched = false;
        }

        if (down3Touched) {
            y4--;
        } else {
            y4++;
        }

    }

//    public void dogAutoMove(){
//        
//        int distance[] = new int[11];
//        int closest = y4-y+50, cPos=0;
//        
//        distance[0]= x-x2+20;
//        distance[1]= x-x3+20;
//        distance[2]= x-x4+20;
//        distance[3]= x2-x+50;
//        distance[4]= x3-x+50;
//        distance[5]= x4-x+50;
//        distance[6]= y-y2+20;
//        distance[7]= y-y3+20;
//        distance[8]= y-y4+20;
//        distance[9]= y2-y+50;
//        distance[10]= y3-y+50;
//        
//        for(int i=0; i<11;i++){
//            if (closest>=distance[i]){
//                closest=distance[i];
//                cPos = i;
//            }
//        }
//        
//        int disX, disY;
//        
//        switch (cPos){
//            case 1:
//                int 
//        
//        }
//        
//    }
    public static void main(String[] args) {

        JavaGameStart jgS = new JavaGameStart();
    }
}
