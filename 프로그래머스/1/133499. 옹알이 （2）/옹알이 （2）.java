class Solution {
        static String[] list = {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling) {
            if(str.contains("ayaaya") || str.contains("yeye") || str.contains("woowoo") || str.contains("mama"))continue;
            
            for(String str2 : list) {
                str = str.replace(str2, " ");
            }
            str = str.replace(" ", "");
            
            if(str.equals("")) answer++;
        }
        return answer;
    }
}