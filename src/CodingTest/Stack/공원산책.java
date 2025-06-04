package CodingTest.Stack;

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
    // 이동
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        myPark mp = new myPark();
        mp.length = park[0].length();
        mp.height = park.length;
        mp.setGrid(park); // 공원 정보 입력
        Queue<String> queue = new LinkedList<>(Arrays.asList(routes));
        // 명령 대기열
        while(!queue.isEmpty()){
            mp.valid(queue.poll());
        }
        return answer;
    }

    // 공원
    public static class myPark{
        int length = 0;
        int height = 0;
        static char[][] grid;
        parkRobot robot = new parkRobot();

        // 공원 상태
        public void setGrid(String[] param) {
            grid = new char[param.length][param[0].length()]; // 배열 크기 초기화
            for(int i =0; i<param.length; i++){
                for(int j=0; j < param[i].length(); j++){
                    if(param[i].charAt(j) == 'S'){
                        robot.setPosition(i,j); // 로봇의 시작 위치
                    }
                    grid[i][j] = param[i].charAt(j);

                }
            }
        }
        //
        public void valid(String command) {
            int[] dx = {-1,0,1,0}; // x의 변화량
            int[] dy = {0,1,0,-1}; // y의 변화량
            //-1 0 : 동,  1 0 : 동, 0 -1 : 남, 1 0 : 서`\
            char ch = command.charAt(0);
            int ch2 = Integer.parseInt(command.substring(2,3));
            parkRobot robot = new parkRobot();
//                switch (ch){
//                    case 'W':
//                        robot.setPosition( 0, ch2 * dx[0]);
//                        break;
//                    case 'S':
//                        robot.setPosition(ch2 * dy[1] , 0);
//                        break;
//                    case 'E':
//                        robot.setPosition(0, ch2 * dx[2]);
//                        break;
//                    case 'N':
//                        robot.setPosition( ch2 * dy[3], 0);
//                        break;
//                    default:
//                        System.out.println("존재하지 않은 커멘더 입니다.");
//                        break;
//
//            for(int i = 0; i<grid.length; i++){
//                for(int j = 0; j<grid[i].length; j++){
//                    System.out.print(grid[i][j] + " ");
//                }
//            }
            System.out.println( "x : " + parkRobot.positionX + ", y : " + parkRobot.positionY);


        }
    }

    // 공원 로봇
    public static class parkRobot{
        static int positionX = 0;
        static int positionY = 0;

        // 로봇 위치 초기화
        public void setPosition(int x, int y) {
            positionX += x;
            positionY += y;
        }

        // 로봇 이동 가능 여부
        boolean canMove(){

            return true;
        }

    }


}
