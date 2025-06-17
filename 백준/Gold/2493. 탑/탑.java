import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static Stack<Integer> stk;
    static int[] arr, answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N + 1];
        answer = new int[N + 1];
        stk = new Stack<>();

        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int received_tower = 1;
        for(int i = N; i >= 1; i--){
            if(stk.isEmpty()) stk.push(i);
            else {
                while(!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
                    answer[stk.pop()] = i;
                }
                stk.push(i);
            }
        }
        

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++){
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}

