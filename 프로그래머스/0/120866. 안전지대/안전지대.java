class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int size = board.length;
        int []dc = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int []dr = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        boolean [][]notSecure = new boolean[size][size];
        
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                if(board[i][j] == 1){
                    for(int k = 0; k < dc.length; k++){
                        int nc = i + dc[k];
                        int nr = j + dr[k];
                        if(nc >= 0 && nc < size && nr >= 0 && nr < size)
                            notSecure[nc][nr] = true;
                    }
                }
            }
        }
        
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(!notSecure[i][j]) answer++;
            }
        }
        
        
        return answer;
    }
}