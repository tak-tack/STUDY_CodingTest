package CodingTest.Tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class 다단계칫솔판매 {
    public static void main(String[] args) {
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller = {"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};
        System.out.println(Arrays.toString(solution(enroll, referral, seller, amount)));


    }
    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = {};
        HashMap<String,Integer> hs = new HashMap<>();
        for(int i =0; i<enroll.length; i++){
            //for(int)
            hs.put(enroll[i],0);
        }

        return answer;
    }


}
