package test.star.practice;

public class Practice01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(String.format("[%d, %d]", i, j));
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(String.format("*"));
            }
            System.out.println();
        }
    }
}
