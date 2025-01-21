class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String first = "" + a + b;
        String second = "" + b + a;
        answer = Math.max(Integer.parseInt(first), Integer.parseInt(second));
        return answer;
    }
}