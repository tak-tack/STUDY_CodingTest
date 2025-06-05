package CodingTest.DFS_BFS;
import java.util.Arrays;

// answers : 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열
// answer : 가장 많은 문제를 맞힌 사람이 누구인지 배열
public class 모의고사 {
    public static int[] solution(int[] answers) {
        // 수포자들의 찍기 패턴 배열 선언
        int[] p1 = {1, 2, 3, 4, 5};                    // 수포자 1
        //int[] p1 =  {2, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};            // 수포자 2
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};      // 수포자 3
        //int[] p3 = {1,2,3,4,1};

        // 수포자의 정답 수 저장 배열
        int[] scores = new int[3];

        // 정답과 비교하면서 맞은 개수 카운트
        // i % p1.length : 수포자의 찍기 패턴을 무한히 반복하는 효과
        // i : 전체 문제 번호, % p1.length : 수포자 패턴을 벗어나지 않게 제한
        // 결과 : p1 의 5개 패턴을 무한 반복하는 것과 같은 효과
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == p1[i % p1.length]){
                scores[0]++;
            }
            if (answers[i] == p2[i % p2.length]){
                scores[1]++;
            }
            if (answers[i] == p3[i % p3.length]){
                scores[2]++;
            }
        }

        // 가장 높은 점수 구하기
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 반환값 초기화
        int[] answer = new int[0];
        for (int i = 0; i < scores.length; i++) {
            if(max == scores[i]){
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = i+1;
            }

        }
        // 수포자의 점수 출력_내가 보고싶어서 추가
        System.out.println("수포자 // 점수");
        for(int j =0; j < answer.length; j++){
            System.out.println(answer[j] + "번째 // " + scores[j] );
        }

        return answer;
    }
}
