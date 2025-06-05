package CodingTest.Array;

import java.util.Arrays;
public class ArrayListSolution2 {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int idx = 0;
        int temp = 0;
        for(int i=1; i<=n; i++){
            if(i%k==0){
                // 기존 배열을 새로운 배열로 복사(길이를 늘림)
                answer = Arrays.copyOf(answer,answer.length+1);
                temp += k;
                answer[idx] = temp;
                idx++;
            }
        }
        return answer;
    }
}
