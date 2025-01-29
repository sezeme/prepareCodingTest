import java.util.stream.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        // total / num , 앞뒤로 n/2개 아닌가
        //15/5 = 3 -> 5/2 = 2, 3 - 2 = 1 ~ 3 + 2 = 5
        //14/4 = 3.n, 2,3,4,5, 나머지가 있는 경우에는 4/2 앞은 2- 1, 뒤는 2
        // 3 - 1, 3 + 2
        int q = total / num;
        int start = q - num/2;
        int end = q + num/2;
        if(total % num != 0) start++;
        answer = IntStream.rangeClosed(start, end).toArray();
        return answer;
    }
}