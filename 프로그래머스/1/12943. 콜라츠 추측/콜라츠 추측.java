class Solution {
    public int solution(int num) {
        int answer = -1;
        int count = 0;
        Long num2 = Long.parseLong(String.valueOf(num));
        while(count < 500) {
            if(num2 == 1) {
                answer = count;
                break;
            }
            
            if(num2 % 2 == 0) num2/=2;
            else num2 = num2*3 + 1;
            count++;
        }
        return answer;
    }
}