package Programming_1;

import java.util.Scanner;

public class Calculate_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operationList = "1. Add \n" + "2. substract \n" + "3. multiply \n" + "4. divide \n" + "5. exponentiation";

        // It is possible to add more than 2 variables and the program will still work
        int[] numbers = new int[2];
        System.out.println("Enter number: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter another number: ");
        numbers[1] = scanner.nextInt();


        System.out.println("Choose an operation: ");
        System.out.println(operationList);

        int selectedOperation;

        do {
            selectedOperation = scanner.nextInt();
            // TODO: add an error message
        } while (selectedOperation < 1 || selectedOperation > 5);

        if (selectedOperation == 1) sum(numbers);
        if (selectedOperation == 2) subtraction(numbers);
        if (selectedOperation == 3) multiplication(numbers);
        if (selectedOperation == 4) division(numbers);
        if (selectedOperation == 5) exponentiation(numbers);
    }

    public static void sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        System.out.println("The result is: " + result);
    }

    public static void subtraction(int[] numbers) {
        // this take in count the order of the numbers so if the first number is smaller
        // the result is going to be a negative value
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        System.out.println("The result is: " + result);
    }

    public static void multiplication(int[] numbers) {
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 == numbers.length) break;
            result = numbers[i] * numbers[i + 1];
        }

        System.out.println("The result is: " + result);
    }

    public static void division(int[] numbers) {
        int result = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 == numbers.length) break;
            result = numbers[i] / numbers[i + 1];
        }

        System.out.println("The result is: " + result);
    }

    public static void exponentiation(int[] numbers) {
        int result = 1;

        for (int i = 0; i < numbers[1]; i++) {
            result *= numbers[0];
        }

        System.out.println("The result is: " + result);
    }
}
