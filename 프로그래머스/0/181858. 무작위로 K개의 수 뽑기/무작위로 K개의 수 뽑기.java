import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] pickedArr = IntStream.range(0,arr.length)
            .map(i -> arr[i])
            .distinct()
            .limit(k)
            .toArray();
        
        int[] answer = IntStream.range(0, k)
            .map(i -> -1)
            .toArray();
        
        System.arraycopy(pickedArr, 0, answer, 0, pickedArr.length);
        
        return answer;
    }
}