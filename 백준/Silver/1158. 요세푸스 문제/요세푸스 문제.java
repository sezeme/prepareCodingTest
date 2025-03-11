import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        StringJoiner sj = new StringJoiner(", ", "<",">");
        while (!q.isEmpty()) {
            for (int i = 0; i < k-1; i++) {
                q.offer(q.poll());
            }
            sj.add(q.poll().toString());
        }

        System.out.println(sj);
    }
}