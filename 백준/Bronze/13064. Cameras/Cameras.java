import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static String str;
    static char[] chars;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            str = br.readLine();
            chars = str.toCharArray();

            if(chars.length == 8
                    && chars[0] == chars[1]
                    && Character.isDigit(chars[0])
                    && Character.isDigit(chars[2])
                    && Character.isDigit(chars[3])
                    && Character.isUpperCase(chars[4])
                    && Character.isDigit(chars[5])
                    && Character.isDigit(chars[6])
                    && Character.isDigit(chars[7])
                    && chars[0] != '0'
                    && chars[2] != '0'
                    && chars[3] != '0'
                    && chars[5] != '0'
                    && chars[6] != '0'
                    && chars[7] != '0'
            ) System.out.println(str);


        }



    }
}