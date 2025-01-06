package CodingTest;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution5 {

    // progresses : 작업의 진도. speeds : 작업의 개발 속도
    public int[] solution(int[] progresses, int[] speeds) {
        int count = 0;
        int[] answer = {};
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i : progresses) {
            queue.add(i);
        }
        while(!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                if (queue.peek() >= 100) {
                    queue.poll();
                    count++;
                } else {
                    queue.add(queue.poll() + speeds[i]);
                }

            }
        }
        return answer;
    }

}
