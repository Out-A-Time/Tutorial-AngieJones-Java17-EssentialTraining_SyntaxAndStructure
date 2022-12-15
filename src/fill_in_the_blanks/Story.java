package fill_in_the_blanks;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        String adjective = "";
        String season = "";
        String number = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give adjective: ");
        adjective = scanner.next().toUpperCase();

        System.out.println("Give season: ");
        season = scanner.next().toUpperCase();

        System.out.println("Give number of coffee cups: ");
        number = scanner.next().toUpperCase();

        System.out.println("On a " + adjective + " " + season + " day," + "\n"
                + "I drink a minium of " + number + " cups of coffee.");
    }
}