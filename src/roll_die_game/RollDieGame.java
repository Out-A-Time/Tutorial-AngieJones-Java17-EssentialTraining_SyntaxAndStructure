package roll_die_game;

import java.util.Scanner;

public class RollDieGame {
    public static void main(String[] args) {
        int position = 0;
        int movesLeft = 5;
        Scanner scanner = new Scanner(System.in);

        while (position < 20 && movesLeft > 0) {
            System.out.println("Your current position on the board: " + position + " from 20");
            System.out.println("Rolls left: " + movesLeft);
            System.out.println("Type 'roll' to roll the die: ");
            String textInput = scanner.next();

            if (textInput == "roll") {
                int rollDie = (int) Math.round(Math.random() * 6);
                System.out.println("You rolled: " + rollDie);
                position = position + rollDie;
                movesLeft = movesLeft - 1;

            } else {
                System.out.println("########################################");
                System.out.println("You have to type 'roll' to play the game");
            }
        }

        scanner.close();
    }

}
