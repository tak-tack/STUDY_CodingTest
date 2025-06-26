package CodingTest.Sort;
/*
버블정렬
1. 정의
서로 인접한 두 원소를 검사하여 정렬하는 알고리즘
바로 옆에 있는 데이터와 비교 하여, 조건에 맞지 않으면
자리를 바꾸는 과정을 반복

2. 의미
한번의 단계(pass) 가 진행될 때마다 가장 큰(또는 가장 작은)
원소가 배열의 맨 끝으로 이동

3. 장점
- 구현이 매우 간단하고 직관적
> 정렬 알고리즘 중 가장 이해하기 쉽고 코드로 작성하기가 간단
- 인플레이스 정렬 (In-place sort) 이다.
- 안정 정렬(Stable Sort) 이다.

4. 단점
- 매우 비효율적이다.
> 거의 사용x
- 불필요한 비교와 교환이 많다.
*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = new int[500000]; //{5,1,4,2,8};
        for(int j = 0; j < 500000; j++){
            data[j] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("정렬 전:");
        printArray(data);

        bubbleSort(data); // 버블 정렬 수행
        System.out.println("정렬 후:");
        printArray(data);
    }

    // 버블 정렬 메서드
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        // 배열 끝까지 반복
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // 인접한 요소들을 비교하여 정렬
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 요소 교환
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
// 교환이 발생하지 않으면 정렬 완료
            if (!swapped) break;
        }
    }

    // 배열을 출력하는 메서드
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
