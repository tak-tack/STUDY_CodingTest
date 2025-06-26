package CodingTest.Sort;
/*
삽입 정렬
1. 정의
데이터를 하나씩 확인하면서, 각 데이터를 이미 정렬된
부분과 비교하여 자신의 적절한 위치에 삽입하는
방식으로 동작하는 알고리즘

2. 장점
- 구현이 간단하고 직관적
- 데이터가 거의 정렬되어 있을 경우 매우 효율적
- 최선의 경우에는 O(n)의 시간복잡도를 가진다. 이는 각 원소가
한한번의 비교만으로 자기 위치를 찾기 때문
- 인플레이스 정렬 이다.
- 데이터의 크기가 작을 때 다른 복잡한 정렬 알고리즘보다 빠르다.

3. 단점
- 데이터의 양이 많아 질 수록 성능이 급격히 저하된다.
> 평균 및 최악의 경우 시간 복잡도가 O(n^2) 이므로 데이터가 많고
역순에 가까울 수록 매우 비효율적
- 데이터의 이동이 빈번하게발생
> 적절한 위치를 찾기 위해 뒤쪽 원소들을 계속 한 칸 씩 뒤로 밀어야 하므로,
연산뿐 아니라 데이터 이동 비용도 많이 발생

4. 버블 정렬 대신 삽입 정렬을 더 많이 쓰이는 이유
- '거의 정렬된' 데이터에서의 압도적인 성능 차이
- 데이터 이동 방식의 효율성 차이
- 평균적인 경우의 비교/교환 횟수
*/
public class InsertionSort {
    public static void main(String[] args){
        int[] data = new int[500000]; //{5,1,4,2,8};
        for(int j = 0; j < 500000; j++){
            data[j] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("정렬 전:");
        printArray(data);
        insertionSort(data); // 삽입 정렬 수행
        System.out.println("정렬 후:");
        printArray(data);
    }

    // 삽입 정렬 메서드
    public static void insertionSort(int[] array){
        // 배열의 두 번째 요소부터 시작하여 정렬을 진행
        for(int i =1; i<array.length; i++){
            int key = array[i]; // 현재 요소를 key로 설정
            int j = i-1;
            // key보다 큰 요소들을 오른쪽으로 이동
            while(j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j = j - 1;
            }
            // key를 올바른 위치에 삽입
            array[j+1] = key;
        }
    }

    // 배열을 출력하는 메서드
    public static void printArray(int[] array){
        for(int element : array) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
    }
