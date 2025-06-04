package CodingTest.Tree;

import java.util.Arrays;

public class 트리순회 {
    public static void main(String[] args) {
        int[] nodes= {1,2,3,4,5,6,7};
        System.out.println(
                Arrays.toString(Solution.solution(nodes))
        );
    }
    class Solution {
      public static String[] solution(int[] nodes){
          String[] res = new String[3];
          res[0] = preorder(nodes,0).trim(); // 마지막 공백 제거
          res[1] = inorder(nodes,0).trim(); // 마지막 공백 제거
          res[2] = postorder(nodes,0).trim(); // 마지막 공백 제거
          return res;
      }
        public static String preorder(int[] nodes, int idx){ // 항상 루트를 먼저 방문
          if(idx >= nodes.length){ // idx 가 범위를 벗어나면 빈 문자열 반환
              return "";
          }
          // 루트 노드 -> 왼쪽 서브 트리 -> 오른쪽 서브 트리 순으로 재귀 호출하여 결과를 이어 붙임
          return nodes[idx] + " " +
                  preorder(nodes, 2*idx+1) +
                  preorder(nodes, 2*idx+2);
      }
      public static String inorder(int[] nodes, int idx){ //
          if(idx >= nodes.length){ // idx 가 범위를 벗어나면 빈 문자열 반환
              return "";
          }
          // 왼쪽 서브 트리 -> 루트 노드 -> 오른쪽 서브 트리 순으로 재귀 호출하여 결과를 이어 붙임
          return inorder(nodes, 2*idx+1) +
                  nodes[idx] + " " +
                  inorder(nodes, 2*idx+2);
      }

      public static String postorder(int[] nodes, int idx){
          if(idx >= nodes.length){ // dix 가 범위를 벗어나면 빈 문자열 반환
              return "";
          }
          // 왼쪽 서브 트리 -> 오른쪽 서브 트리 -> 루트 노드 순으로 재귀 호출하여 결과를 이어 붙임
          return postorder(nodes, 2*idx+1) +
                  postorder(nodes, 2*idx+2) +
                  nodes[idx] + " ";
      }
    }
}
