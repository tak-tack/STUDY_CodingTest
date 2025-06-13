package CodingTest.backtraking;

import java.util.HashSet;

public class 소수찾기 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42839
    // 모든 탐색을 넣을때는 length 가 굳이 필요없다. depth 가 의미 없을 수도 있음
    static boolean[] visited = new boolean[7]; // numbers 는 길이 1 이상 7 이하인 문자열
    static HashSet<Integer> resultSet = new HashSet<>(); // 노드 중복 제거

    public static void main(String[] args) {
        String numbers = "011";
        System.out.println(solution(numbers));

    }

    public static int solution(String numbers) {
        int answer = 0; // 소수 갯수
        String[] array = new String[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            array[i] = String.valueOf(numbers.charAt(i)); // numbers 값을 하나씩 행렬에 넣음
            //System.out.println(array[i]);
        }

        // dfs 함수 호출_핵심 알고리즘
        // now emptyString 으로 초기화
        dfs(numbers,0,"");
        // 소수 판별
        for (int n : resultSet) {
            if (isPrimeNumber(n)) {
                answer++;
            }
        }
        return answer;
    }

     static void dfs(String numbers, int depth, String now) {
         // 탈출 조건_더 이상 조합할 숫자가 없을 경우
          if (depth == numbers.length())  {
             return; // 다음 계산 탐색
         }

         for (int i = 0; i < numbers.length(); i++) {
             // 방문 상태 가 false 일 경우
             if(!visited[i]) {
                 visited[i] = true;
                 // 조합된 숫자를 result Set 에 인입
                 // now+numbers.charAt(i) : 조합된 숫자
                 String str = now + numbers.charAt(i);
                 System.out.println(str);
                 // 정수형으로 변환하며 011 일경우 11 로 저장
                 resultSet.add(Integer.parseInt(now+numbers.charAt(i)));
                 // 재귀 호출
                 // 다음 numbers, depth, 조합된 숫자로 dfs 호출
                 dfs(numbers, depth+1, now+numbers.charAt(i));
                 // 백트래킹
                 // 탐색이 종료 후 방문 상태를 초기화 >>> 탐색한 경로를 제외하고 다른 조합을 탐색
                 visited[i] = false;
             }
         }

     }

    static boolean isPrimeNumber(int number){
        // 0 과 1 은 소수 X
        if(number < 2) {
            System.out.println(number + " 는 소수가 아닙니다");
            return false;
        }
        // 2 는 소수 O
        if(number == 2) {
            System.out.println(number + " 는 소수입니다");
            return true;
        }
        for(int i = 2; i < number; i++) {

            // 소수가 아닐경우
            if(number % i == 0) {
                System.out.println(number + " 는 소수가 아닙니다");
                return false;
            }
        }
        // 위 반복문에서 약수를 갖고 있지 않는경우 소수
        System.out.println(number + " 는 소수입니다");
        return true;
    }
}
