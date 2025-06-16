import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int N, K;
    static Queue<Integer> q;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        q = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(!q.isEmpty()) {
            for(int i = 0 ; i < K-1; i++){
                q.offer(q.poll());
            }
            
            sb.append(q.poll());
            if(!q.isEmpty()) sb.append(", ");
        }
        sb.append(">");
        
        // 7 1 2 4 5
        System.out.println(sb);
        

    }
}

