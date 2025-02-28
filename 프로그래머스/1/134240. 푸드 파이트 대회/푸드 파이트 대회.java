class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i< food.length; i++){
            sb.append((i+"").repeat(food[i]/2));
        }
        StringBuilder result = new StringBuilder();
        result.append(sb).append("0").append(sb.reverse());
        return result.toString();
    }
}