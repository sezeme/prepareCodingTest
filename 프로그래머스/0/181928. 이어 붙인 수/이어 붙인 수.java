class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "", even = "";
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}