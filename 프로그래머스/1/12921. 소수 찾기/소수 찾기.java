class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] isPrime = new int[n+1];
        
        for(int i = 2 ; i <= n ; i++){
            if(isPrime[i] != 0) continue;
            answer++;
            for(int j = 2; i * j <= n; j++){
                isPrime[i * j] = 1;
            }
        }
        
        return answer;
    }
}