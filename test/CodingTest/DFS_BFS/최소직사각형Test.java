package CodingTest.DFS_BFS;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 최소직사각형Test {

    @Test
    void solution() {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        //System.out.println(sizes[0][0]);
        최소직사각형.solution(sizes);

    }
}