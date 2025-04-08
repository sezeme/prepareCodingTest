
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String set = br.readLine();

        // 9는 6과 함께 count 후 /2
        int[] array = new int[10];

        for(int i = 0; i < set.length() ; i++) {
            int index = set.charAt(i) - '0';
            if(index == 9) index = 6;

            array[index]++;
        }

        int max = 0;
        for(int i = 0; i < 9 ; i++) {
            if(i == 6) {
                if((array[i]+1)/2 > max) max = (array[i]+1)/2;
            }
            else if(array[i] > max) max = array[i];
        }

        System.out.println(max);
    }
}