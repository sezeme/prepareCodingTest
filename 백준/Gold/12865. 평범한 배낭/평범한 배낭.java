import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long[][] dp = new long[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            long w = Long.parseLong(st.nextToken());
            long v = Long.parseLong(st.nextToken());

            for(int j = 1; j <= k; j++){
                if(j < w){
                    dp[i][j] = dp[i-1][j];
                } else{
                    // 이전 행의 최적해를 따라감
                    dp[i][j] = Math.max(v + dp[i-1][(int)(j-w)], dp[i-1][j]);
                }
            }
        }


        System.out.println(dp[n][k]);

    }
}