import CodingTest.Solution1;
import CodingTest.Solution2;
import CodingTest.*;
import HashMap.HashMap1;

public class Main {
    public static void main(String[] args) {
        HashMap1 hm1 = new HashMap1();
//        Solution1 solution1 = new Solution1();
//        Solution2 solution2 = new Solution2();

        hm1.hashMapInputTest();
        hm1.hashMapOutputTest();
//        if(solution1.solution("(()()())"))
//        {
//            System.out.println("올바른 괄호");
//        }else{
//            System.out.println("올바르지 않은 괄호");
//
//        }
//            System.out.println("괄호 회전하기 : " + solution2.solution("[]"));
//

    }
}

/*
st.isEmpty() && ch ==')' : 문자열이 ) 부터 올때
st.isEmpty() && ch !=')' : 문자열이 ( 부터 올떄
!st.isEmpty() && ch ==')' : 문자열이 )이 올때
 */