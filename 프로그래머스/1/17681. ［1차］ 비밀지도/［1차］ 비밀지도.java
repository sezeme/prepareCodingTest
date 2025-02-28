class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb;

        for(int i =0 ;i < n; i++){
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            
            if(s1.length() < n) s1 = "0".repeat(n - s1.length()) + s1;
            if(s2.length() < n) s2 = "0".repeat(n - s2.length()) + s2;
            
            sb = new StringBuilder();
            for(int j = 0 ; j<n ; j++){
                if(s1.charAt(j) == '1' || s2.charAt(j) == '1') sb.append("#");
                else sb.append(" ");
            }
            
            answer[i] = sb.toString();
        }
        return answer;
    }
}