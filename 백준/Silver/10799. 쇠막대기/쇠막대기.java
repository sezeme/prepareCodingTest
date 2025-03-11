import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value = br.readLine();
        Stack<Character> stack = new Stack<>();
        int pieceCnt = 0;
        for(int i = 0; i < value.length(); i++){
            char ch = value.charAt(i);
            if( ch == '(') stack.push(ch);
            else {
                stack.pop();
                if(value.charAt(i-1) == '(') {
                    //레이저
                    pieceCnt += stack.size();
                } else {
                    //쇠막대기
                    pieceCnt++;
                }
            }
        }
        System.out.println(pieceCnt);
    }
}