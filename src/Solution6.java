import java.util.ArrayDeque;
import java.util.Queue;

public class Solution6 {
    Queue<Integer> solution(int N){
        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> tempQueue = new ArrayDeque<>();
        for(int i=1; i<=N; i++){
            queue.add(i);
        }
        while(!queue.isEmpty())
        {
            tempQueue.add(queue.poll()); // 버린 카드
            if(!queue.isEmpty()) {
                queue.add(queue.poll()); // 제일 아래로 옮김
            }
        }


        return tempQueue;
    }
}
