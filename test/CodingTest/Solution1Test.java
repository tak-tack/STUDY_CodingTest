package CodingTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {
    Solution1 solution1 = new Solution1();

    @Test
    @DisplayName("올바른 괄호찾기 - 성공 ")
    public void solution_SUCESS() {
        boolean bool = solution1.solution("(()())");
        assertTrue(bool);
    }

    @Test
    @DisplayName("올바른 괄호찾기 - 실패_누락된 우괄호")
    public void solution_FAIL1() {
        boolean bool = solution1.solution("(()()");
        assertFalse(bool);
    }

    @Test
    @DisplayName("올바른 괄호찾기 - 실패_누락된 좌괄호")
    public void solution_FAIL2() {
        boolean bool = solution1.solution("())");
        assertFalse(bool);
    }

    @Test
    @DisplayName("올바른 괄호찾기 - 실패_단일값1")
    public void solution_FAIL3() {
        boolean bool = solution1.solution("(");
        assertFalse(bool);
    }

    @Test
    @DisplayName("올바른 괄호찾기 - 실패_단일값2")
    public void solution_FAIL4() {
        boolean bool = solution1.solution(")");
        assertFalse(bool);
    }

    @Test
    @DisplayName("올바른 괄호찾기 - 실패_정상 괄호 후 누락된 우괄호")
    public void solution_FAIL5() {
        boolean bool = solution1.solution("(())(");
        assertFalse(bool);
    }
    @Test
    @DisplayName("올바른 괄호찾기 - 실패_정상 괄호 후 누락된 우괄호")
    public void solution_FAIL6() {
        boolean bool = solution1.solution("(()))");
        assertFalse(bool);
    }



}