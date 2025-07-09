import java.util.*;
import java.io.*;

class Main {
    
    static int N, M;
    static int[] arr;
    static int[] answer;
    static boolean[] visited;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        answer = new int[M];
        arr = new int[N];
        visited = new boolean[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        sb = new StringBuilder();
        recursive(0, 0);
        
        System.out.println(sb);
    }
    
    static void recursive(int depth, int i) {
        if(depth == M) {
            for(int j = 0; j < M; j++){
                sb.append(answer[j]);
                if(j != M - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return;
        }
        
        for(; i < N; i++){
            if(visited[i] || (i != 0 && arr[i-1] == arr[i] && !visited[i-1]))
                continue;
            answer[depth] = arr[i];
            visited[i] = true;
            recursive(depth + 1, i);
            visited[i] = false;
        }
    }
}