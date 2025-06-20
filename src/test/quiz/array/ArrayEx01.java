package test.quiz.array;

public class ArrayEx01 {
    public static void main(String[] args) {

        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }

        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 :" + counter[i]);
        }

        // 중복이 제거된 결과 출력하기
        // 수를 읽어온다.
        // 0부터 순서대로 순회한다.
        // 순회하면서 카운트가 1보다 크면
        // numArr[i]는 = i이다.
        for (int i = 0; i < numArr.length; i++) {

            // 카운터가 1 이상이면 numArr[i]에 i를 저장하고 출력한다.
            if (counter[i] >= 1) {
                numArr[i] = i;
                System.out.print(numArr[i]);
            }
        }

        System.out.println();
        System.out.println("최종 답은 : 345679");

    }
}
