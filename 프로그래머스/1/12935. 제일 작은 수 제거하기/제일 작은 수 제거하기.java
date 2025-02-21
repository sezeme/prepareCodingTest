import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        
        if(arr.length == 1) return answer;
        
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        int minNum = tmp[0];

        answer = new int[arr.length-1];
        int j = 0;
        for(int i = 0; i<arr.length-1; i++, j++){
            if(arr[j] == minNum) {
                i--;
                continue;
            }
            answer[i] = arr[j];
        }
        return answer;
    }
}