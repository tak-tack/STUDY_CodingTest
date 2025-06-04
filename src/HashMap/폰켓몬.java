package HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 폰켓몬 { // 폰켓몬
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        solution(nums);
    }
    public static int solution(int[] nums) {
        int answer = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                List<Integer> list = new LinkedList<>();
                list.add(nums[i]);
                map.put(nums[i], list);
            }else{
                map.get(nums[i]).add(i);
            }
        }
        int i = nums.length / 2;
        //stem.out.println(nums.length);
        for(Integer key : map.keySet()) {
            //System.out.println(map.get(key));
        }
        return answer;
    }

}
