package CodingTest.DFS_BFS;

public class test {
    int answer = 0; // 전역 변수
    public static void main(String[] args) {
        int[] arg = {1,1,1,1,1};
        test t = new test();
        System.out.println(t.solution(arg,3));
    }

    // numbers : 사용할 수 있는 숫자가 담긴 배열
    // target : 타겟 넘버
    public int solution(int[] numbers, int target){
        dfs(numbers,0,0,target); // 시작점
        return answer;

    }
    // 현재 인덱스(depth) 와 누적합 (sum) 을 기억하면서 재귀 탐색
    // depth : 노드(인덱스)
    // numbers : 데이터 값(가중치)
    // sum : 지금까지 만든 수식의 결과 누적합
    private void dfs(int[] numbers, int depth, int sum, int target){
        if(depth == numbers.length){ // 배열 끝까지 갔을 때
            if(sum == target){
                answer++; // 목표값과 일치하면 카운트 증가
            }
            return;
        }
        dfs(numbers,depth+1,sum+numbers[depth],target);
        dfs(numbers,depth+1,sum-numbers[depth],target);
    }
}
