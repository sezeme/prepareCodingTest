class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int rowSize = arr.length, colSize = arr[0].length;
        if(rowSize == colSize);
        else if(rowSize > colSize){
            //가로로 늘린다.
            //arr.length = 세로길이
            //arr[0].length = 가로길이
            //세로 길이가 더 길고, 가로길이를 세로 길이에 맞춰서 늘려야
            for(int i = 0; i < rowSize; i++){
                int []tmp = new int[rowSize];
                for(int j = 0; j < rowSize; j++){
                    if(j < colSize){
                        tmp[j] = arr[i][j];
                    } else {
                        tmp[j] = 0;
                    }
                }
                arr[i] = tmp;
            }
        } else {
            //세로로 늘린다.
            int [][]tmp = new int[arr[0].length][arr[0].length];
            for(int i = 0; i < arr[0].length; i++){
                if(i < arr.length){
                    tmp[i] = arr[i].clone();
                                        
                } else {
                    tmp[i] = new int[tmp.length];
                }
            }
            arr = tmp;
        }
        
        return arr;
    }
}