package CodingTest.Sort;

import java.util.Scanner;

public class 잘못된_버블정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[A];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        wrongBubbleSort(arr,K);
        //System.out.println(res);
    }

     static void wrongBubbleSort( int[] A,int N) {
        for (int i = N - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] > A[j + 1]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }
    }
}
