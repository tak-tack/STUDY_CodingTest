package CodingTest.dxdy;

public class DxDy  {
    public static void main(String[] args) {

        int nowNum = 2;
        int x = 1;
        int y = 2;
        /*
        비효율적 알고리즘
         if(nowNum == 0) {
            x++;
        }else if(nowNum==1){
            y--;
        }else if(nowNum==2){
            x--;
        }else if(nowNum==3){
            y++;

        }
         */
        //dx dy 알고리즘 도입 위랑 같음
        int[] dx = {-1,0,1,0}; // x의 변화량
        int[] dy = {0,1,0,-1}; // y의 변화량
        x += dx[nowNum];
        y += dy[nowNum];


    }
}
