class Solution {
    boolean solution(String s) {
        int count = 0; // y면 +, p면 -

        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
            
            if(ch == 'y' || ch == 'Y') count++;
            else if( ch == 'p' || ch == 'P') count--;
        }
        if(count == 0) return true;
        return false;
    }
}