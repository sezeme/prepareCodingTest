class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] zeroToNine = new boolean[10];
        for(int num : numbers) {
            zeroToNine[num] = true;
        }
        for(int i = 0; i<10; i++){
            if(!zeroToNine[i]) answer += i;
        }
        return answer;
    }
}