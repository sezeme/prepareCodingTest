class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(Math.max(n,m), Math.min(n,m));
        answer[1] = n * m / answer[0];
        return answer;
    }
    
    public int GCD(int a, int b) {
        if(a % b == 0) return b;
        return GCD(b, a % b);
    }
}