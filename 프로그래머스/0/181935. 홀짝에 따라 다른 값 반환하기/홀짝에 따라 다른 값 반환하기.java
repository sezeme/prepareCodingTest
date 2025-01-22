import java.util.*; 
import java.util.stream.*; 

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1){
            answer = IntStream.rangeClosed(1,n)
                .filter(num -> num%2 == 1)
                .sum();
        } else {
            answer = IntStream.rangeClosed(1,n)
                .filter(num -> num%2 == 0)
                .map(i -> i * i)
                .sum();
        }
        return answer;
    }
}