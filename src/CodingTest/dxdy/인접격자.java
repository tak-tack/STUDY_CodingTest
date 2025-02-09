package CodingTest.dxdy;
// 인접한 격자 탐색하기
/*
dx dy 배열을 만들고, 이를 차례로 더하거나 빼서 인접한 격자를 탐색하면 된다. 이 때 해당 배열을 더하거나 뺐을 때 이 격자가 존재하는지를 알아보는 과정이 꼭 필요하다.
 */
public class 인접격자 {
    public static void main(String[] args) {
        int nowNum = 3;
        int x = 1;
        int y = 2;
        int[][] a = {
                {0, 0, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 0}
        };
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        x += dx[nowNum];
        y += dy[nowNum];
        System.out.println(a[x][y] == 0); // 만약  x가 -1 이면
        // 해당 격자는 존재하지 않으므로 에러 발생
    }
}
