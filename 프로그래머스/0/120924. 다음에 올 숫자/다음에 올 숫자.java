class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int sum_arr = 0;
        int mul_arr = 0;
        int sum_num = common[1] - common[0];
        int mul_num = 0;
        
        if(common[0] != 0){
            mul_num = common[1] / common[0];
        }
        
        for(int i = 0; i<common.length-2; i++){
            if(common[2 + i] == common[1 + i] + sum_num) sum_arr++;
            if(common[2 + i] == common[1+ i] * mul_num) mul_arr++;            
        }
        if(sum_arr == common.length - 2){
            answer = common[common.length-1] + sum_num;
        } else if(mul_arr == common.length - 2){
            answer = common[common.length-1] * mul_num;
        }
        return answer;
    }
}