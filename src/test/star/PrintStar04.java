package test.star;

public class PrintStar04 {
    public static void main(String[] args) {

        int a = 1;

        while (a <= 5) {

            int b = 1;

            while (b <= a) {
                System.out.print(" ");
                b++;
            }

            System.out.print("*");

            int j = 5;

            while (j >= b) {
                System.out.print(" ");
                j--;
            }

            System.out.println("*");
            a++;
        }

        int i = 1;

        while (i <= 5) {

            int j = 5;

            while (j >= i) {
                System.out.print(" ");
                j--;
            }

            System.out.println("*");
            i++;
        }
    }
}
