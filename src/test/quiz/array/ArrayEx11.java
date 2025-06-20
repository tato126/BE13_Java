package test.quiz.array;

public class ArrayEx11 {
    public static void main(String[] args) {

        // 무작위 수를 넣지말고 정해진 숫자로 테스트해보자
        // 방법은 다음과 같다
        // 1. 배열 선언
        // 2. 기존의 값을 넣을 빈 통을 하나 선언한다.
        // 3. 선언한 배열이 i와 같으면 값은 그래로이다.

        // 예상되는 결과는 1,2이다.
        int[] testArr = {1, 1, 2};

        int tmp = 0; // 중복되지 않은 수를 임시 저장할 통이다.
        int result = 0;
        int[] notMatchArr = new int[3];

        for (int i = 0; i < testArr.length; i++) {

            // 현재 문제 : tmp는 출력할 수 있다.
            // 하지만 담을 수가 없다.

            // testArr[i]과 비교할 숫자인 i를 같이 찍어보자
            // 새로운 배열에 i를 넣고 기존 배열[i]와 새로운 배열[i]를 비교해서 같지 않으면 tmp에 넣는다.

            // 다시 비교할 통을 값을 넣어보자
            // 왜 안되지?
            // 뭐가 문제이지?

            // 일단 기준이 있어야한다.
            // 비교할 기준이 있어야 같은지 아닌지를 확인한다.
            // 기준을 무엇으로 세울것인가?
            // 입력받은 수로 기준을 세워보자 즉 i를 가져오는 것이다.
            // 같지 않은 i를 배열에 저장하고 다시 출력한다.

            // 10번을 반복해서 돈다.
            tmp = testArr[i];
            System.out.println("tmp이다.>" + tmp);

            System.out.println();

            System.out.println(result);
            // 0부터 시작을 하면 1을 더해서 비교하고 배열에 저장하자
            if (tmp == i) {
                notMatchArr[i] = i;
                System.out.println("일치하지 않는다" + notMatchArr[i]);
            }

            // result를 매 반복문을 끝날 때에 +1한다.
            result++;
        }
        System.out.println();
    }
}
