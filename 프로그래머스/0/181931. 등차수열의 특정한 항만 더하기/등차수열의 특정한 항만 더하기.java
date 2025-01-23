import java.util.stream.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int []arr = new int[included.length];
        arr[0] = a;
        for(int i = 1; i<arr.length; i++){
            arr[i] = arr[i-1] + d;
        }
        
        answer = IntStream.range(0, arr.length)
            .filter(i -> included[i])
            .map(i -> arr[i])
            .sum();
        return answer;
    }
}