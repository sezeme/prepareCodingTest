class Solution {
    
    public boolean isUnInfinite(int num){
        while(num != 1){
            if(num % 10 == 0) num /= 10;
            else if(num % 5 == 0) num /= 5;
            else if(num % 2 == 0) num /= 2;
            else return false;
        }
        return true;
    }
    
    public int GCD(int a, int b) {
        if(a % b == 0){
            return b;
        }
        return GCD(b, a % b);
    }
    public int solution(int a, int b) {
        int gcd = GCD(Math.max(a, b),Math.min(a, b));
        int mother = b / gcd;
        if(isUnInfinite(mother)) return 1;
        return 2;
    }
}