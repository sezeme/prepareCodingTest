import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String str;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        Stack<Character> st;
        int count = 0;
        for (int i = 0; i < N; i++) {
            st = new Stack<>();
            str = br.readLine();
            st.push(str.charAt(0));
            for (int j = 1; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (st.isEmpty() || ch != st.peek()) {
                    st.push(ch);
                } else {
                    st.pop();
                }
            }
            if (st.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);

    }
}