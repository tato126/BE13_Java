package test.star.practice;

public class Practice03 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(String.format("[%d, %d]", i, j));
            }
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
