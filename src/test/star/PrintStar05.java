package test.star;

public class PrintStar05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 1;

        while (i <= 5) {

            int j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
