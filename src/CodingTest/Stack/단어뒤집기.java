package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
스페이스로 띄어쓰기 된 단어들의 리스트가 주어질때, 단어들을 반대 순서로 뒤집어라.
각 라인은 w개의 영단어로 이루어져 있으며, 총 L개의 알파벳을 가진다.
각 행은 알파벳과 스페이스로만 이루어져 있다. 단어 사이에는 하나의 스페이스만 들어간다.

첫 행은 N이며, 전체 케이스의 개수이다.
N개의 케이스들이 이어지는데, 각 케이스는 스페이스로 띄어진 단어들이다.
스페이스는 라인의 처음과 끝에는 나타나지 않는다. N과 L은 다음 범위를 가진다.

N = 5
1 ≤ L ≤ 25
 */
public class 단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫 행은 N이며, 전체 케이스의 개수이다. input1
        Stack<String> word = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String w = br.readLine(); // input2
            String[] temp = w.split(" ");
            for (int j = 0; j < temp.length; j++) {
                word.push(temp[j]); // 스택에 배열값 push
            }
            sb.append("Case #" + (i+1) + ": ");
            for (int j = 0; j < temp.length; j++) {
                sb.append(word.pop()).append(" ");
            }
            sb.append('\n');

        }
        System.out.println(sb);
    }


    }
