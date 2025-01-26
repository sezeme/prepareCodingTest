import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer =  -1, availableSeatSize = 1;
        int [][]visited = new int[park.length][park[0].length];
        
        for(int i = 0; i<park.length; i++){
            visited[i][0] = park[i][0].equals("-1") ? 1 : 0;
        }
        for(int j = 1; j<park[0].length; j++){
            visited[0][j] = park[0][j].equals("-1") ? 1 : 0;
        }
        
        for(int i = 1; i<park.length; i++){
            for(int j = 1; j<park[0].length; j++){
                if(park[i][j].equals("-1")){
                    visited[i][j] = Math.min(visited[i][j-1],Math.min(visited[i-1][j],visited[i-1][j-1])) + 1;
                    availableSeatSize = Math.max(visited[i][j], availableSeatSize);
                }
            }
        }
        
        Arrays.sort(mats);
        for(int i = mats.length - 1 ; i >= 0 ; i--){
            if(mats[i] <= availableSeatSize){
                answer = mats[i];
                break;
            }
        }
        
        return answer;
    }
}