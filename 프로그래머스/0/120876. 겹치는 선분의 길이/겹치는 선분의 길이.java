import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int [][]checkCases = {{0,1}, {0,2},{1,2}};
        List<int []> crossedLines = new LinkedList<>();
        
        for(int i = 0; i<3; i++){
            int idx1 = checkCases[i][0], idx2 = checkCases[i][1];
            if(Math.max(lines[idx1][0], lines[idx2][0]) >= Math.min(lines[idx1][1], lines[idx2][1])) continue;
            int start = Math.max(lines[idx1][0], lines[idx2][0]);
            int end = Math.min(lines[idx1][1], lines[idx2][1]);
            int [] newLine = {start, end};
            
            if(crossedLines.isEmpty()){
                crossedLines.add(newLine);
                continue;
            }
            
            for(int j = 0; j<crossedLines.size(); j++){
                int []line1 = crossedLines.get(j);
                //겹치지 않으면 pass
                if(Math.max(newLine[0], line1[0]) >= Math.min(newLine[1], line1[1])) {
                    crossedLines.add(newLine);
                    continue;
                }
                
                //겹치면
                start = Math.min(newLine[0], line1[0]);
                end = Math.max(newLine[1], line1[1]);
                int []replaceLine = {start, end};
                crossedLines.remove(j);
                crossedLines.add(replaceLine);
                break;
            }
        }
            // 3-5, 3-9, 1-5 => 3-9, 1-5 => 1-9
        for(int i = 0; i<crossedLines.size(); i++){
            answer += crossedLines.get(i)[1] - crossedLines.get(i)[0];
        }
        return answer;
    }
}