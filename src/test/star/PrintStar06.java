package test.star;

public class PrintStar06 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 1;

        while (i <= 5) {

            int j = 5;

            while (j > i) {
                System.out.print(" ");
                j--;
            }

            int k = 0;

            while (k < i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}