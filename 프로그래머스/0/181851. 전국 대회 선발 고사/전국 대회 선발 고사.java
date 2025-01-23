import java.util.stream.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int []arr = IntStream.range(0, rank.length)
            .filter(i -> attendance[i]) //visited가 true인 경우만 필터링
            .map(i -> rank[i]) // 해당 인덱스의 rank값 추출
            .boxed() // IntStream을 IntegerStream으로 변환
            .sorted((a, b) -> a - b) // 내림차순 정렬
            .limit(3)
            .mapToInt(Integer::intValue)
            .toArray(); // int[]로 변환
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<rank.length; j++){
                if(arr[i] == rank[j]){
                    arr[i] = j;
                    break;
                }
            }
        }

        answer = 10000*arr[0] + 100*arr[1] + arr[2];
        
        return answer;
    }
}