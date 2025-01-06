package CodingTest;

import org.junit.jupiter.api.Test;

class Solution11Test {

    @Test
    void solution() {
        Solution11 solution11 = new Solution11();
        String[] par = {"leo", "kiki", "eden"};
        String[] com = {"eden", "kiki"};

        String res = solution11.solution(par,com);
        System.out.println(res);
    }
}