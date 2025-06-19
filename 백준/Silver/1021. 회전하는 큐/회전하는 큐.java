import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        // 1 2 3 4 5 6 7 8 9 10
        // 뽑아내려고 하는 수가 왼쪽에서 더 가까운지 or 오른쪽에서 더 가까운지
        // 일단 무조건 왼쪽으로 돌린다음, n과 size - n 비교하기
        
        for(int i = 1; i <= N; i++){
            q.offer(i);
        }
        
        st = new StringTokenizer(br.readLine());
        int num;
        int count;
        int answer = 0;
        while(st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());
            count = 0;
            while(num != q.peek()) {
                q.offer(q.poll());
                count++;
            }
            answer += Math.min(count, q.size() - count);
            
            q.poll();
        }
        
        System.out.println(answer);
    }
}

