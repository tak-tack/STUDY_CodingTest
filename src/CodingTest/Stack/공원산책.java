package CodingTest.Stack;

import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// charAt() 또는 split(" ")
// park 객체로 관리하기 park값을 grid로 본다
// grid : 격자(맵)
// 객체 - 명령어, 로봇(x,y 를 가지고 있음)
public class 공원산책 {

    public static void main(String[] args) throws IOException {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        공원산책 wp = new 공원산책();
        wp.solution(park,routes);
    }

    public static class myPark{
        int length = 0;
        int height = 0;
        char[][] grid;

        public void setGrid(String[] param) {
            grid = new char[param.length][param[0].length()];
            for(int i =0; i<param.length; i++){
                for(int j=0; j < param[i].length(); j++){
                    this.grid[i][j] = param[i].charAt(j);
                }
            }
        }

        public boolean valid(String command) {
            int[] dx = {-1,0,1,0}; // x의 변화량
            int[] dy = {0,1,0,-1}; // y의 변화량
            int x =0, y=0;

            char ch = command.charAt(0);
            int ch2 = command.charAt(2);
            System.out.println(ch + " - " + ch2);
            parkRobot robot = new parkRobot();
            if(robot.canMove()){
                switch (ch){
                    case 'W':
                        x += ch2 + dx[0];
                        y += dy[0];
                    case 'S':
                        x += dx[1];
                        y +=  ch2 + dy[1];
                    case 'E':
                        x +=  ch2 + dy[2];
                        y += dx[2];
                    case 'N':
                        x += dx[3];
                        y +=  ch2 + dy[3];
                }
            }
            System.out.println( "x : " + x + ", y : " + y);


        return true;
        }
    }
    public static class parkRobot{
        int positionX = 0;
        int positionY = 0;

        boolean canMove(){

            return true;
        }

    }
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};

        myPark mp = new myPark();
        mp.length = park[0].length();
        mp.height = park.length;
        mp.setGrid(park);
        Queue<String> queue = new LinkedList<>(Arrays.asList(routes));
        while(!queue.isEmpty()){
            mp.valid(queue.poll());
        }
        return answer;
    }
}
