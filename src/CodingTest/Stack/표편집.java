package CodingTest.Stack;

import java.util.Stack;

/*

처음 표의 행 개수를 나타내는 정수 n, 처음에 선택된 행의 위치를 나타내는 정수 k,
수행한 명령어들이 담긴 문자열 배열 cmd가 매개변수로 주어질 때,
모든 명령어를 수행한 후 표의 상태와 처음 주어진 표의 상태를 비교하여 삭제되지 않은 행은 O,
삭제된 행은 X로 표시하여 문자열 형태로 return 하도록 solution 함수를 완성해주세요.


"U X": 현재 선택된 행에서 X칸 위에 있는 행을 선택합니다.
"D X": 현재 선택된 행에서 X칸 아래에 있는 행을 선택합니다.
"C" : 현재 선택된 행을 삭제한 후, 바로 아래 행을 선택합니다. 단, 삭제된 행이 가장 마지막 행인 경우 바로 윗 행을 선택합니다.
"Z" : 가장 최근에 삭제된 행을 원래대로 복구합니다. 단, 현재 선택된 행은 바뀌지 않습니다.



n	k	cmd	result
8	2	["D 2","C","U 3","C","D 4","C","U 2","Z","Z"]	"OOOOXOOO"
8	2	["D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"]	"OOXOXOOO"

노드로 관리
 */
public class 표편집 {
    public static void main(String[] args) {
        표편집 eg = new 표편집();
        String[] str  = {"D 2","C","U 3","C","D 4","C","U 2","Z","Z"};
        eg.solution(8,2,str);
    }
    public String solution(int n, int k, String[] cmd){
        String answer = "";
        Stack<Character> st = new Stack<>();
        //Stack<Integer> graph = new Stack<>();
        int[] graph = new int[n];
        for(int i =0; i<cmd.length; i++){
            st.push('0');
            String str = cmd[i];
            operation(str);
        }
        for(int j = 0; j < n; j++){
            graph[j] = j;
        }


        return answer;
    }
    public String operation(String param){
      String[] temp = param.split(" ");

      for(int i=0; i<temp.length; i++){
          System.out.print(temp[i]);
      }
        System.out.println("");
        return "test";
    }

    //public boolean verification()

}
