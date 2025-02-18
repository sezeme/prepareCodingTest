import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "" + n;
        int size = s.length();
        
        for(int i = 0; i<size; i++){
            answer += s.charAt(i) - '0';
        }

        return answer;
    }
}