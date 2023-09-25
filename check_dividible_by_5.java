package conditional_statements_for_interview;

import java.util.Scanner;

public class check_dividible_by_5 {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isDivisibleBy5(number)) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
    }

    public static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
