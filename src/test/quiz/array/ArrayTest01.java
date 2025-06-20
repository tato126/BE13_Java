package test.quiz.array;

public class ArrayTest01 {
    public static void main(String[] args) {

        // 배열선언
        int[] numArr = new int[10];
        int[] countArr = new int[10];

        // 랜덤의 수 선언
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }

        // 카운트할 배열 선언
        for (int i = 0; i < countArr.length; i++) {
            countArr[numArr[i]]++;
        }

        System.out.println();

        // [랜덤 값 , 중복 카운트]
        for (int i = 0; i < countArr.length; i++) {
            System.out.println(String.format("%d의 개수 %d", i, countArr[i]));
        }

        // 결과
        for (int i = 0; i < countArr.length; i++) {

            // countArr[i]가 1 이상일 때만 수행한다.
            if (countArr[i] >= 1) {

                //  중복된 숫자만큼 반복한다.
                //  -> 동일한 숫자를 여려번 출력한다.
                for (int j = 0; j < countArr[i]; j++) {
                    numArr[j] = i;
                    System.out.print(numArr[j]);

                }
            }
        }
        System.out.println();
    }
}
