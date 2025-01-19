package ex2;

import java.util.Scanner;

public class App {
    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String text) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned text is equal to its reverse
        String reversedText = new StringBuilder(cleanedText).reverse().toString();

        return cleanedText.equals(reversedText);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String continueChoice;

        // Loop to repeatedly ask for input and check for palindromes
        do {
            // Get user input
            System.out.print("Enter a text to check for palindrome: ");
            userInput = scanner.nextLine();

            // Check if the input is a palindrome
            if (isPalindrome(userInput)) {
                System.out.println("Yes, the input contains a palindrome.");
            } else {
                System.out.println("No, the input does not contain a palindrome.");
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to check another text? (yes/no): ");
            continueChoice = scanner.nextLine().trim().toLowerCase();

        } while (continueChoice.equals("yes"));

        // Close the scanner
        scanner.close();
        System.out.println("Goodbye!");
    }
}
