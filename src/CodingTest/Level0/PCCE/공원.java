package CodingTest.Level0.PCCE;

import java.util.Arrays;

/*
지민이는 다양한 크기의 정사각형 모양 돗자리를 가지고 공원에 소풍을 나왔습니다. 공원에는 이미 돗자리를 깔고 여가를 즐기는 사람들이 많아
지민이가 깔 수 있는 가장 큰 돗자리가 어떤 건지 확인하려 합니다. 예를 들어 지민이가 가지고 있는 돗자리의 한 변 길이가 5, 3, 2 세 종류이고,
 사람들이 다음과 같이 앉아 있다면 지민이가 깔 수 있는 가장 큰 돗자리는 3x3 크기입니다.
지민이가 가진 돗자리들의 한 변의 길이들이 담긴 정수 리스트 mats, 현재 공원의 자리 배치도를 의미하는 2차원 문자열 리스트 park가 주어질 때
지민이가 깔 수 있는 가장 큰 돗자리의 한 변 길이를 return 하도록 solution 함수를 완성해 주세요. 아무런 돗자리도 깔 수 없는 경우 -1을 return합니다.

* 제한 사항
- 1 ≤ mats의 길이 ≤ 10
- 1 ≤ mats의 원소 ≤ 20
- mats는 중복된 원소를 가지지 않습니다.
- 1 ≤ park의 길이 ≤ 50
- 1 ≤ park[i]의 길이 ≤ 50
- park[i][j]의 원소는 문자열입니다.
- park[i][j]에 돗자리를 깐 사람이 없다면 "-1", 사람이 있다면 알파벳 한 글자로 된 값을 갖습니다.

포기 개어렵  지원님 풀이 구경하기 dp로 푸심

 */
public class 공원 {
    public static void main(String[] args) {
        공원 pa = new 공원();
        int[] mats = {5,3,2};
        String[][] park = {
                           {"A", "A", "-1", "B", "B", "B", "B", "-1"}
                          ,{"A", "A", "-1", "B", "B", "B", "B", "-1"}
                          ,{"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}
                          ,{"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
                          ,{"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}
                          ,{"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
        };
        pa.solution(mats,park);
    }
    public int solution(int[] mats, String[][] park) {
        // mats : 한 변의 길이, park : 현재 공원의 자리 배치도
        // park.length 의 값은 1치원배열의 크기
        int answer = 0;
        int row = park.length; /// 열
        int cols = park[0].length; // 행
        int maxSize = -1; // 돗자리 크기
        Arrays.sort(mats); // 크기별 접근

        for(int m = mats.length -1; m >0; m--){
            boolean canPlace = false;

        }
        return answer;

    }
}
