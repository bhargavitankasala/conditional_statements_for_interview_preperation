package conditional_statements_for_interview;

import java.util.Scanner;

public class check_positive_or_negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive.");
        } 
        else 
            System.out.println("The number is negative.");
        }
    }