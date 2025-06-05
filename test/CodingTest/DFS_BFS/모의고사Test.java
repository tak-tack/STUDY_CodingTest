package CodingTest.DFS_BFS;

import org.junit.jupiter.api.Test;

class 모의고사Test {

    @Test
    void solution() {
        int[] arr = {1,2,3,4,5}; // 1,3,2,4,2

        int[] answer = 모의고사.solution(arr);
        System.out.println("====== 테스트코드 영역 ======");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            System.out.print(" ");

        }

    }
}