package CodingTest.Sort;

import java.util.Scanner;

/*
N개의 서로 다른 양의 정수가 저장된 배열 A가 있다.
버블 정렬로 배열 A를 오름차순 정렬할 경우 정렬 과정에서 배열 A가 배열 B와 같은 경우가 발생하는지 확인해 보자.
초기 상태 배열 A도 정렬 과정에서 발생 가능한 경우로 생각하자.

입력
첫째줄에 배열 A, B의 크기 N 이 주어진다.
다음 줄에 서로 다른 배열 A의 원소가 주어진다.
다음 줄에 서로 다른 배열 B의 원소가 주어진다.

출력
버블 정렬로 배열A를 오름차순 정렬하는 과정에서 배열 B와
같은 경우가 발생하면 1, 아니면 0을 출력

 */
public class 알고리즘수업_버블정렬3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0 ; i < A.length ; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0 ; i < B.length ; i++){
            B[i] = sc.nextInt();
        }
        sc.close();


        System.out.println(bubbleSort(A, B));
    }
    // 버블 정렬 메서드
    public static int bubbleSort(int[] A, int[] B) {
        int n = A.length;
        boolean swapped;
        // 배열 끝까지 반복
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // 인접한 요소들을 비교하여 정렬
            for (int j = 0; j < n - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    // 요소 교환
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    swapped = true;
                }
                if(B[j] > B[j + 1]){
                    int temp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = temp;
                    swapped = true;
                }
                if(!valid(A, B)){
                   return 1;
                }
            }
// 교환이 발생하지 않으면 정렬 완료
            if (!swapped) return 0;
        }
        return 0;
    }
    static boolean valid(int[] A, int[] B) {
        boolean bool = true;
        for(int i = 0 ; i < A.length; i++){
            if(A[i] == B[i]){
                bool = false;
            }else{
                bool = true;
                break;
            }

        }
        return bool;
    }

}
