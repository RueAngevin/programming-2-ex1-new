package ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of seconds
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();

        // Calculate hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Output the result in the format HH:MM:SS
        System.out.printf("Time period of %d seconds is %02d:%02d:%02d expressed in hours/minutes/seconds.\n",
                totalSeconds, hours, minutes, seconds);

        // Close the scanner
        scanner.close();
    }
}
