import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int filter_col = getColIdx(ext);
        int sort_col = getColIdx(sort_by);
        
        int[][] answer = Arrays.stream(data)
            .filter(row -> row[filter_col] < val_ext)
            .sorted((a, b) -> a[sort_col] - b[sort_col])
            .toArray(int[][]::new);
        
        return answer;
    }
    
    int getColIdx(String ext){
        int result;
        if(ext.equals("code")) result = 0;
        else if(ext.equals("date")) result = 1;
        else if(ext.equals("maximum")) result = 2;
        else result = 3;
        return result;
    }
}