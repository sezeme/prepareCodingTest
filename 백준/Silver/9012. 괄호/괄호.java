import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack;
        String input;
        for (int k = 0; k < n; k++) {
            stack = new Stack<>();
            input = br.readLine();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        stack.push('N');
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}