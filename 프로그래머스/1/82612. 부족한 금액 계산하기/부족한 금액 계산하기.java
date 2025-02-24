class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        answer = price;
        answer *= 1 + count;
        answer *= count;
        answer /= 2;
        System.out.println(answer);

        return answer > money ? answer - money : 0;
    }
}