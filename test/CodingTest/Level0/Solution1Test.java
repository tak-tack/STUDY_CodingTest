package CodingTest.Level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {
    // 홀짝
    Solution1 solution1 = new Solution1();
    @Test
    void solution_odd() { // 홀수
        System.out.println(solution1.solution(5));
    }
    @Test
    void solution_even() { // 짝수
        System.out.println(solution1.solution(6));
    }

    // n의 배수
    @Test
    void solution2_multiple_Multiple(){

        System.out.println(solution1.solution2(20,2));
    }

    @Test
    void solution2_multiple_notMultiple(){
        System.out.println(solution1.solution2(34,3));
    }

}