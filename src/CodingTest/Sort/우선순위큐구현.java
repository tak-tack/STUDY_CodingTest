//package CodingTest.Sort;
//
//import javax.management.QueryExp;
//import java.util.Comparator;
//import java.util.Queue;
//
//public class 우선순위큐구현<E> implements Queue<E> {
//    private final Comparator<? super E> comparator;
//    private static final int DEFAULT_CAPACITY = 10;
//
//    private int size;
//    private Object[] array;
//
//    // 생성자 type 1 (초기 공간 할당 x)
//    public 우선순위큐구현(){
//        this(null);
//    }
//
//    public 우선순위큐구현(Comparator<? super E> comparator){
//        // DEFAULT_CAPACITY : 배열의 기본 및 최소 용적. 요소를 담을 배열의 크기
//        // 배열을 동적으로 관리 할 때 최소 크기가 10 미만으로 내려가지 않기 위한 변수
//        this.array = new Object[DEFAULT_CAPACITY]; // 요소를 담을 배열
//        this.size = 0; // 배열에 담긴 요소(원소)의 갯수
//        // comparator : 객체를 정렬하고자 할 때, 혹은 임의의 순서로 정렬하고 싶을 때
//        // Comparator 를 파라미터로 받아 설정할 수 있도록 한 변수, 즉 우선순위를 결정해주는 변수
//        this.comparator = comparator;
//    }
//    // 생성자 type 2 (초기공간 할당 o)
//    public 우선순위큐구현(int capacity){
//        this(capacity,null);
//    }
//
//    public 우선순위큐구현(int capacity, Comparator<? super E> comparator){
//        this.array = new Object[capacity];
//        this.size = 0;
//        this.comparator = comparator;
//    }
//
//    // 받은 인덱스의 부모 노드 인덱스를 반환
//    private int getParent(int index){
//        return index / 2;
//    }
//
//    // 받은 인덱스의 왼쪽 자식 노드 인덱스를 반환
//    private int getLeftChild(int index){
//        return index * 2;
//    }
//
//    // 받은 인덱스의 오른쪽 자식 노드 인덱스를 반환
//    private int getRightChild(int index){
//        return index * 2 + 1;
//    }
//}
