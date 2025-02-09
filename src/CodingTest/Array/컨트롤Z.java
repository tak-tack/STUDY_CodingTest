package CodingTest.Array;

/*
숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다.
이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 숫자와 "Z"로 이루어진 문자열 s가 주어질 때,
머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
s	result
"1 2 Z 3"	4
"10 20 30 40"	100
"10 Z 20 Z 1"	1
"10 Z 20 Z"	0
"-1 -2 -3 Z"	-3
 */
public class 컨트롤Z {
    public static void main(String[] args) {
        컨트롤Z c = new 컨트롤Z();
        System.out.println("main1 : " + c.solution("1 2 Z 3"));
        System.out.println("main1 : " + c.solution("10 20 30 40"));
        System.out.println("main1 : " + c.solution("0 Z 20 Z 1"));
        System.out.println("main1 : " + c.solution("10 Z 20 Z"));
        System.out.println("main1 : " + c.solution("-1 -2 -3 Z"));

    }
    public int solution(String s) {
        int answer = 0;
         String[] str = s.split(" ");
         for(int i =0; i < str.length; i++){
             if (str[i].equals("Z")) {
                 answer -= Integer.parseInt(str[i-1]);
             }else{
                 answer += Integer.parseInt(str[i]);
             }
         }
        return answer;
    }
}
