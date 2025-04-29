import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Main {

    static Stack<Integer> stack = new Stack<>();
    static int n;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int tmp = 1;
        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(br.readLine());
            for (; tmp <= input; tmp++) {
                stack.push(tmp);
                sb.append("+").append("\n");
            }
            if(stack.peek() == input) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb);
    }

}