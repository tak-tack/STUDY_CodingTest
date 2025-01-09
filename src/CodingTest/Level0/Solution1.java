package CodingTest.Level0;

public class Solution1 {
    /*
양의 정수 n이 매개변수로 주어질 때,
n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을
 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의
  제곱의 합을 return 하는 solution 함수를 작성해 주세요.
- 제약 사항 : 1 ≤ n ≤ 100
 */
    public int solution(int n) {
        int answer = 0;
        if(n%2 != 0) {// 홀수
            for(int i=0; i<=n; i++){
                if(i%2 != 0){ // 홀수의 합
                    answer += i;
                }
            }
        }else { // 짝수
            for(int j=0; j<=n+1; j++){
                if(j%2 == 0) {
                    answer += j * j; // 모든 정수의 제곱 합
                }
            }
        }

        return answer;
    }
    /*
    정수 num 과 n이 매개 변수로 주어질 때, num 이 n의 배수이면
    1을 return n의 배수가 아니라면 0을
     return하도록 solution 함수를 완성해주세요.
     */
    public int solution2(int num, int n) {
        int answer = 0;
        if (num % n == 0) {
            answer = 1;
        }
        return answer;
    }
}
