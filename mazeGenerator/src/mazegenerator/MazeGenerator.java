/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegenerator;

import java.util.Random;

/**
 *
 * @author Davis
 */
public class MazeGenerator {

    static int maze[][] = new int[9][9];

    public static void main(String[] args) {
        int minColumn = 1, minRow = 1, maxColumn = 4, maxRow = 4;
        generateMaze(minColumn, maxColumn, minRow, maxRow);
        print();
    }

    public static void print() {
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 9; k++) {
                System.out.print(maze[i][k]);
            }
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            System.out.print("+");
        }
        System.out.println();
    }

    private static void generateMaze(int minColumn, int maxColumn, int minRow, int maxRow) {

        int width = maxColumn - minColumn;
        int height = maxRow - minRow;

        if (width >= 0 && height >= 0) {
            if ("VERTICAL".equals(getOrientation(height, width))) {
                splitVertical(minColumn, maxColumn, minRow, maxRow);
            } else {
                splitHorizontal(minColumn, maxColumn, minRow, maxRow);
            }
        }
    }

    private static void splitVertical(int minColumn, int maxColumn, int minRow, int maxRow) {
        int randomColumn = getRandomNumber(minColumn, maxColumn) * 2 - 1;
        int x = 0;
        if (minRow - 1 == 0) {
            x = minRow - 1;
        } else {
            x = minRow*2-1;
        }

        for (int i = x; i <= maxRow * 2; i++) {
            maze[i][randomColumn] = 1;
        }
        maze[(getRandomNumber(minRow - 1, minRow)) * 2][randomColumn] = 0;
        print();
        System.out.println(randomColumn + " " + maxColumn + " " + minRow + " " + maxRow);

        generateMaze(minColumn, ((randomColumn + 1) / 2) - 1, minRow, maxRow);
        generateMaze(((randomColumn + 1) / 2) + 1, maxColumn, minRow, maxRow);
    }

    private static void splitHorizontal(int minColumn, int maxColumn, int minRow, int maxRow) {
        int randomRow = getRandomNumber(minRow, maxRow) * 2 - 1;
        int x = 0;
        if (minColumn - 1 == 0) {
            x = minColumn - 1;
        } else {
            x = minColumn*2-1;
        }
        for (int i = x; i <= maxColumn * 2; i++) {
            maze[randomRow][i] = 1;
        }
        maze[randomRow][(getRandomNumber(minColumn - 1, maxColumn)) * 2] = 0;
        print();
        System.out.println(minColumn + " " + maxColumn + " " + randomRow + " " + maxRow);
        generateMaze(minColumn, maxColumn, minRow, (randomRow + 1) / 2 - 1);
        generateMaze(minColumn, maxColumn, (randomRow + 1) / 2 + 1, maxRow);
    }

    private static String getOrientation(int height, int width) {
        Random rand = new Random();
        if (height > width) {
            return "HORIZONTAL";
        } else if (width > height) {
            return "VERTICAL";
        } else {
            int randomNumber = rand.nextInt(2);
            if (randomNumber == 0) {
                return "HORIZONTAL";
            } else {
                return "VERTICAL";
            }
        }
    }

    private static int getRandomNumber(int x, int y) {
        int minimum = x;
        int maximum = y;
        int randomNumber = 0;
        Random rand = new Random();
        randomNumber = rand.nextInt((maximum - minimum) + 1) + minimum;
        return randomNumber;
    }

}
