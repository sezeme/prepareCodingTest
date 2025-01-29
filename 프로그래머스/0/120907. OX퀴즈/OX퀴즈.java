import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            // - 연산자인지, 아니면 음수기호인지 구분해야 함. 공백으로 split 하자!
            String []splited = quiz[i].split(" ");
            int X = Integer.parseInt(splited[0].trim());
            String operator = splited[1];
            int Y = Integer.parseInt(splited[2].trim());
            int Z = Integer.parseInt(splited[4].trim());
            
            if(operator.equals("+")) {
                if(X+Y == Z) answer[i] = "O";
                else answer[i] = "X";
            }
            else if(operator.equals("-")) {
                if(X-Y == Z) answer[i] = "O";
                else answer[i] = "X";
            }
            
        }
        
        return answer;
    }
}