import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> st;
        boolean isNo;
        str = br.readLine();
        while (!str.equals(".")) {
            st = new Stack<>();
            isNo = false;
            for (char ch : str.toCharArray()) {
                if (ch == '[' || ch == '(') {
                    st.push(ch);
                } else if (ch == ']' || ch == ')') {
                    if (st.isEmpty()) {
                        isNo = true;
                        break;
                    } else if ((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']')) st.pop();
                    else {
                        isNo = true;
                        break;
                    }
                }
            }

            if (isNo || !st.isEmpty()) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
            str = br.readLine();
        }


    }
}