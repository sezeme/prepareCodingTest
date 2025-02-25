class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i<=t.length() - p.length(); i++){
            int result = comparator(t.substring(i,i+p.length()), p);
            if(result <= 0) answer++;
        }
        return answer;
    }
    
    int comparator(String tSubStr, String p) {
        for(int i = 0; i< tSubStr.length(); i++){
            int sub = tSubStr.charAt(i) - p.charAt(i);
            if(sub == 0) continue;
            return sub;
        }
        return 0;
    }
}