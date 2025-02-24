class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left ; i <= right ; i++){
            int cnt = count(i);
            if(cnt % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
    
    public int count(int n) {
        int count = 0;
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0) {
                if(i*i == n) count+=1;
                else count +=2;
            }
        }
        return count;
    }
}