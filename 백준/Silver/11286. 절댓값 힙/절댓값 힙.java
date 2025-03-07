import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            array.add(Integer.parseInt(br.readLine()));
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int absCompare = Integer.compare(Math.abs(a), Math.abs(b));
            if(absCompare == 0) {
                return Integer.compare(a, b);
            }
            return absCompare;
        });

        StringBuilder sb = new StringBuilder();

        array.forEach(i -> {
            if(i == 0) {
                sb.append(pq.isEmpty() ? "0" : pq.poll().toString()).append(" ");
            }
            else pq.offer(i);
        });

        System.out.println(sb.toString().trim());
    }
}