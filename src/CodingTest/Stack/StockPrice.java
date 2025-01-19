package CodingTest.Stack;

import CodingTest.Array.CtrlZ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/*
초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
제한사항
- prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
- prices의 길이는 2 이상 100,000 이하입니다.
입출력 예
prices      	return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
입출력 예 설명
-1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
-2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
-3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
-4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
-5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
※ 공지 - 2019년 2월 28일 지문이 리뉴얼되었습니다.


가격이 있을때와 현재 가격의 시간을 얼마나 유지하느냐?
스택에는 값이 아닌 인덱스 값을 넣어서 O(n) 시간복잡도 확인
받아온 주식정보에대해서 총 초수에서 자신의 초수를빼면 본인의 유지시간을 확인할수 있다.

기간에 대한 정보는 가격정보랑 무관하고 인덱스정보를 이용하여 풀어야하는 문제

 */
public class StockPrice {
    public static void main(String[] args) {
        StockPrice sp = new StockPrice();
        sp.solution(new int[]{1, 2, 3, 2, 3});
    }
    public int[] solution(int[] prices) {
        // prices : 주식가격이 담긴 배열
        // answer : 가격이 떨어지지 기간의 초
        int[] answer = {};
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i =0; i<prices.length;  i++){
            st.push(prices[i]);
        }

        for(int j=st.size(); 0<j; j--){
            //rotation(st.pop().toString());

        }



        return answer;
    }

}
