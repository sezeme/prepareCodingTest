import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<name.length ; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int sum;
        for(int i = 0; i<photo.length; i++) {
            sum = 0;
            for(String person : photo[i] ){
                sum += map.getOrDefault(person, 0);
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}