/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagame;

import java.util.Random;

/**
 *
 * @author Davis
 */
public class GameField {

    int maze[][] = new int[20][20];
    boolean firstSplit = true;

    public GameField(int field[][]) {
        int minColumn = 1, minRow = 1, maxColumn = 9, maxRow = 9;
        generateMaze(minColumn, maxColumn, minRow, maxRow);
        field = maze;
    }

    private void generateMaze(int minColumn, int maxColumn, int minRow, int maxRow) {

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

    private void splitVertical(int minColumn, int maxColumn, int minRow, int maxRow) {
        int randomColumn = 0, randomRow = 0;
        if (firstSplit) {
            randomColumn = 5;
            randomRow = 10;
            firstSplit = false;
        } else {
            randomColumn = getRandomNumber(minColumn, maxColumn) * 2 - 1;
            randomRow = (getRandomNumber(minRow - 1, minRow)) * 2;
        }
        int x = 0;
        if (minRow - 1 == 0) {
            x = minRow - 1;
        } else {
            x = minRow * 2 - 2;
        }

        for (int i = x; i <= maxRow * 2; i++) {
            maze[i][randomColumn] = 1;
        }
        maze[randomRow][randomColumn] = 0;

        generateMaze(minColumn, ((randomColumn + 1) / 2) - 1, minRow, maxRow);
        generateMaze(((randomColumn + 1) / 2) + 1, maxColumn, minRow, maxRow);
    }

    private void splitHorizontal(int minColumn, int maxColumn, int minRow, int maxRow) {
        int randomRow = 0, randomColumn = 0;
        if (firstSplit) {
            randomRow = 5;
            randomColumn = 10;
            firstSplit = false;
        } else {
            randomColumn = (getRandomNumber(minColumn - 1, maxColumn)) * 2;
            randomRow = getRandomNumber(minRow, maxRow) * 2 - 1;
        }
        int x = 0;
        if (minColumn - 1 == 0) {
            x = minColumn - 1;
        } else {
            x = minColumn * 2 - 2;
        }
        for (int i = x; i <= maxColumn * 2; i++) {
            maze[randomRow][i] = 1;
        }
        maze[randomRow][randomColumn] = 0;

        generateMaze(minColumn, maxColumn, minRow, (randomRow + 1) / 2 - 1);
        generateMaze(minColumn, maxColumn, (randomRow + 1) / 2 + 1, maxRow);
    }

    private String getOrientation(int height, int width) {
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

    private int getRandomNumber(int x, int y) {
        int minimum = x;
        int maximum = y;
        int randomNumber = 0;
        Random rand = new Random();
        randomNumber = rand.nextInt((maximum - minimum) + 1) + minimum;
        return randomNumber;
    }
}
