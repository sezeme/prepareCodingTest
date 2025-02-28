class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int i = 0, j = 0;
        for(int k = 0; k < goal.length ; k++) {
            if(i < cards1.length && cards1[i].equals(goal[k]))i++;
            else if(j < cards2.length && cards2[j].equals(goal[k])) j++;
            else return "No";
        }
        return "Yes";
    }
}