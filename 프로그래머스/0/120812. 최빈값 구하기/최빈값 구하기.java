import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int []count = new int[1000];
        for(int i = 0; i<array.length; i++){
            count[array[i]]++;
        }

        int []compare = count.clone();
        Arrays.sort(compare);
        int max = compare[compare.length-1];
        if(max == compare[compare.length - 2]) return -1;
        for(int i = 0; i<count.length; i++){
            if(max == count[i]) return i;
        }

        return answer;
    }
}