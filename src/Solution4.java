public class Solution4 {

    int[] queueArray;

    void solution(String str){
        if(str.matches("[+-]?\\d*(\\.\\d+)?")){
            int res =  makeQueueArray(Integer.parseInt(str));
            System.out.println(res);
        }else if (str.contains("push")){
            push(str);
        }else if (str.contains("front")){
            System.out.println( front());
        }else if (str.contains("back")){
            System.out.println(back());
        }else if (str.contains("size")){

        }else if (str.contains("size")){
            System.out.println(size());
        }else if (str.contains("empty")){

        }else if (str.contains("pop")){

        }else {

        }

    }
    int makeQueueArray(int queueSize){
        System.out.println("makeQueueArray");
        queueArray = new int[queueSize];
        if(queueArray.length == 0)
        {
            return 0;
        }else{
            return 1;
        }
    }
    // push X: 정수 X를 큐에 넣는 연산이다.
    void push(String beforeVal){
        String afterVal = beforeVal.replace("push ","");
      queueArray[queueArray.length-(queueArray.length-1)] = Integer.parseInt(afterVal);
    }

    // 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    int front(){
        System.out.print("front: ");
        return queueArray[0];
    }

    // 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    int back()
    {
        System.out.print("back : ");
        return queueArray[queueArray.length-1];

    }

    int pop(String beforeVal){


        return 0;
    }
    int size(){
        return queueArray.length;
    }
    int empty(String val){
        return 0;
    }



}
