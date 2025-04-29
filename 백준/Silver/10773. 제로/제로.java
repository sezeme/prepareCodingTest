import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;


public class Main {

    static Stack<Integer> stack = new Stack<>();

    static int k;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < k ; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        Long sum = 0L;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);

    }

}