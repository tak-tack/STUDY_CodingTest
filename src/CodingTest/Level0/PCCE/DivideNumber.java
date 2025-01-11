package CodingTest.Level0.PCCE;

import java.util.Scanner;
/*
2자리 이상의 정수 number가 주어집니다.
주어진 코드는 이 수를 2자리씩 자른 뒤, 자른 수를 모두 더해서
그 합을 출력하는 코드입니다.
코드가 올바르게 작동하도록 한 줄을 수정해 주세요.
 */
public class DivideNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(int i=0; i<20000; i++){  // i<1 ->> i<5 입력값 제한사항으로 인해 number /= 100; 를 통해 확인하는 최대 횟수는 5번이다
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
