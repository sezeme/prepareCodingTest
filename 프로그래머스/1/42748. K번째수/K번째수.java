import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] list;
        
        for(int i = 0; i < commands.length ; i++) {
            list = new int[commands[i][1] - commands[i][0] + 1];
            System.arraycopy(array, commands[i][0] - 1, list, 0, commands[i][1] - commands[i][0] + 1);
            Arrays.sort(list);
            answer[i] = list[commands[i][2] - 1];
        }
        return answer;
    }
}