package ex2;

import java.util.Scanner;

public class App {
    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedText = new StringBuilder(cleanedText).reverse().toString();

        return cleanedText.equals(reversedText);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String continueChoice;

        do {
            System.out.print("Enter a text to check for palindrome: ");
            userInput = scanner.nextLine();

            if (isPalindrome(userInput)) {
                System.out.println("Yes, the input contains a palindrome.");
            } else {
                System.out.println("No, the input does not contain a palindrome.");
            }

            System.out.print("Do you want to check another text? (yes/no): ");
            continueChoice = scanner.nextLine().trim().toLowerCase();

        } while (continueChoice.equals("yes"));

        scanner.close();
        System.out.println("Goodbye!");
    }
}
