import java.util.ArrayDeque;
import java.util.Queue;

public class Solution8 {
    Queue<Integer> solution(int n, int w, int L,  int[] truckWeights){
        // 트럭 큐?
        Queue<Integer> readyTrunk = new ArrayDeque<>();
        for(int i = 0; i<truckWeights.length; i++){
            readyTrunk.add(truckWeights[i]);
        }
        Queue<Integer> acceptTrunk = new ArrayDeque<>(); // 통과 트럭
        if(!readyTrunk.isEmpty() && acceptTrunk.isEmpty()){
            for(int j = 0; j < acceptTrunk.size(); j++){
                if(crossAccept(L,acceptTrunk,truckWeights[j])){
                    acceptTrunk.add(readyTrunk.poll());
                }
            }
        }else {
            acceptTrunk.add(readyTrunk.poll());
        }
        return readyTrunk;
    }
Boolean crossAccept(int L, Queue<Integer> acceptTrunk, int readyTrunk){
        int[] acceptTemp = new int[acceptTrunk.size()];
        int totalWeight = 0;
        for(int i = 0; i < acceptTrunk.size(); i++){
            acceptTemp[i]= acceptTrunk.peek();
            totalWeight += acceptTemp[i];
        }
    totalWeight = totalWeight + readyTrunk;
        if (totalWeight < L){
            return true;
        }else {
            return false;
        }
    }

}




