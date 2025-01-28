class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        //sum
        int numer = numer1* denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int length = Math.min(numer, denom);
        for(int i = 2; i<=length; i++){
            while(numer % i == 0 && denom % i == 0){
                numer /= i;
                denom /= i;
            }
        }
        
        answer = new int[2];
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
}