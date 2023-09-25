package conditional_statements_for_interview;

import java.util.Scanner;
public class find_greatest_no_among_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();


        int greatestNumber = (number1 > number2) ? number1 : number2;


        System.out.println("The greatest number is: " + greatestNumber);
    }
}