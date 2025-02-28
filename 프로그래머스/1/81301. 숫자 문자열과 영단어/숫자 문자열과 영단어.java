class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length() ; i++) {
            int num = s.charAt(i) - '0';
            if(num >= 0 && num <= 9) sb.append(num);
            else {
                if(i+3 >= s.length()) continue;
                String str = s.substring(i, i+3);
                if(str.equals("zer")) {
                    i += 3; sb.append(0);
                } else if(str.equals("one")){
                    i += 2; sb.append(1);
                } else if(str.equals("two")){
                    i += 2; sb.append(2);
                } else if(str.equals("thr")){
                    i += 4; sb.append(3);
                } else if(str.equals("fou")){
                    i += 3; sb.append(4);
                } else if(str.equals("fiv")){
                    i += 3; sb.append(5);
                } else if(str.equals("six")){
                    i += 2; sb.append(6);
                } else if(str.equals("sev")){
                    i += 4; sb.append(7);
                } else if(str.equals("eig")){
                    i += 4; sb.append(8);
                } else if(str.equals("nin")){
                    i += 3; sb.append(9);
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }
}