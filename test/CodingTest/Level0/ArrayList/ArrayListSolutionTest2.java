package CodingTest.Level0.ArrayList;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/*
정수 n과 k가 주어졌을 때, 1 이상 n 이하의 정수 중에서
k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.]
- 제약
1 ≤ n ≤ 1,000,000
1 ≤ k ≤ min(1,000, n)
 */
public class ArrayListSolutionTest2 {
    @Test
    void ArrayListSolution2(){
        ArrayListSolution2 al2 = new ArrayListSolution2();
        System.out.println(Arrays.toString(al2.solution(15,5)));
    }
}
