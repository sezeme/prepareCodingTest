class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        for(int i = 0; i<query.length; i++){
            int[] tmp;
            if(i % 2 == 0){
                //뒷부분 버리기
                tmp = new int[query[i]+1];
                for(int j = 0; j<=query[i]; j++){
                    tmp[j] = arr[j];
                }
                arr = tmp;
            } else {
                //앞부분 버리기
                tmp = new int[arr.length - query[i]];
                if (arr.length - query[i] >= 0)
                    System.arraycopy(arr, query[i], tmp, 0, arr.length - query[i]);
                arr = tmp;
            }
        }
        return arr;
    }
}