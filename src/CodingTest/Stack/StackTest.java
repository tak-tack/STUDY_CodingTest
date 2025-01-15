package CodingTest.Stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args){
    Stack<Integer> stackInt = new Stack<>();
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        stackInt.push(1);

        System.out.println(stackInt.peek());
        System.out.println(stackInt.search(1));
        System.out.println(stackInt.search(2));
        System.out.println(stackInt.search(3));
        System.out.println(stackInt.search(4));


    }
}
