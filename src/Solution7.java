import java.util.ArrayDeque;
import java.util.Queue;

public class Solution7 {
    Queue<Integer> solution(int N, int K)
    {
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> responseQueue = new ArrayDeque<>();
        for(int i=1; i<=N; i++){
            queue.add(i);
        }
        while(!queue.isEmpty())
        {
        for(int i = 1; i < K; i++){
                queue.add(queue.poll());
        }
            responseQueue.add(queue.poll());
        }
        return responseQueue;
    }
}


