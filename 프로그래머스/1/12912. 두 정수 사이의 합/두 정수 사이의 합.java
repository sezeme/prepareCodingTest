class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) return a;
        if(a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        for(long i = a; i<=b; i++){
            answer += i;
        }
        return answer;
    }
}