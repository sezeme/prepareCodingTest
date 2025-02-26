class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<chars.length; i++) {
            if(chars[i]>= 'a' && chars[i] <= 'z'){
                chars[i] = (char)((char)(((chars[i] - 'a') + n) % 26) + (char)'a');
            } else if(chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] = (char)((char)(((chars[i] - 'A') + n) % 26) +(char)'A');
            }
        }
        return sb.append(chars).toString();
    }
}