import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        List<Integer> arr = new LinkedList<>();

        
        for(int i = l; i <= r; i++){
            String str = "" + i;
            if(str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9")){
                continue;
            }
            
            arr.add(i);      
        }
        
        if(arr.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        answer = new int[arr.size()];
        int idx = 0;
        
        for(int element : arr){
            answer[idx++] = element;
        }
        
        return answer;
    }
}