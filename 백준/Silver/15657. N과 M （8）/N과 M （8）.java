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
    
    static void recursive(int depth, int index) {
        if(depth == M) {
            for(int i = 0; i < M; i++){
                sb.append(answer[i]);
                if(i != M - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return;
        }
        
        for(;index < N; index++){            
            answer[depth] = arr[index];
            visited[index] = true;
            recursive(depth + 1, index);
            visited[index] = false;
        }
    }
}