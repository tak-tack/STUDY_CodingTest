package CodingTest.Sort;

import java.util.Scanner;

public class 알고리즘수업_삽입정렬1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[A];
        for(int i = 0 ; i < arr.length ; i++){
            //arr[i] = (int)(Math.random() * arr.length) + 1;
            arr[i] = sc.nextInt();
        }
        sc.close();
        int res = insertionSort(arr,K);
        System.out.println(res);
    }

    public static int insertionSort(int[] arr, int K){
        int count = 0;
        int answer = 0;
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

//key보다 큰 요소들을 오른쪽으로 이동
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
                count++;
            }
// key를 올바른 위치에 삽입
            arr[j+1] = key;
            count++;
            if(K == count){
                answer = arr[j+1];
                break;
            }

            if (K > count){
                answer = -1;
            }
        }
        return answer;
    }
}
