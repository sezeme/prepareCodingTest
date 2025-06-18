import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int N;
    static Queue<Integer> q;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        q = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            q.offer(i);
        }
        
        while(q.size() != 1){
            q.poll();
            q.offer(q.poll());
        }
        
        System.out.println(q.poll());
    }
}