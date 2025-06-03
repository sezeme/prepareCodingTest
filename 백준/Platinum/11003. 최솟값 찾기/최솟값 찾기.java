import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

       
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<int []> q = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while (!q.isEmpty() && q.peekLast()[0] > num) q.pollLast();
            q.offer(new int[] {num, i});
            if(q.peekFirst()[1] < i -L + 1){
                q.pollFirst();
            }
            sb.append(q.peekFirst()[0]).append(" ");
        }

        System.out.println(sb);
    }
}