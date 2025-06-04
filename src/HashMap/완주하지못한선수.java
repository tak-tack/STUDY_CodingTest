package HashMap;

import java.util.*;

/*
문제설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다.
단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
 */
public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
                //{"mislav", "stanko", "mislav", "ana"};
                //{"marina", "josipa", "nikola", "vinko", "filipa"};
                // {"leo", "kiki", "eden"};
        String[] competition = {"stanko", "ana", "mislav"};
                //{"stanko", "ana", "mislav"};
                //{"josipa", "filipa", "marina", "nikola"};
                  //{"eden", "kiki"};
        System.out.println(solution(participant, competition));

    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if(!map.containsKey(participant[i])) {
                List<Integer> list = new LinkedList<>();
                list.add(0);
                map.put(participant[i], list);
            }else{
                map.get(participant[i]).add(0);
            }
        }
                for (String key : map.keySet()) {
                    for(int i = 0; i < completion.length; i++) {
                        if (!key.equals(completion[i])) { // 완주한 선수
                        }else{ //  완주못한 선수
                            if(map.get(key).size() > 1) { // 동명이인이 아닐경우
                                answer = key;
                            }else{

                            }

                        }
                    }

        }
        return answer;
    }
}