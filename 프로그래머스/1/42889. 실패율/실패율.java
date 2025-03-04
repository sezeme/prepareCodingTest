import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stageCount = new int[N + 2];
        int challengedNumber = stages.length;

        for (int stage : stages) {
            stageCount[stage]++;
        }

        Map<Integer, Double> failureRateMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            if (challengedNumber == 0) {
                failureRateMap.put(i, 0.0);
            } else {
                failureRateMap.put(i, (double) stageCount[i] / challengedNumber);
                challengedNumber -= stageCount[i];
            }
        }

        List<Integer> sortedStages = new ArrayList<>(failureRateMap.keySet());
        sortedStages.sort((a, b) -> {
            int compare = Double.compare(failureRateMap.get(b), failureRateMap.get(a));
            return compare == 0 ? Integer.compare(a, b) : compare;
        });

        return sortedStages.stream().mapToInt(i -> i).toArray();
    }
}
