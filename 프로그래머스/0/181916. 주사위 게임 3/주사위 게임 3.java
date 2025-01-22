class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int aSame = 0, bSame = 0, cSame = 0, dSame = 0;
        
        if(a == b) aSame++;
        if(a == c) aSame++;
        if(a == d) aSame++;
        
        if(a == b) bSame++;
        if(c == b) bSame++;
        if(d == b) bSame++;
        
        if(c == a) cSame++;
        if(c == b) cSame++;
        if(c == d) cSame++;
        
        if(d == a) dSame++;
        if(d == b) dSame++;
        if(d == c) dSame++;
        
        int[] cntArr = new int[4];
        cntArr[aSame]++;
        cntArr[bSame]++;
        cntArr[cSame]++;
        cntArr[dSame]++;
        
        if(cntArr[3] == 4){
            answer = 1111 * a;
        } else if(cntArr[2] == 3 && cntArr[0] == 1){
            if(a != b && b == c){
                answer = (10 * b + a) * (10 * b + a);
            } else if(b != c && c == d){
                answer = (10 * c + b) * (10 * c + b);
            } else if(c != d && d == a){
                answer = (10 * d +c) * (10 * d + c);
            } else{
                answer = (10 * a + d) * (10 * a + d);
            }            
        } else if(cntArr[1] == 4){
            if(a != b){
                answer = (a + b) * Math.abs(a - b);
            } else if(a != c){
                answer = (a + c) * Math.abs(a - c);
            } else if(a != d){
                answer = (a + d) * Math.abs(a - d);
            }
        } else if(cntArr[1] == 2){
            if(a == b) answer = c * d;
            else if(a == c) answer = b * d;
            else if(a == d) answer = b * c;
            else if(b == c) answer = a * d;
            else if(b == d) answer = a * c;
            else if(c == d) answer = a * b;
        } else if(cntArr[0] == 4){
            answer = Math.min(a, Math.min(b,Math.min(c,d)));
        }
        return answer;
    }
    
}