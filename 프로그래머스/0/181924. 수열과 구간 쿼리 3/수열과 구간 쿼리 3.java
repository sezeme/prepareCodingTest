class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int i = query[0];
            int j = query[1];
            
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
}