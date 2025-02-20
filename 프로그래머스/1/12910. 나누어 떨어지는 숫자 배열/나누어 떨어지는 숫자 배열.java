import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[1];
        StringBuilder sb = new StringBuilder();
        for(int num : arr ) {
            if(num % divisor == 0) sb.append(num+" ");
        }
        if(sb.length() == 0) {
            answer[0] = -1;
        } else {
            String[] list = sb.toString().split(" ");
            answer = new int[list.length];
            for(int i = 0; i<list.length; i++){
                answer[i] = Integer.parseInt(list[i]);
            }
            Arrays.sort(answer);
        }
        return answer;
    }
}