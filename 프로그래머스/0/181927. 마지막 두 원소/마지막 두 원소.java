class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = new int[size + 1];
        System.arraycopy(num_list,0,answer,0,size);
        answer[size] = num_list[size - 1] > num_list[size-2]?
            num_list[size-1] - num_list[size-2] : num_list[size-1] * 2;
        return answer;
    }
}