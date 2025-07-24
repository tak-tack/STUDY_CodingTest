package CodingTest.Sort;

import java.util.Collections;
import java.util.PriorityQueue;

/*
이중 우선순위 큐는 다음 연산을 할 수 있는 자료구조를 말한다.
| 숫자 : 큐에 주어진 숫자를 삽입
D 1 : 큐에서 최댓값을 삭제
D -1 : 큐에서 쵯소값을 삭제

이중 우선순위 큐가 할 연산 operations 가 매개변수 로 주어질 때, 모든 연산을 처리한 후 큐가 비어 있으면
[0,0] 비어있지 않으면 [최댓값, 최솟값] 을 return 하도록 함수를 구현하라
 */
public class 이중우선순위큐 {
    static PriorityQueue<Integer> pq = new PriorityQueue<>();

    public static void main(String[] args) {
        String[] array =
                //{"I 16","I -5643","D -1","D 1","D 1","I 123","D -1"};
         {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        이중우선순위큐 sol = new 이중우선순위큐();
        int[] arr =  sol.solution(array);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public int[] solution(String[] operations) {
        int[] answer = {};
        int small = 0;
        int big = 0;
        boolean reverseCheck = false; // false 일경우 작은값이 우선순위

        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < operations.length; i++){
                if(operations[i].charAt(0) == 'I'){
                    pq.offer(Integer.parseInt(operations[i].substring(2)));
                }else if(operations[i].charAt(0) == 'D' && operations[i].charAt(2) == '-' && !pq.isEmpty()) { // 최솟값 삭제
                    if(reverseCheck){
                        reverse();
                    }else{
                        pq.poll();
                    }
                }else if(operations[i].charAt(0) == 'D' && operations[i].charAt(2) != '-' && !pq.isEmpty()){ // 최댓값 삭제
                    if(!reverseCheck){
                        reverse();
                    }else{
                        pq.poll();
                    }
                    reverseCheck = true;
                }else {
                    System.out.println("ERROR~");
                }
        }
        if(!pq.isEmpty()){
            if(!reverseCheck){
                small= pq.poll();
                //reverse();
                big = reverseAndPoll();
            }else {
                big = pq.poll();
                //reverse();
                small = reverseAndPoll();
            }
        }
        answer = new int[]{small, big};
        return answer;
    }
    public static void reverse() {
        PriorityQueue<Integer> pqTemp = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i < pq.size(); i++){
            pqTemp.add(pq.poll());
        }
        pq = pqTemp;
        //System.out.println(pq);
    }
    public static int reverseAndPoll(){
        PriorityQueue<Integer> pqTemp = new PriorityQueue<>(Collections.reverseOrder());
//        for(int i=0; i < pq.size(); i++){
//            pq.poll();
//        }
        pqTemp = pq;
        return pqTemp.poll();
    }
}
