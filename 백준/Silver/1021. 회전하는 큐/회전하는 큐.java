import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        List<Integer> arr = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }

        Queue<Integer> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int cur_idx = 0;
        int count = 0;
        while (!queue.isEmpty()) {
            int num = queue.poll();

            int i = 0;
            for (i = 0; i < arr.size(); i++) {
                if (num == arr.get(i)) break;
            }
            
            int a = Math.abs(cur_idx - i);
            int b = Math.abs(arr.size() - a);
            count +=  Math.min(a, b);

            arr.remove(i);
            cur_idx = arr.size() == i ? 0 : i;
        }

        System.out.println(count);
    }
}