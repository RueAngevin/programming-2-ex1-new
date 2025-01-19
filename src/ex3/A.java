package ex3;

public class A {
    public static void main(String[] args) {

        for(int i = 1; i <= 11; i++){
            for (int j = 1; j <= 11 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
