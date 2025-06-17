package test.star;

public class PrintStar07 {
    public static void main(String[] args) {

        int total = 5;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < total; j++) {
                System.out.print("*");
            }

            total++;
            System.out.println();
        }
    }
}