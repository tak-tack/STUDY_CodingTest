package CodingTest;

import org.junit.jupiter.api.Test;

class Solution5Test {
    Solution5 solution5 = new Solution5();

    @Test
    void solution() {
        int[] processes = {55,55,55};
        int[] speeds = {10,10,10};
        solution5.solution(processes,speeds);
    }
}