package conditional_statements_for_interview;

import java.util.Scanner;

public class check_vowel_constant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a character: ");
        char character = scanner.next().toLowerCase().charAt(0);


        if (isVowel(character)) {
            System.out.println(character + " is a vowel.");
        } else {
            System.out.println(character + " is a consonant.");
        }
    }

    public static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}