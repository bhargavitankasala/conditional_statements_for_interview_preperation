package conditional_statements_for_interview;

import java.util.Scanner;

public class additon_withut_plus_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int sum = add(a, b);

        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;  
            a = a ^ b;          
            b = carry << 1;     
        }

        return a;
    }
}
