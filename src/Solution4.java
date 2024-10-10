public class Solution4 {

    int[] queueArray;

    void solution(String str){
        if(str.matches("[+-]?\\d*(\\.\\d+)?")){
            int res =  makeQueueArray(Integer.parseInt(str));
            System.out.println(res);
        }else if (str.contains("push")){
            push(str);
        }else if (str.contains("front")){

        }else if (str.contains("size")){
            System.out.println(size());
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

    void push(String beforeVal){
        String afterVal = beforeVal.replace("push ","");
      queueArray[0] = Integer.parseInt(afterVal);
    }

    int pop(String val){
        return 0;
    }
    int size(){
        return queueArray.length;
    }
    int empty(String val){
        return 0;
    }
    int front(String val){
        return 0;
    }
    int back(String val){
        return 0;
    }

}
