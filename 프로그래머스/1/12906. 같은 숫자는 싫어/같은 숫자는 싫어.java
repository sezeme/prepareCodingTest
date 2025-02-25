import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int insertIdx = 0;
        for(int i = 0; i<arr.length; i++){
            if(insertIdx != 0 && answer.get(insertIdx-1) == arr[i]) continue;
            answer.add(arr[i]);
            insertIdx++;
        }
        

        return answer;
    }
}