import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, 101);
        // 입력
        for(String key : keymap){
            char[] chars = key.toCharArray();
            for(int i = 0; i < chars.length ; i++){
                alphabet[chars[i]-'A'] = Math.min(alphabet[chars[i]-'A'], i+1);
            }
        }
        System.out.println(Arrays.toString(alphabet));
        
        // 출력
        for(int i = 0; i < targets.length; i++){
            int count = 0;
            char[] chars = targets[i].toCharArray();
            for(char ch : chars){
                if(alphabet[ch - 'A'] == 101){
                    count = -1;
                    break;
                }
                count += alphabet[ch - 'A'];
            }
            answer[i] = count;
        }
        
        return answer;
    }
}