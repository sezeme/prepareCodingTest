import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] scoreSum = new int[score.length];
        for(int i = 0; i<scoreSum.length; i++){
            scoreSum[i] = score[i][0] + score[i][1];
        }
        Arrays.sort(scoreSum);
        
        int prevScore = -1;
        int accumulate = 0;
        //scoresum = 점수 합계 오름차순
        //점수 합계 기준으로 비교해야함
        for(int i = scoreSum.length - 1 ; i >= 0 ; i--){
            int myscore = scoreSum[i];
            for(int j = 0; j<score.length; j++){
                if(myscore == (score[j][0] + score[j][1])) {
                    if(prevScore == myscore) accumulate++;
                    else accumulate = 0;
                    answer[j] = score.length - i - accumulate;
                    score[j][0] = -1;
                    score[j][1] = -1;
                    break;
                }
            }
            prevScore = myscore;
        }
        
        
        return answer;
    }
}