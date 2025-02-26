class Solution {
    public int[] solution(String s) {
        int[] alphabet = new int[26]; // 인덱스 : 알파벳 하나하나, 값 : 알파벳이 나온 위치 index
        int[] answer = new int[s.length()];
        
        for(int i = 0; i<alphabet.length; i++){
            alphabet[i] = -1;
        }
        
        for(int i = 0; i<s.length(); i++){
            int ai = s.charAt(i) - 'a';
            if(alphabet[ai] != -1) answer[i] = i - alphabet[ai];
            else answer[i] = -1;
            
            alphabet[ai] = i;            
        }
        return answer;
    }
}