package CodingTest.DFS_BFS;

import java.util.Stack;

public class 거리두기확인하기 {
    public static void main(String[] args) {
     거리두기확인하기 cl  = new 거리두기확인하기();
     String[][] arr=
             {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
             {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
             {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
             {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
             {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}


     };
     cl.solution(arr);

    }
        // places 의 행길이 : 대기실 개수
        // palces 의 열 길이 : 대기실 세로 길이
        // places 의 원소는 P,O,X
        // P : 응시자가 앉아 있는 자리
        // O : 빈테이블
        // X : 파티션
        public int[] solution(String[][] places) {
            int[] answer = {};

            dfs(places, 0);
            return answer;
    }
    public int[] dfs(String[][] places,int depth) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                stack.push(places[i][j]);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.pop());

        }
        return new int[0];
    }
}
