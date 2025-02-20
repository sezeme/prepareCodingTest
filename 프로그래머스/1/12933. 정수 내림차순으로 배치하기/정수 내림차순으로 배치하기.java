import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        String []list = new String[str.length()];
        for(int i = 0; i<str.length(); i++){
            list[i] = String.valueOf(str.charAt(i) - '0');
        }
        
        Arrays.sort(list, (a, b) ->
	        b.charAt(0) - a.charAt(0)
        );
        StringBuilder sb = new StringBuilder();
        for(String ch : list){
            sb.append(ch);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}