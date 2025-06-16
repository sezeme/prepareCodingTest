import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int K;
    static Stack<Integer> stk;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        stk = new Stack<>();

        String input;
        for(int i = 0; i < K; i++){
            input = br.readLine();
            if(input.equals("0")) stk.pop();
            else stk.push(Integer.parseInt(input));
        }
        
        int sum = 0;
        while(!stk.isEmpty()) {
            sum += stk.pop();
        }
        
        System.out.println(sum);

    }
}

