package CodingTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// hashMap : 신고 결과 받기
/*
문제 설명
신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.

각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
id_list : 이용자의 ID가 담긴 문자열 배열
report : 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열
k : 정지 기준이 되는 신고 횟수
반환 값 :
 */
public class Solution13 {
    int[] solution(String[] id_list, String[] report, int k){
        // 각 유저를 인덱스로 변환하는 Map 생성
        Map<String, Integer> userIndex = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) { // O(N)
            userIndex.put(id_list[i], i);
        }
        // 신고 기록을 저장하는 Map
        // 신고한 유저들을 누적 시키기 위해 String/Set<String> 으로 저장
        Map<String, Set<String>> reportMap = new HashMap<>();
        for(String id : id_list){
            // id : 신고 당한 유저/신고한유저들
            reportMap.put(id, new HashSet<>());
        }

        // 신고 내역 저장 (신 고유저/신고당한유저)
        for(String r : report){ // 문자열 길이.. 시간 복잡도 O(M)
            String[] split = r.split(" ");
            String reportId = split[0];
            String reportedId = split[1];
            reportMap.get(reportedId).add(reportId);
         }
        // 정지 메일 발송 횟수 배열
        int[] answer = new int[id_list.length];

        //각 유저에 대한 신고 처리
        for(String reported : id_list){ //
            Set<String> reporterId = reportMap.get(reported);
            // k번 이상 신고된 유저에 대해 메일 발송 대상 선정
            if(reporterId.size() >= k){ // k 가 1일 경우 한명에 대해서 여러명이 한명에 대해서만 신고
                for(String reportId : reporterId){
                    int idx = userIndex.get(reportId);
                    answer[idx]++;
                }
            }
        }
        return answer;
    }
}
