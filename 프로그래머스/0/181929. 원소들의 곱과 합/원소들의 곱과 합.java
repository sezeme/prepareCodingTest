class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0, mul = 1;
        for(int num : num_list){
            sum += num;
            mul *= num;
        }
        return sum*sum > mul ? 1 : 0;
    }
}