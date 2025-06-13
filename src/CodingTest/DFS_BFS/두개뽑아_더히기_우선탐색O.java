package CodingTest.DFS_BFS;

import java.util.Arrays;
import java.util.HashSet;

public class 두개뽑아_더히기_우선탐색O {

    static HashSet<Integer> resultSet = new HashSet<>();

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,1};
        System.out.println(Arrays.toString(solution(arr)));
    }

        public static int[] solution(int[] numbers) {
            dfs(numbers, 0, 0, 0);
            // 정렬해서 int[] 배열로 반환
            return resultSet.stream().sorted().mapToInt(Integer::intValue).toArray();
        }

    // numbers : 배열
    // depth : 현재까지 선택한 숫자의 개수
    // sum : 선택한 숫자들의 합
    // start : 조합을 위해 다음 탐색을 시작할 인덱스

    private static void dfs(int[] numbers, int depth, int sum, int start) {
        if (depth == 2) { // 두 개의 숫자를 선택한 경우 이므로 더 이상 진행하지 않고 합을 결과 Set 에 저장
            resultSet.add(sum);
            return; // 다음 계산 탐색
        }

        for (int i = start; i < numbers.length; i++) {
            dfs(numbers, depth + 1, sum + numbers[i], i + 1);
        }
    }
}
