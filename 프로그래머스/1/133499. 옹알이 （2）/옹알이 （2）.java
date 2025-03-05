class Solution {
        static String[] list = {"aya", "ye", "woo", "ma"};
    public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling) {
            if(isBabble(str)) answer++;
        }
        return answer;
    }
    
    static boolean isBabble(String babble) {
        boolean flag;
        String prevString = "";
        for(int i = 0; i< babble.length(); i++){
            flag = false;
            for(int j = 0; j < 4 ; j++){
                if(i+list[j].length() - 1 < babble.length() && list[j].equals(babble.substring(i,i+list[j].length())) && !prevString.equals(babble.substring(i, i+ list[j].length()))){
                    i += list[j].length() - 1;
                    prevString = list[j];
                    break;
                }
                if(j == 3) flag = true;
            }
            if(flag) return false;
        }
        return true;
    }
}