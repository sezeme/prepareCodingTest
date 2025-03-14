import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();

        int[][] map = new int[arr1.length + 1][arr2.length + 1];
        int max = 0;
        for(int i = 1; i <= arr1.length; i++){
            for(int j = 1; j<= arr2.length; j++){
                if(arr1[i-1] == arr2[j-1]){
                    map[i][j] = map[i-1][j-1] + 1;
                } else {
                    map[i][j] = Math.max(map[i][j-1], map[i-1][j]);
                }
                if(max < map[i][j]) max = map[i][j];
            }
        }

        System.out.println(max);

    }
}