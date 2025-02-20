class Solution {
    public boolean solution(int x) {
        int num = x;
        int sum = 0;
        while(true) {
            sum += x % 10;
            if( x < 10 ) break;
            x/=10;
        }
        
        if((num % sum) == 0) return true;
        return false;
    }
}