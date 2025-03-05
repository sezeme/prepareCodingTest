import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int correctLotto = 0;
        int zeroCount = 0;
        
        for(int i = 0, j = 0; i < lottos.length && j < lottos.length; i++){
            if(lottos[i] == 0){
                zeroCount++; continue;
            }
            if(win_nums[j] == lottos[i]) {
                correctLotto++; j++;
            }
            else if(win_nums[j] < lottos[i]){
                i--;
                j++;
            }
        }
        
        answer[0] = correctLotto + zeroCount;
        answer[1] = correctLotto;
        
        answer[0] = switch(answer[0]) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
        
        answer[1] = switch(answer[1]) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
        
        return answer;
    }
}



