import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int[] students = IntStream.rangeClosed(1, n).map(i -> 1).toArray();
        for(int i = 0; i<lost.length; i++){
            students[lost[i]-1]--;
        }
        for(int i = 0; i<reserve.length; i++){
            students[reserve[i]-1]++;
        }
        
        if(students[0] == 0 && students[1] == 2) {
            students[0]++;
            students[1]--;
        }
        for(int i = 1; i<students.length-1; i++){
            if(students[i] == 0){
                if(students[i-1] == 2){
                    students[i]++;
                    students[i-1]--;
                } else if(students[i+1] == 2) {
                    students[i]++;
                    students[i+1]--;                    
                }
            }
        }
        if(students[students.length - 1] == 0 && students[students.length -2] == 2) {
            students[students.length - 1]++;
            students[students.length - 2]--;
        }
        
        for(int student : students){
            if(student >= 1) answer++;
        }
        return answer;
    }
}