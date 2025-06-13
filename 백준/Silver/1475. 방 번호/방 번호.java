import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static String N;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = br.readLine();
        arr = new int[10];
        
        for(int i = 0; i < N.length() ; i++){
            char ch = N.charAt(i);
            arr[ch - '0']++;
        }
        
        int sum = arr[9] + arr[6];
        if(sum%2 == 0){
            arr[9] = arr[6] = sum/2;
        } else {
            arr[9] = sum/2 + 1;
            arr[6] = sum/2;
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[9]);

    }
}