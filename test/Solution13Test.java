import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution13Test {
    @Test
    void solution() {
        Solution13 solution13 = new Solution13();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] result = solution13.solution(id_list, report, k);

        System.out.println(Arrays.toString(result)); // 결과 출력

    }

}