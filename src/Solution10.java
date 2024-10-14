import java.util.ArrayDeque;
import java.util.Queue;

public class Solution10 {
    int[] solution(int N, int[] needPizza){
        int[] arriveTime = new int[N];
        Queue<Integer> queuePizza = new ArrayDeque<>();
        int count = 0;
        for(int i =0; i < needPizza.length; i++){
            queuePizza.add(needPizza[i]);
        }
        while(!queuePizza.isEmpty())
        {
            for(int i = 0; i < N; i++){
                if(!queuePizza.isEmpty())
                {
                    if(!queuePizza.peek().equals(0)){
                        queuePizza.add(queuePizza.poll()-1);
                        arriveTime[i]++;
                    }else {
                        queuePizza.poll();
                    }
                }
            }
        }
        return arriveTime;
    }

}
