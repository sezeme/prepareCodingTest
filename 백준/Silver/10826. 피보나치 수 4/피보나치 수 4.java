import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        BigInteger[] dp = new BigInteger[n + 1];
        if(n == 0){
            System.out.println(0);
            return;
        } else if(n == 1){
            System.out.println(1);
            return;
        }
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;

        for(int i= 2; i<=n; i++){
            dp[i] = dp[i-2].add(dp[i-1]);
        }

        System.out.println(dp[n]);

    }
}