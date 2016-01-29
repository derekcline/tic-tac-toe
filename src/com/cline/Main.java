package com.cline;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create game and initialize it.
        // First player will be 'x'
        TicTacToe game = new TicTacToe();

        boolean running = true;
        while (running) {
            // Player 'x' places a mark in the top right corner row 0, column 2
            // These values are based on a zero index array

            Scanner scanner = new Scanner(System.in);

            boolean round_active = true;
            int row = 0;
            int col = 0;
            while (round_active) {

                System.out.printf("%s Enter row to play: ", game.getCurrentPlayerMark());
                row = scanner.nextInt();

                System.out.printf("%s Enter column to play: ", game.getCurrentPlayerMark());
                col = scanner.nextInt();

                System.out.printf("%s played row %d, col %d\n", game.getCurrentPlayerMark(), row, col);

                round_active = game.checkSpaceValidAndAvailable(row, col);
            }
            game.placeMark(row, col);

            game.printBoard();

            // Did we have a winner?
            if (game.checkForWin()) {
                System.out.println("We have a winner! Congrats!");
                //System.exit(0);
                running = false;
            } else if (game.isBoardFull()) {
                System.out.println("Appears we have a draw!");
                //System.exit(0);
                running = false;
            }

            // No winner or draw, switch players to 'o'
            game.changePlayer();

            // Repeat steps again for placing mark and checking game status...
        }


    }
}
