class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int [][]pair = {{0,1,2,3},{0,2,1,3},{0,3,1,2}};
        
        for(int i = 0; i<3; i++){
            if(getSlope(dots[pair[i][0]], dots[pair[i][1]]) == getSlope(dots[pair[i][2]],dots[pair[i][3]]))
                return 1;
        }
        
        return 0;
    }
    
    double getSlope(int[] dot1, int[] dot2){
        return (dot1[0] - dot2[0]) / (double) (dot1[1] - dot2[1]);
    }
}