package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        int hours = 0;
        double payRate = 0;
        double grossPay = hours * payRate;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hours did you work?");
        hours = scanner.nextInt();

        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();
        scanner.close();

        System.out.println("Gross pay: " + grossPay);
    }
}