class Solution {
    public int solution(int n) {
        int answer = 0;
        // 10진법을 3진법으로 만들기
        /*
        45일 때, 45%3 = 0
        15 % 3 = 0
        5 % 3 = 2
        1 % 3 = 1
        toThird = 0021
        */
        String toThird = "";
        while(n != 0) {
            toThird += (n % 3);
            n /= 3;
        }
        // 3진법을 10진법으로 만들기
        /*
        toThird = 0021
        1 * 1 + 2 * 3
        */
        int pow = 1;
        for(int i = toThird.length()-1; i >= 0; i--) {
            answer += pow * (toThird.charAt(i) - '0');
            pow *= 3;
        }
        return answer;
    }
}