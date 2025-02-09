package CodingTest.dxdy;

import java.util.Scanner;

/*
(0, 0)에서 시작하여 총 N번 움직여보려고 합니다. N번에 걸쳐 움직이려는 방향과 움직일 거리가 주어졌을 때, 최종 위치를 출력하는 프로그램을 작성해보세요.
단, dx, dy 테크닉을 활용하여 문제를 해결해주세요.
 */
public class 최종위치구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};

        int x =0, y = 0; // 처음 위치

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();
            if(dir == 'W'){
                x = x + (dx[0] * dis);
                //x += (dx[0] * dis);
                y = y + (dy[0] * dis);
            }else if(dir == 'S'){
                x = x + (dx[1] * dis);
                y = y + (dy[1] * dis);
            }else if(dir == 'E'){
                x = x + (dx[2] * dis);
                y = y + (dy[2] * dis);
            }else if(dir == 'N'){
                x = x + (dx[3] * dis);
                y = y + (dy[3] * dis);
            }
        }
        System.out.println(x + " " + y);
    }
}
