package CodingTest;

import org.junit.jupiter.api.Test;

import java.util.Queue;

class Solution6Test {
    Solution6 solution6 = new Solution6();
    @Test
    void solution(){
        Queue<Integer> res = solution6.solution(7);
        System.out.println(res);
    }
}