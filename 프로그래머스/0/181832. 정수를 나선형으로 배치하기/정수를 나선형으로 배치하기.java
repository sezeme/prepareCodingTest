class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int i = 0;
        int j = 0;
        int dir = 0;
        int []di = {0, 1, 0, -1};
        int []dj = {1, 0, -1, 0};
        int number = 1;
        
        while(number<= n*n){
            answer[i][j] = number++;
            
            int ni = i + di[dir];
            int nj = j + dj[dir];
            
            if(ni < 0 || ni >= n || nj < 0 || nj >= n || answer[ni][nj] != 0){
                dir = (dir + 1) % 4;
            }
            
            i += di[dir];
            j += dj[dir];
            

        }
        return answer;
    }
    
}