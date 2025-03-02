import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int[] attackPower = new int[number+1];
        for(int i = 1; i<=number ; i++){
            for(int j = 1; i*j<=number; j++){
                attackPower[i*j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (attackPower[i] > limit) {
                answer += power;
            } else {
                answer += attackPower[i];
            }
        }
        return answer;
    }
}