package CodingTest.Level0.PCCE;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Objects;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/250121
AI 엔지니어인 현식이는 데이터를 분석하는 작업을 진행하고 있습니다.
데이터는 ["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]으로 구성되어 있으며 현식이는 이 데이터들 중 조건을 만족하는 데이터만 뽑아서 정렬하려 합니다.

예를 들어 다음과 같이 데이터가 주어진다면
data = [[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]]

이 데이터는 다음 표처럼 나타낼 수 있습니다.
code	date	maximum	remain
1	20300104	100	   80
2	20300804	847    	37
3	20300401	10	    8

주어진 데이터 중 "제조일이 20300501 이전인 물건들을 현재 수량이 적은 순서"로 정렬해야
한다면 조건에 맞게 가공된 데이터는 다음과 같습니다.
data = [[3,20300401,10,8],[1,20300104,100,80]]
정렬한 데이터들이 담긴 이차원 정수 리스트 data 와 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미하는
문자열 ext, 뽑아낼 정보의 기준값을 나타내는 정수 val_ext, 정보를 정렬할 기준이 되는 문자열 sort_by가 주어집니다.
data 에서 ext 값이 val_ext 보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로
 오름차순으로 정렬하여 return 하도록 solution 함수를 완성해 주세요.
  단, 조건을 만족하는 데이터는 항상 한 개 이상 존재합니다.

  컬렉션 프레임워크
  람다식

 */
public class PCCE10_DataAnalysis {
    public static void main(String[] args) {
       PCCE10_DataAnalysis pcce10 = new PCCE10_DataAnalysis();
        int[][] param = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        System.out.println(Arrays.deepToString(pcce10.solution(param, "date", 20300501, "remain")));
    }

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        int hd = 0;
        int count = 0;

        for(int h =0; h<data.length; h++){
            for(int w=0; w<data[0].length; w++){
                 hd = checkCol(ext,data[0][w]); // 정렬 기준 찾기
                if(data[0][hd] > data[0][hd+1]){
                    answer[h][w] = data[h][w];
                }
            }
        }

        for(int i =0; i<data[0].length; i++){
            //Arrays.sort(answer[hd][i]);
        }
        return answer;
    }
    public int checkCol(String ext, int data){
        if(ext.equals("code")){
            return 0;
        }else if(ext.equals("date")){
            return 1;
        }else if(ext.equals("maximum")){
            return 2;
        }else{ // (ext.equals("remain")
            return 3;
        }
    }
}
