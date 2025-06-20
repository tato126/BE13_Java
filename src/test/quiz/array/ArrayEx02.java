package test.quiz.array;

public class ArrayEx02 {
    public static void main(String[] args) {

        // 0~9까지의 랜덤의 숫자 중
        // 정렬된 결과를 반환해야 한다.

        int[] numArr = new int[10];
        int[] counter = new int[10];

        // 0~9 까지의 임의의 수를 찍는다.
        for (int i = 0; i < counter.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i]);
        }

        System.out.println();
        // 반복하면서 각 인덱스 값 마다 ++ 한다.
        // 이걸 어떻게 활용한다는거지?
        // 나는 tmp 써서 기준값을 만들고 바꾼다고 생각했는데
        // 이걸 어떻게 해결하겠다는거지?

        for (int i = 0; i < counter.length; i++) {
            counter[numArr[i]]++;
        }

        // 모든 값 출력
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "의 개수 " + counter[i]);
        }

        // 출력할 정렬된 배열
        int[] sortedArr = new int[numArr.length];

        // 정렬된 결과를 반환해보자
        for (int i = 0; i < counter.length; i++) {

            // 현재 한번 출력되고 있다
            // 중복되는 순자가 순차적으로 출력되어야 한다.
            // ex) 0이 두 개면 -00- 이렇게 찍여야 한다.

            // 0이 두개면 0 0 이렇게 출력되어야 한다.
            // 어떻게 0을 두 번 출력하지? -> 반복문을 한번 더 써야하나?

            // 카운터 i가 0보다 크면 즉 1개 이상이면 출력한다.
            // 그런데 2개 이상이면? 두 번 찍어야하잖아 -> 이거 반복문 써야하는거 아니야?
            // 카운터가 1개보다 크면 두 번 찍어야 하는거 아니냐고 이걸

            // 자리 바꾸는 것만 반복문을 2번 쓴다. -> 1번만 쓰면 천재아닌가요?
            // 강사님과 푼 사람들은 천재인가

            // 만약에 카운팅이 2 이상이면 카운팅 숫자만큼 출력한다.

            if (counter[i] > 0) { // 중복된 숫자의 개수가 1개 이상이면
                sortedArr[i] = i; // 카운팅이 된 숫자를 하나씩 넣어준다.

                // 그런데 1번만 출력되고 있다.
                // 어떻게 해야하는가? 다들 천재인건가
                System.out.print(sortedArr[i]); // 중복된 숫자의 개수가 1개 이상인 숫자를 출력한다.
            }
        }
        System.out.println();
    }
}
