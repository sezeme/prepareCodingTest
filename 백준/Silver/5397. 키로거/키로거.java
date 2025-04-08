import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();
            String input = br.readLine();

            for(char ch : input.toCharArray()) {
                switch(ch) {
                    case '<':
                        if(!left.empty()) {
                            right.push(left.pop());
                        }
                        break;
                    case '>':
                        if(!right.empty()) {
                            left.push(right.pop());
                        }
                        break;
                    case '-':
                        if(!left.empty()) {
                            left.pop();
                        }
                        break;
                    default:
                        left.push(ch);
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();
            while(!left.empty()) {
                right.push(left.pop());
            }
            while(!right.empty()) {
                sb.append(right.pop());
            }
            System.out.println(sb);
        }
    }
}