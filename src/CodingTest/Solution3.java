package CodingTest;/*
게임 화면은 "1 x 1" 크기의 칸들로 이루어진 "N x N" 크기의 정사각 격자이며 위쪽에는 크레인이 있고 오른쪽에는 바구니가 있습니다.
 (위 그림은 "5 x 5" 크기의 예시입니다). 각 격자 칸에는 다양한 인형이 들어 있으며 인형이 없는 칸은 빈칸입니다.
 모든 인형은 "1 x 1" 크기의 격자 한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다.
 게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다.
 집어 올린 인형은 바구니에 쌓이게 되는 데, 이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩니다.
다음 그림은 [1번, 5번, 3번] 위치에서 순서대로 인형을 집어 올려 바구니에 담은 모습입니다.

1. n번에 대해서 최대 30번을 비교하니까 n x n 만큼
스택으로 만든다면 30개의 스택을 만드는데 30개의 스택을 초기화하는 방법은
30번 탐색후 이중탐색30번하여 30x30이 됨
30개 스택비용은 n^2, 스택으로 만들면 꺼낼떄 바로 꺼낼수있다. moves에 대해서 stack을 바로 꺼내니까

2. 각 배열 찢기
 */


import java.util.ArrayList;
import java.util.Stack;

public class Solution3 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> poket = new Stack<>(); // 바구니
        // 스택들을 저장할 리스트
        ArrayList<Stack<Integer>> stackList = new ArrayList<>();

            for(int i  = 0; i < board.length; i++){ // 격자 열 크기만큼 반복
                for(int j = 0; j < board[i].length; j++){ // 격자 행 크기만큼 반복
                    Stack<Integer> stack = new Stack<>();
//                    stack.push(board[i][j]);
//                    stackList.add(stack);
            }
        }
        for(int i = 0; i<moves.length; i++) { //  크레인 크기 만큼 반복
            for(int j = 0; j< stackList.size(); j++){
                if (moves[i] == stackList.get(j).peek()){
                    poket.push(stackList.get(j).pop());
                }
            }
        }

        return answer;
    }
}
