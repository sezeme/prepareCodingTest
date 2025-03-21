import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xCount = new int[10];
        for(int i = 0; i< X.length(); i++){
            xCount[X.charAt(i) - '0']++;
        }
        
        int[] yCount = new int[10];
        for(int i = 0; i< Y.length(); i++){
            yCount[Y.charAt(i) - '0']++;
        }
        System.out.println(Arrays.toString(xCount));
        System.out.println(Arrays.toString(yCount));
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--){
            int n = Math.min(xCount[i], yCount[i]);
            if(n > 0){
                if(i == 0 && sb.length() == 0) return "0";
                for(int j = 0; j < n; j++){
                    sb.append(i);
                }
            }
        }
        if(sb.length() == 0) return "-1";
        return sb.toString();
    }
}