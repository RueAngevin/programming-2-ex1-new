package ex3;

public class D {
    public static void main(String[] args) {
        int top = 5;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= (top - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        int bottom = 5;

        for (int i = bottom; i >= 1; i--) {
            for (int j = 1; j <= bottom - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
