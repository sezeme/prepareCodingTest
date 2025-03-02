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
        int answer = Arrays.stream(attackPower).map( p -> {
            if(p > limit) return power;
            return p;
        }).sum();
        return answer;
    }
}