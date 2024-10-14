import java.util.ArrayDeque;
import java.util.Queue;

public class Solution6 { // 카드 뭉치
    Queue<Integer> solution(int N){
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> tempQueue = new ArrayDeque<>();
        for(int i=1; i<=N; i++){
            queue.add(i);
        }
        while(!queue.isEmpty())
        {
            tempQueue.add(queue.poll());
            if(!queue.isEmpty()) {
                queue.add(queue.poll());
            }
        }
        return tempQueue;
    }
}
