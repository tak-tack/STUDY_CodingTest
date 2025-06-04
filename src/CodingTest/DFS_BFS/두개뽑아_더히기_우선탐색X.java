package CodingTest.DFS_BFS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
public class 두개뽑아_더히기_우선탐색X {

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    // 방법 1. 자료구조_iterator 사용
        public static int[] solution(int[] numbers) {
            HashSet<Integer> answerSet = new HashSet<>();
            for(int i=0;i<numbers.length-1;i++){
                for(int j=i+1; j<numbers.length;j++){
                    answerSet.add(numbers[i] + numbers[j]);
                }
            }
            //Java 8버전 부터 steam 사용 가능
            //answer = answerSet.stream().sorted().mapToInt(Integer::intValue).toArray();
            int[] answer = new int[answerSet.size()];
            Iterator <Integer> iterator = answerSet.iterator();
            int index = 0;
            while(iterator.hasNext()){
                answer[index++] = iterator.next();
            }
            for (int i = 0; i < answer.length - 1; i++) {
                for (int j = 0; j < answer.length - 1 - i; j++) {
                    if (answer[j] > answer[j + 1]) {
                        int temp = answer[j];
                        answer[j] = answer[j + 1];
                        answer[j + 1] = temp;
                    }
                }
            }
                return answer;
        }
}
