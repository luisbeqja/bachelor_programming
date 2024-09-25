package Programming_1;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the VAT percentage: ");
        int vatPercentage = scanner.nextInt();

        System.out.println("Enter an amount in €: ");
        int amountInEuro = scanner.nextInt();

        System.out.println("Make a choice (1 = inclusive, 2 = exclusive): ");

        boolean isInclusive = scanner.nextInt() == 1;

        if (isInclusive) {
            float rowAmount = amountInEuro - vatPercentage;
            float result = (rowAmount * vatPercentage / 100) + rowAmount;
            System.out.println("€" + rowAmount + " + " + (float)vatPercentage + "% VAT = " + "€" + result);
        }
        if (!isInclusive) {
            float result = ((float)amountInEuro * vatPercentage / 100) + amountInEuro;
            System.out.println("€" + amountInEuro + " + " + (float)vatPercentage + "% VAT = " + "€" + result);
        }
    }
}
