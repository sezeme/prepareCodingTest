class Solution {
    public int solution(String[] babbling) {
        String []babsay = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String bab : babbling){
            for(String say : babsay){
                if(bab.contains(say)){
                    bab = bab.replaceAll(say, ",");
                    if(bab.replaceAll(",","").isEmpty()) answer++;
                }
            }   
        }
        return answer;
    }
    
}