package javagame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JavaGame extends JFrame implements Runnable {

    // JFrame gameFrame = new JFrame();
    JPanel gamePanel = new JPanel();

    int x, y, xDirection, yDirection, score = 0;
    int field[][] = new int[19][19];
    boolean pressedA = false, pressedW = false, pressedS = false, pressedD = false;
    boolean win = false;
    String vards = "";
    
    GameField maze;

    Image player;
    ImageIcon left, right;

    private Image dbImage;
    private Graphics dbg;

    public void run() {
        try {
            while (true) {
                if (checkWin()) {
                    win = true;
                }
                repaint();
                move();
                Thread.sleep(8); //kontrole kusteshanas atrumu
            }
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }

    public void move() {
        x += xDirection;
        y += yDirection;

        //Borders
        if (x <= 25) {
            x = 25;
        }
        if (x >= 477) {
            x = 477;
        }
        if (y <= 50) {
            y = 50;
        }
        if (y >= 501 && x<475) {
            y = 501;
        }
        if (y>=525){
            y=525;
        }

        wallCollision();

    }

    public void makeGameField() {
        maze = new GameField(field);
        field =maze.maze;
       

//        for (int i = 0; i < 20; i++) {
//            field[1][i] = 1;
//        }
//        for (int i = 0; i < 20; i++) {
//            field[20][i] = 1;
//        }
//        for (int i = 1; i < 20; i++) {
//            field[i][0] = 1;
//        }
//        for (int i = 1; i < 20; i++) {
//            field[i][19] = 1;
//        }
//        //start and end
//        field[1][10] = 0;
//        field[20][16] = 0;
//        //1st line
//        field[2][9] = 1;
//        field[2][11] = 1;
//        //2ndline
//        field[3][2] = 1;
//        field[3][3] = 1;
//        field[3][4] = 1;
//        field[3][5] = 1;
//        field[3][6] = 1;
//        field[3][8] = 1;
//        field[3][9] = 1;
//        field[3][13] = 1;
//        field[3][14] = 1;
//        field[3][15] = 1;
//        field[3][17] = 1;
//        field[3][18] = 1;
//        //3rd line
//        field[4][2] = 1;
//        field[4][6] = 1;
//        field[4][11] = 1;
//        field[4][12] = 1;
//        field[4][13] = 1;
//        field[4][15] = 1;
//        field[4][17] = 1;
//        //4th line
//        field[5][2] = 1;
//        field[5][4] = 1;
//        field[5][6] = 1;
//        field[5][7] = 1;
//        field[5][8] = 1;
//        field[5][9] = 1;
//        field[5][11] = 1;
//        //5th line
//        field[6][2] = 1;
//        field[6][4] = 1;
//        field[6][11] = 1;
//        field[6][12] = 1;
//        field[6][13] = 1;
//        field[6][14] = 1;
//        field[6][15] = 1;
//        field[6][16] = 1;
//        field[6][17] = 1;
//        //6th line
//        field[7][2] = 1;
//        field[7][3] = 1;
//        field[7][4] = 1;
//        field[7][5] = 1;
//        field[7][6] = 1;
//        field[7][8] = 1;
//        field[7][9] = 1;
//        field[7][10] = 1;
//        field[7][11] = 1;
//        field[7][17] = 1;
//        //7h line
//        field[8][2] = 1;
//        field[8][6] = 1;
//        field[8][8] = 1;
//        field[8][9] = 1;
//        field[8][11] = 1;
//        field[8][13] = 1;
//        field[8][14] = 1;
//        field[8][15] = 1;
//        field[8][17] = 1;
//        //8th line
//        field[9][2] = 1;
//        field[9][4] = 1;
//        field[9][6] = 1;
//        field[9][8] = 1;
//        field[9][15] = 1;
//        field[9][17] = 1;
//        //9th line
//        field[10][2] = 1;
//        field[10][4] = 1;
//        field[10][5] = 1;
//        field[10][6] = 1;
//        field[10][7] = 1;
//        field[10][8] = 1;
//        field[10][9] = 1;
//        field[10][10] = 1;
//        field[10][12] = 1;
//        field[10][13] = 1;
//        field[10][15] = 1;
//        field[10][17] = 1;
//        //10th line
//        field[11][10] = 1;
//        field[11][12] = 1;
//        field[11][13] = 1;
//        field[11][15] = 1;
//        field[11][17] = 1;
//        //11thline
//        field[12][2] = 1;
//        field[12][3] = 1;
//        field[12][4] = 1;
//        field[12][6] = 1;
//        field[12][7] = 1;
//        field[12][8] = 1;
//        field[12][10] = 1;
//        field[12][13] = 1;
//        field[12][15] = 1;
//        field[12][17] = 1;
//        //12th line
//        field[13][2] = 1;
//        field[13][4] = 1;
//        field[13][6] = 1;
//        field[13][8] = 1;
//        field[13][10] = 1;
//        field[13][11] = 1;
//        field[13][12] = 1;
//        field[13][13] = 1;
//        field[13][15] = 1;
//        field[13][17] = 1;
//        //13th line
//        field[14][2] = 1;
//        field[14][8] = 1;
//        field[14][15] = 1;
//        //14th line
//        field[15][2] = 1;
//        field[15][3] = 1;
//        field[15][4] = 1;
//        field[15][5] = 1;
//        field[15][6] = 1;
//        field[15][8] = 1;
//        field[15][9] = 1;
//        field[15][10] = 1;
//        field[15][11] = 1;
//        field[15][12] = 1;
//        field[15][13] = 1;
//        field[15][14] = 1;
//        field[15][15] = 1;
//        field[15][17] = 1;
//        //15th line
//        field[16][6] = 1;
//        field[16][11] = 1;
//        field[16][17] = 1;
//        //16thline
//        field[17][1] = 1;
//        field[17][2] = 1;
//        field[17][4] = 1;
//        field[17][6] = 1;
//        field[17][7] = 1;
//        field[17][8] = 1;
//        field[17][9] = 1;
//        field[17][11] = 1;
//        field[17][13] = 1;
//        field[17][14] = 1;
//        field[17][15] = 1;
//        field[17][16] = 1;
//        field[17][17] = 1;
//        //17th line
//        field[18][2] = 1;
//        field[18][4] = 1;
//        field[18][7] = 1;
//        field[18][9] = 1;
//        field[18][11] = 1;
//        field[18][17] = 1;
//        //18yh line
//        field[19][4] = 1;
//        field[19][5] = 1;
//        field[19][11] = 1;
//        field[19][12] = 1;
//        field[19][13] = 1;
//        field[19][14] = 1;
//        field[19][15] = 1;
//        field[19][17] = 1;


    }

    public void wallCollision() {
        if (field[y / 25-2][x / 25-1] == 1) {
            if (pressedA && pressedW) {
                x = x + 1;
                y = y + 1;
            } else if (pressedW) {
                y = y + 1;
            } else if (pressedA) {
                x = x + 1;
            }
        }
        if (field[y / 25-2][(x + 19) / 25-1] == 1) {
            if (pressedD && pressedW) {
                x = x - 1;
                y = y + 1;
            } else if (pressedW) {
                y = y + 1;
            } else if (pressedD) {
                x = x - 1;
            }
        }
        if (field[(y + 19) / 25-2][x / 25-1] == 1) {
            if (pressedA && pressedS) {
                x = x + 1;
                y = y - 1;
            } else if (pressedS) {
                y = y - 1;
            } else if (pressedA) {
                x = x + 1;
            }
        }
        if (field[(y + 19) / 25-2][(x + 19) / 25-1] == 1) {
            if (pressedD && pressedS) {
                x = x - 1;
                y = y - 1;
            } else if (pressedS) {
                y = y - 1;
            } else if (pressedD) {
                x = x - 1;
            }
        }
    }

    public void setXDir(int xDir) {
        xDirection = xDir;
    }

    public void setYDir(int yDir) {
        yDirection = yDir;
    }

    public boolean checkWin() {
        if (y >= 525 && y <= 550 && x >= 475 && x <= 500) {
            return true;
        }
        return false;
    }

    public class ActionListener extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == e.VK_A) {
                setXDir(-1);
                player = left.getImage();
                pressedA = true;
            }
            if (keyCode == e.VK_D) {
                setXDir(+1);
                player = right.getImage();
                pressedD = true;
            }
            if (keyCode == e.VK_W) {
                setYDir(-1);
                pressedW = true;
            }
            if (keyCode == e.VK_S) {
                setYDir(+1);
                pressedS = true;
            }
        }

        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == e.VK_A) {
                setXDir(0);
                pressedA = false;
            }
            if (keyCode == e.VK_D) {
                setXDir(0);
                pressedD = false;
            }
            if (keyCode == e.VK_W) {
                setYDir(0);
                pressedW = false;
            }
            if (keyCode == e.VK_S) {
                setYDir(0);
                pressedS = false;
            }
        }
    }

    public JavaGame(ImageIcon imageLeft, ImageIcon imageRight, String vards) {
        this.vards = vards;
        left = imageLeft;
        right = imageRight;
        player = imageLeft.getImage();

        //Game properties
        setTitle("Labirints");
        setSize(525, 725);
        setResizable(false);
        setBackground(Color.lightGray);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(new ActionListener());

        gamePanel.setSize(525, 725);
        add(gamePanel);
        gamePanel.setLayout(null);
        gamePanel.setVisible(true);

        makeGameField();

        x = 25;
        y = 50;

    }

    @Override
    public void paint(Graphics g) {
        PaintScreen p = new PaintScreen(player, x, y, gamePanel, win, vards, field);
        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        p.paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, gamePanel);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame();
                frame.setTitle("Labirints");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new GameStart());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
