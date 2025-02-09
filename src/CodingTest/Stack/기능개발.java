package CodingTest.Stack;

import java.util.LinkedList;
import java.util.Queue;

/*
기능 개발
- progresses :  순서대로 작업의 진도  (정수배열)
- sppeds : 개발 속도 (정수배열)
- 반환값 : 각 배포마다 몇개의 기능이 배포되는지

public int 작업일수() { return Math.ceil((100-progress)/작업속도) }
작업 일수의 값을 이용하여 배포일자를 알 수 있다.
배포일자를 이용하여 다음 작업의 배포일자와 if를 써서 몇개를 배포 할수있는지 count 하고
다음 작업할때는 count 를 업데이트 시키고 다음작업은 다음일수에 배포해야한다는건 그전에 작업은 모두 배포가 끝난것
다음것에서 count 초기화 시킨다.
 */
public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
    }
    public static class Develop {
    }

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> progressesQueue = new LinkedList<>();
        Queue<Integer> speedsQueue = new LinkedList<>();

        System.out.println(progressesQueue.size() +" : " + speedsQueue.size());

        int[] answer = {};
        return answer;
    }
}
