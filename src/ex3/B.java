package ex3;

public class B {
    public static void main(String[] args) {

        for(int i = 1; i <= 11; i++){
            for (int j = 1; j <= 11 - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
