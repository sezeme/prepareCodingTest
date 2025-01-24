class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int num = 1000001;
        int ansIdx = 0;
        for(int[] query : queries){
            for(int i = query[0]; i<= query[1]; i++){
                if(arr[i] > query[2]) num = Math.min(num, arr[i]);
            }
            answer[ansIdx++] = num == 1000001 ? -1 : num;
            num = 1000001;
        }
        return answer;
    }
}