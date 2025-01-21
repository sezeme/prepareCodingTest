class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int size = Math.max(s+overwrite_string.length(), my_string.length());
        for(int i = 0; i < size; i++){
            if(i >= s && i < s+ overwrite_string.length()){
                answer += overwrite_string.charAt(i - s);
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}