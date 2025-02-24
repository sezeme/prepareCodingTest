import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strings = s.split("");
        Arrays.sort(strings);
        
        StringBuilder sb = new StringBuilder(String.join("",strings));
        sb.reverse();
        
        return sb.toString();
    }
}