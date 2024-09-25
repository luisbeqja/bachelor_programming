package Programming_1.Numbers;

import java.util.Scanner;

public class Numbers_V2 {
    static final int MINIMUM = 100000;
    static final int MAXIMUM = 999999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        do {
            System.out.print("Enter a 6-digit whole number: ");
            firstNumber = scanner.nextInt();
            if (!hasSixDigits(firstNumber)) System.out.println("Invalid number");
        } while (!hasSixDigits(firstNumber));

        int secondNumber;
        do {
            System.out.print("Enter another 6-digit whole number: ");
            secondNumber = scanner.nextInt();
            if (!hasSixDigits(secondNumber)) System.out.println("Invalid number");
        } while (!hasSixDigits(secondNumber));


        long result = (long) firstNumber * secondNumber;
        System.out.println("The product is " + result);
        System.out.print("Enter another 5-digit whole number: " + result % 100000);

    }

    private static boolean hasSixDigits(long number) {
        return number >= MINIMUM && number <= MAXIMUM;
    }
}
