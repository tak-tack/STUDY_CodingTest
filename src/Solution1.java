import java.util.Stack;
// StackQueue
// 올바른 괄호 찾기 2025-01-04 test
public class Solution1 {
    boolean solution(String s) { // 올바른 괄호 찾기
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty() && ch == ')') {
                    return false;
                }
                if (ch == ')') {
                    st.pop();
                }
            }
        }
        if(!st.isEmpty())
        {
            answer = false;
        }
        return answer;
    }

}
