package HashMap;
/*
2025-01-06
hashMap 테스트
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMap1 {
    // 입력
    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();
    HashMap<String,String> map = new HashMap<String,String>();
    public void hashMapInputTest(){
        // ArrayList 넣어줄 계획이고 넣는 타입들은 HashMap이면서 Hashmap은 key는 String, value 값도 String 값이다.

        map.put("1","아이유");
        map.put("2","수지");
        map.put("3","제니");
        list.add(map);

        // 총 hashmap 를 3번을 생성하여서 list 안에 세번 넣어주도록한다.
        // 그리고, HashMap 과 LinkedHashMap 의 차이점의 결과도 볼 수 있다.
        map = new HashMap<String,String>();
        for(int i=0;i<5; i++){
            // for 문을 돌면서 순차적으로 넣는다
            map.put(i+"Hello","Hello "+i);
        }
        list.add(map);

        map = new LinkedHashMap<String,String>();
        for(int i=0;i<5; i++){
            // for 문을 돌면서 순차적으로 넣는다
            map.put(i+"Hello","Hello "+i);
        }
        list.add(map);

    }
    // 출력
    public void hashMapOutputTest(){
        // arraylist 사이즈만큼 for문 실행
     for(int i=0;i<list.size();i++){
         System.out.println("list 순서 " + i + "번째");
         // list 각각 hashmap받아서 출력
         //
         for (Entry<String, String> elem : list.get(i).entrySet()){
             System.out.printf("키 : %s, 값 : %s %n", elem.getKey(), elem.getValue());
         }
     }
    }
    /*
    출력 결과
    총 hasshmap 를 세번 생성하여서 list 안에 세번 넣어주었음으로 3번 출력된다.
    그리고, 출력 순서를 보면 순서대로 들어갔지만 출력 결과를 다른데 ListHashMap을 사용하면 출력결과에 순서까지 보장해준다.
     */


}
