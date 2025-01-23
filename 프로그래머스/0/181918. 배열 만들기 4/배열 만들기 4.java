import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int i = 0;
        List<Integer> list = new LinkedList<>();
        while(i < arr.length){
            if(list.isEmpty()) list.add(arr[i++]);
            else if(list.get(list.size()-1) < arr[i]) list.add(arr[i++]);
            else list.remove(list.size()-1);
        }
        stk = list.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}