import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {
    Solution2 solution2 = new Solution2();

    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 소")
    void solution_SUCESS1() {
        int count = solution2.solution("()");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 중")
    void solution_SUCESS2() {
        int count = solution2.solution("{}");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 대")
    void solution_SUCESS3() {
        int count = solution2.solution("[]");
        System.out.println(count);
    }
    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 소,중")
    void solution_SUCESS4() {
        int count = solution2.solution("{()}");
        System.out.println(count);
    }
    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 소,대")
    void solution_SUCESS5() {
        int count = solution2.solution("[()]");
        System.out.println(count);
    }
    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 중,대")
    void solution_SUCESS6() {
        int count = solution2.solution("[{}]");
        System.out.println(count);
    }
    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 소,중,대")
    void solution_SUCESS7() {
        int count = solution2.solution("[{()}]");
        System.out.println(count);
    }


    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 복합1")
    void solution_SUCESS8() {
        int count = solution2.solution("[{()()}{}]");
        System.out.println(count);
    }


    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 복합2")
    void solution_SUCESS10() {
        int count = solution2.solution("{()}{}[][{()()}{()}{}]");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 복합3")
    void solution_SUCESS11() {
        int count = solution2.solution("[{()()()()()}{()()()()}{()()}{}][{()}]{}()");
        System.out.println(count);
    }
    //	""

    @Test
    @DisplayName("괄호 회전하기 - 성공 _ 복합1")
    void solution_SUCESS9() {
        int count = solution2.solution("}]()[{");
        System.out.println(count);
    }
    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 누락된 우괄호(소)")
    void solution_FAIL1() {
        int count = solution2.solution("(");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 누락된 우괄호(중)")
    void solution_FAIL2() {
        int count = solution2.solution("{");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 누락된 우괄호(대)")
    void solution_FAIL3() {
        int count = solution2.solution("[");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 복합 누락된 우괄호(소)")
    void solution_FAIL5() {
        int count = solution2.solution("[{(}]");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 복합 누락된 우괄호(중)")
    void solution_FAIL6() {
        int count = solution2.solution("[{()]");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 복합 누락된 우괄호(대)")
    void solution_FAIL7() {
        int count = solution2.solution("[{()}");
        System.out.println(count);
    }



    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 대 중복") // 체크하기
    void solution_FAIL8() {
        int count = solution2.solution("[[]]");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 중 중복") // 체크하기
    void solution_FAIL9() {
        int count = solution2.solution("{{}}");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 소 중복") // 체크하기
    void solution_FAIL10() {
        int count = solution2.solution("(())");
        System.out.println(count);
    }

    @Test
    @DisplayName("괄호 회전하기 - 실패 _ 복합 누락된 우괄호(대)")
    void solution_FAIL11() {
        int count = solution2.solution("]}{[");
        System.out.println(count);
    }




}