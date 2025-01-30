import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        List<Integer> list = new LinkedList<>();
        Arrays.sort(numlist);
        int minIdx = -1;
        int plusIdx = numlist.length;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] == n){
                list.add(numlist[i]);
                minIdx = i-1;
                plusIdx = i+1;
                break;
            } else if(i+1 != numlist.length && numlist[i] < n && numlist[i+1] > n){
                minIdx = i;
                plusIdx = i+1;
                break;
            } else if(numlist[0] > n){
                plusIdx = 0;
                break;
            } else if(numlist[numlist.length - 1] < n){
                minIdx = numlist.length -1;
                break;
            }
        }
        
        while(minIdx != -1 || plusIdx != numlist.length){
            if(minIdx != -1 && plusIdx != numlist.length){
                int mindist = n - numlist[minIdx];
                int maxdist = numlist[plusIdx] - n;
                if(maxdist < mindist){
                    list.add(numlist[plusIdx++]);
                } else if(maxdist > mindist) {
                    list.add(numlist[minIdx--]);
                } else{
                    if(numlist[minIdx] > numlist[plusIdx]){
                        list.add(numlist[minIdx--]);
                    } else {
                        list.add(numlist[plusIdx++]);
                    }
                }
            } else if(minIdx == -1){
                list.add(numlist[plusIdx++]);
            } else if(plusIdx == numlist.length){
                list.add(numlist[minIdx--]);
            }
        }
        
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}