class Solution {
    public String solution(String s, String skip, int index) {
        /*
        "klmnopqrstuvwxyz", "abcdefghij", 20
기댓값 〉 "opqrstuvwxyzklmn"
        */
        String answer = "";
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length() ; i++){
            char ch = chars[i];
            int plus = 0;
            
            while(plus < index) {
                ch = (char)((ch - 'a' + 1)%26 + 'a');
                if(!skip.contains(String.valueOf(ch)))
                    plus++;
            }
                     
            
            sb.append(ch);
            
        }
        return sb.toString();
    }
}