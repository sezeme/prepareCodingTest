class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        int wordIdx = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = sb.charAt(i);
            if(ch == ' ') {
                wordIdx = 0;
                continue;
            }
            if(wordIdx % 2 == 0 && ch >= 'a' && ch <= 'z') {
                sb.setCharAt(i,(char) (ch - 32));
            } else if(wordIdx % 2 == 1 && ch >= 'A' && ch <= 'Z') {
                sb.setCharAt(i,(char) (ch + 32));
            }
            wordIdx++;
        }
        return sb.toString();
    }
}