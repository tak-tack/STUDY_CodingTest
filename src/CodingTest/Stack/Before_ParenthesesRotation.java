package CodingTest.Stack;
import java.util.Stack;
/*
다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

(), [], {} 는 모두 올바른 괄호 문자열입니다.
만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다.
이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
 */
public class Before_ParenthesesRotation {
    public static void main(String[] args) {
        Before_ParenthesesRotation solution = new Before_ParenthesesRotation();
        System.out.println(solution.solution("}]()[{"));

    }
    public int solution(String s) {
        int answer = 0;
        boolean firstAccept = true;
        boolean secondAccept = true;
        Stack<Character> stack = new Stack<>();
        int x = s.length();
        s += s;
        for (int i = 0; i < x; i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == ch){ // 중복 점검
                throw new RuntimeException();
            }
            if(ch =='[' || ch=='{' || ch == '('){
                if(ch == '('){
                    firstAccept = false;
                }else if (ch == '{'){
                    secondAccept = false;
                }
                stack.push(ch);
            }else {
                if(!stack.isEmpty()){
                    if (ch == ')'){
                        char value = stack.peek();
                        if(value == '(')
                        {
                            stack.pop();
                            answer++;
                            firstAccept = true;
                        }
                    }else if (ch == '}'){
                        char value = stack.peek();
                        if(value == '{' && firstAccept){
                            stack.pop();
                            answer++;
                            secondAccept = true;
                        }
                    }else if (ch == ']') {
                        char value = stack.peek();
                        if(value == '[' && firstAccept && secondAccept){
                            stack.pop();
                            answer++;
                        }
                    }
                }else { // 비어 있을때
                    continue;
                }
            }

        }
        return answer;

    }
}

