import java.util.*;
import java.io.*;

class Main {
    static int N, M;
    static List<Integer> arr;
    static List<Integer> answer;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());        
        
        st = new StringTokenizer(br.readLine());
        arr = new LinkedList<>();
        answer = new LinkedList<>();
        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        
        Collections.sort(arr);
        sb = new StringBuilder();
        recursive(0);
        
        System.out.println(sb);
    }
    
    static void recursive(int depth) {
        if(depth == M) {
            for(int i = 0; i < M ; i++) {
                sb.append(answer.get(i));
                if(i != M-1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        
        for(int i = 0;i < arr.size(); i++) {
            int num = arr.get(i);
            answer.add(num);
            arr.remove(i);
            recursive(depth + 1);
            answer.remove(answer.size() - 1);
            arr.add(i,num);
        }
    }
}