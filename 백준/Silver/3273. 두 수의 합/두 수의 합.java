import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        /*---------- 여기까지 입력 -----------*/

        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;
        int count = 0;

        while (start < end) {
            if (arr[start] + arr[end] == x)  count++;
            if (arr[start] + arr[end] <= x) start++;
            else end--;
        }

        System.out.println(count);
    }
}