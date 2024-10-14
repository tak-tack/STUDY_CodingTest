import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {

    @Test
    void solution() {
        Solution8 solution8 = new Solution8();
        int[] truck = {7,4,5,6};
        Queue<Integer> res =  solution8.solution(4,2,10,truck);

            System.out.println(res);

    }
}