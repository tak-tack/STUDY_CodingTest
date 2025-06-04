package CodingTest.Tree;

public class 예상대진표 {
    public static void main(String[] args) {
        // n : 참가자, a : 참가자번호, b : 경쟁자 번호
        System.out.println(solution(8,4,7));
    }
    public static int solution(int n, int a, int b)
    {
        int answer;
        for(answer = 0; a!=b; answer++){ // a,b 가 동일할때 까지 반복 0 1 2 3
            a = (a+1) / 2; // 다음 라운드 번호 계산  2 1 1
            b = (b+1) / 2; // 다음 라운드 번호 계산  4 2 1
            // 매 라운드마다 이전 번호의 절반으로 변환됨 > 홀수든 짝수든 (번호+1)/2 를 하면 다음 라운드의 번호가 됨
            // 바뀌는건 참가자의 번호
        }
        return answer;
    }

}
