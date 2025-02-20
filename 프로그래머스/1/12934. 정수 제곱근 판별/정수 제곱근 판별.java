class Solution {
    public Long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        if(num - (int)num > 0) return -1L;
        
        String s = ((int)Math.sqrt(n) + 1) + "";
        Long num3 = Long.parseLong(s);
        return num3 * num3;
    }
}