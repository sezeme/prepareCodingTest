import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] people = new int[3][];
        int[] count = new int[3];
        people[0] = new int[]{1, 2, 3, 4, 5};
        people[1] = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        people[2] = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i =0 ; i < answers.length ; i++){
            for(int j = 0 ; j < people.length; j++) {
                if(people[j][i%people[j].length] == answers[i])
                    count[j]++;
            }
        }
        
        //max 구하기
        int max = Arrays.stream(count).max().orElse(0);

        return IntStream.range(0, 3)
                .filter(i -> count[i] == max)
                .map(i -> i + 1)
                .toArray();
    }
}