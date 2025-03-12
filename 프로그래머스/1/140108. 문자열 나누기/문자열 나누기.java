class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] chars = s.toCharArray();
        int x = 1, notx = 0;
        char xChar = chars[0];
        for(int i = 1; i<chars.length; i++){
            if(xChar == chars[i]) x++;
            else notx++;
            
            if(x == notx) {
                if(i == chars.length-1) break;
                answer++;
                xChar = chars[i+1];
                x = 1;
                notx = 0;
                i++;
            }
        }
        
        return ++answer;
    }
}