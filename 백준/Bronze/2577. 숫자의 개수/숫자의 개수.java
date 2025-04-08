import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int sum = a * b * c;

        String sumString = String.valueOf(sum);
//        String sumString = Integer.toString(sum);

        int[] array = new int[10];
        for (int i = 0; i < sumString.length(); i++) {
            int index = sumString.charAt(i) - '0';
            array[index]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        /*
        향상된 for문
        for (int num : array) {
            System.out.println(num);
        }*/

    }
}