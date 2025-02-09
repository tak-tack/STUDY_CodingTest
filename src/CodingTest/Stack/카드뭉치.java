package CodingTest.Stack;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 카드뭉치 {
    public static void main(String[] args) throws IOException {
        int[] param = {1,1,3,3,0,1,1};
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        카드뭉치 cp = new 카드뭉치();
        System.out.println(cp.solution(cards1,cards2,goal));
    }
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cardQueue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cardQueue2 = new LinkedList<>(Arrays.asList(cards2));
        String answer = "";

        for(int i = 0; i < goal.length; i++){
            if(!cardQueue1.isEmpty() && goal[i].equals(cardQueue1.peek())){
                cardQueue1.poll();
            }else if (!cardQueue2.isEmpty() && goal[i].equals(cardQueue2.peek())){
                cardQueue2.poll();
            } else {
                answer = "No";
                break;
            }
        }
        if(answer.isEmpty()) {
            answer = "Yes";
        }
        return answer;
    }
}
