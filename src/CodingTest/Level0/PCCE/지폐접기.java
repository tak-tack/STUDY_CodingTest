package CodingTest.Level0.PCCE;

import java.util.Arrays;

/*
민수는 다양한 지폐를 수집하는 취미를 가지고 있습니다. 지폐마다 크기가 달라 지갑에 넣으려면 여러 번 접어서 넣어야 합니다.
예를 들어 지갑의 크기가 30 * 15이고 지폐의 크기가 26 * 17이라면 한번 반으로 접어 13 * 17 크기로 만든 뒤 90도 돌려서 지갑에 넣을 수 있습니다.
지폐를 접을 때는 다음과 같은 규칙을 지킵니다.

지폐를 접을 때는 항상 길이가 긴 쪽을 반으로 접습니다. /2
접기 전 길이가 홀수였다면 접은 후 소수점 이하는 버립니다.
접힌 지폐를 그대로 또는 90도 돌려서 지갑에 넣을 수 있다면 그만 접습니다.
지갑의 가로, 세로 크기를 담은 정수 리스트 wallet과 지폐의 가로,
세로 크기를 담은 정수 리스트 bill가 주어질 때, 지갑에 넣기 위해서 지폐를 최소 몇 번 접어야 하는지
return하도록 solution함수를 완성해 주세요.
지폐를 지갑에 넣기 위해 접어야 하는 최소 횟수를 구하는 과정은 다음과 같습니다.

    1. 지폐를 접은 횟수를 저장할 정수 변수 answer를 만들고 0을 저장합니다.
    2. 반복문을 이용해 bill의 작은 값이 wallet의 작은 값 보다 크거나 bill의 큰 값이 wallet의 큰 값 보다 큰 동안 아래 과정을 반복합니다.
    2-1. bill[0]이 bill[1]보다 크다면 bill[0]을 2로 나누고 나머지는 버립니다.
    2-2. 그렇지 않다면 bill[1]을 2로 나누고 나머지는 버립니다.
    2-3. answer을 1 증가시킵니다.
    3. answer을 return합니다.

* 제한 사항
- wallet의 길이 = bill의 길이 = 2
- 10 ≤ wallet[0], wallet[1] ≤ 100
- 10 ≤ bill[0], bill[1] ≤ 2,000


지갑이 지폐보다
오 조건으로 수정 해보기
그렇게 되면 90도 안해도됨

 */
public class 지폐접기 {
    public static void main(String[] args) {
        지폐접기 mf = new 지폐접기();
        int[] wallet = {50, 50};
        int[] bill = {100, 241};
        mf.solution(wallet,bill);
    }
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int minWallet = Arrays.stream(wallet).min().getAsInt();
        int maxWallet = Arrays.stream(wallet).max().getAsInt();
        int minBill = Arrays.stream(bill).min().getAsInt();
        int maxBill = Arrays.stream(bill).max().getAsInt();
// 90도 회전 생각안하고 짠거
//        while (minBill > minWallet || maxBill > maxWallet) {
//            if (minBill > minWallet) {
//                minBill = minBill / 2;
//                answer++;
//            }
//            if(maxBill > maxWallet) {
//                maxBill = maxBill / 2;
//                answer++;
//            }
//
//        }

        while(true){
            if(minBill > minWallet || maxBill > maxWallet){ // 이게 반복문 조건이 될수 있도록
                maxBill /= 2;
                answer++;
            }
            if(maxBill < minBill){
                // 90도로 돌리며 넣을 수 있으니 가로가 세로가 될 수도 있다.
                int temp = maxBill;
                maxBill = minBill;
                minBill = temp;
            }
            if(minBill <= minWallet && maxBill <= maxWallet ){
                break;
            }
        }
        return answer;
    }
}
