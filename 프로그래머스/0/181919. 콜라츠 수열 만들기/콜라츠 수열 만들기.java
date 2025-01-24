import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new LinkedList<>();
        list.add(n);
        
        while(n != 1){
            if(n % 2 == 0){
                list.add(n /= 2);
            } else {
                n = n*3+1;
                list.add(n);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}