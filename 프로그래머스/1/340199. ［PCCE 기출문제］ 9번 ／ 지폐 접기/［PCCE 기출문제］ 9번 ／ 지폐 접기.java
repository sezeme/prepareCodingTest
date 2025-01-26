class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        wallet = sort(wallet);
        bill = sort(bill);
        while(wallet[0] < bill[0] || wallet[1] < bill[1]){
            bill[0] = bill[0] / 2;
            bill = sort(bill);
            answer++;
        }
        return answer;
    }
    
    int[] sort(int[] source){
        if(source[0] < source[1]){
            int tmp = source[0];
            source[0] = source[1];
            source[1] = tmp;
        }
        return source;
    }
}