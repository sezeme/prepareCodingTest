class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int prevNum = 0;
        
        for(int i = 0; i < dartResult.length() ; i++){
            // 점수
            char ch = dartResult.charAt(i++);
            int num;
            if(ch == '1' && dartResult.charAt(i) == '0'){ i++; num = 10; }
            else num = ch - '0';
            
            // 보너스
            ch = dartResult.charAt(i);
            if(ch == 'S');
            else if(ch == 'D') num = (int)Math.pow(num, 2);
            else if(ch == 'T') num = (int)Math.pow(num, 3);
            
            // 옵션
            if(i + 1 < dartResult.length()){
                ch = dartResult.charAt(i+1);
                if(ch == '*') {
                    num *= 2;
                    prevNum *= 2;
                    i++;
                }
                else if(ch == '#') {
                    num *= -1;
                    i++;
                }
            }
            
            answer += prevNum;
            prevNum = num;
        }
        answer += prevNum;
        return answer;
    }
}