package CodingTest.DFS_BFS;

public class 모음사전 {
    public int solution(String word) {
        int answer = 0;
        String[] dictionary = new String[word.length()];
        dfs(dictionary, 0,0,0);
        return answer;
    }

    // dfs의 기본: 인자값 depth, 종료 조건 과 반환
    private static void dfs(String[] dictionary, int depth, int sum, int start) {
        if (depth == 2) { // 두 개의 숫자를 선택한 경우 이므로 더 이상 진행하지 않고 합을 결과 Set 에 저장
            //resultSet.add(sum);
            return; // 다음 계산 탐색
        }

        for (int i = start; i < dictionary.length; i++) {
            //dfs(dictionary, depth + 1, dictionary[i], i + 1);
        }


    }

}
