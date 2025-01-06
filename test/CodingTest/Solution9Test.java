package CodingTest;

import org.junit.jupiter.api.Test;

class Solution9Test {

    @Test
    void solution() {
        Solution9 solution9 = new Solution9();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String res = solution9.solution(cards1,cards2,goal);
        System.out.println(res);
    }

    @Test
    void solutionFAIL() {
        Solution9 solution9 = new Solution9();
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String res = solution9.solution(cards1,cards2,goal);
        System.out.println(res);
    }

}