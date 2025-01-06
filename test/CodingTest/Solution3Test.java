package CodingTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Solution3Test {

    @Test
    @DisplayName("올바른 괄호찾기 - 성공")
    public void solution_SUCESS() {
        Solution3 solution3 = new Solution3();
        solution3.solution(new int[][]{{0,1,2,3,4},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
        //assertTrue(bool);
    }
}