package CodingTest.season2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 영어끝말잇기
{
    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        영어끝말잇기.solution(n, words);
    }
    public static int[] solution(int n, String[] words) {
        int[] answer = {};
        Queue<String> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) { // 모듈러 연산/
            // 집합이란 중복되지않은 value값을 관리(hashset)
            queue.add(words[i]);

        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

}


