package ex3;

public class C {

    public static void main(String[] args) {

        for(int i = 11; i >= 1; i--){

            for (int k = 11 - i; k > 0; k--) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
