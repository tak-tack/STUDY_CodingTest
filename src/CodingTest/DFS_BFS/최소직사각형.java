package CodingTest.DFS_BFS;

public class 최소직사각형 {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        for(int i=0;i<sizes.length;i++){
            for(int j=0;j<sizes[i].length;j++){
                // {{60,50},{30,70},{60,30},{80,40}}
                //System.out.println(sizes[i][j]+" ");
                if(sizes[i][1]>maxHeight){
                    maxHeight = sizes[0][j];
                }
            }
            if(sizes[i][0]>maxWidth){
                maxWidth = sizes[i][0];
            }
        }
        System.out.println("maxHeight : " + maxHeight);
        System.out.println("maxWidth : " + maxWidth);
        return answer;
    }
}