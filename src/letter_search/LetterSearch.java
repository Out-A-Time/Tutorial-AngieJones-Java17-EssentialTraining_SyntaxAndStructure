package letter_search;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next().toLowerCase();
        scanner.close();

        boolean letterFound = false;

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'a') {
                letterFound = true;
                System.out.println("String contain letter 'a': " + letterFound);
                ;
                break;
            }
        }
    }

}
