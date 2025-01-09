package CodingTest.Level0.ArrayList;

import java.util.Arrays;

/*
문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서
 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

- 1 ≤ indices의 길이 < my_string의 길이 ≤ 100
- my_string은 영소문자로만 이루어져 있습니다
- 0 ≤ indices의 원소 < my_string의 길이
- indices의 원소는 모두 서로 다릅니다.

a 아스키 코드 =  97
 */
public class ArrayListSolution3 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] res = {};
        int temp = 2;
//        for(int i =0; i<indices.length; i++){
//            temp = indices[i]; // 배열 값에서 소문자 아스키 코드 뽑음
//        }
        res = my_string.toCharArray();
        for(int i=1; i<indices.length; i++){
            if(temp != res[i]){
                //System.out.println("my_string.charAt("+j+") : " + my_string.charAt(j));
//                res = Arrays.copyOf(res,res.length+1);
//                res[count] = my_string.charAt(i);
//                count++;
            }
        }
        answer = Arrays.toString(res);
        return answer;
    }
}
