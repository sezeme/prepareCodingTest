import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < dartResult.length() ; i++){
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)){
                // 점수
                int num = ch - '0';
                if(num == 1 && i < dartResult.length() -1 && dartResult.charAt(i+1) == '0'){ i++; num = 10; }
                stack.push(num);
            } else {
                // 보너스 or 옵션
                int num = stack.pop();
                if(ch == 'S');
                else if(ch == 'D') num = (int)Math.pow(num, 2);
                else if(ch == 'T') num = (int)Math.pow(num, 3);
                else if(ch == '*') {
                    if(!stack.isEmpty()) stack.push(stack.pop() * 2);
                    num *= 2;
                }
                else if(ch == '#') num *= -1;
                
                stack.push(num);
            }
        }
        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        
        return answer;
    }
}