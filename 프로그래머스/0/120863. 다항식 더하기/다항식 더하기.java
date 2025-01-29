class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String []splited = polynomial.split(" ");
        int oneDimention = 0;
        int zeroDimention = 0;
        for(String str : splited){
            if(str.equals("+")) continue;
            if(str.charAt(str.length()-1) == 'x'){
                if(str.length() == 1) oneDimention++;
                else {
                    String subStr = str.substring(0, str.length()-1);
                    oneDimention += Integer.parseInt(subStr);
                }
            } else{
                zeroDimention += Integer.parseInt(str);
            }            
        }
        
        if(oneDimention != 0 && zeroDimention != 0){
            if(oneDimention != 1) answer += oneDimention;
            answer += "x";
            answer += " + " + zeroDimention;
        }
        else if(oneDimention != 0){
            if(oneDimention != 1) answer += oneDimention;
            answer += "x";
        }
        else if(zeroDimention != 0){
            answer += zeroDimention;
        }
        return answer;
    }
}