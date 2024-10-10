import java.util.ArrayDeque;
import java.util.Queue;

public class Solution5 {

    // progresses : 작업의 진도. speeds : 작업의 개발 속도
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {1};
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i : progresses) {
            queue.add(i);
        }
        while(!queue.isEmpty()) {
            for (int i = 0; i < speeds.length; i++) {
                int num = queue.remove() + speeds[i];
                if (num >= 100) {
                    queue.poll();
                    answer[0]++;
                } else {
                    queue.add(num);
                }
            }
        }
        return answer;
    }

}
