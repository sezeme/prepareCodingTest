class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb;

        for(int i =0 ;i < n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format("%" + n + "s", answer[i])
                     .replace('1', '#')
                     .replace('0', ' ');
        }
        return answer;
    }
}