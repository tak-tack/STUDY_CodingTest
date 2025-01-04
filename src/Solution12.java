import java.util.HashMap;

public class Solution12 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        // 원하는 제품-갯수
        HashMap<String, Integer> wantNumber = new HashMap<>();

        for(int i = 0; i <want.length; i++){
            wantNumber.put(want[i], number[i]);
        }
        for (String s : discount) {
            if (wantNumber.containsKey(s)) {
                if (wantNumber.get(s) != 0) {
                    wantNumber.put(s, wantNumber.get(s) - 1);
                } else {
                    answer++;
                }

            }
        }

        //  회원등록시 정현이가 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수를 return
        return answer;
    }
}
