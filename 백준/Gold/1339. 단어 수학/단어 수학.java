import java.io.*;
import java.util.*;

public class Main {
	static int N, sum;
	static String input[];
	static int alphabet[] = new int[26];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine().trim());
		input = new String[N];
		for(int i = 0; i<N; i++) {
			input[i] = br.readLine().trim();
		}
		
		//put to alphabet
        for(int i=0; i<N; i++){
            int temp = (int)Math.pow(10,input[i].length()-1);
            for(int j=0; j<input[i].length(); j++){
                alphabet[(int)input[i].charAt(j)-65]+=temp;
                temp /=10;
            }
        }
		
		//sorting & multiple
		Arrays.sort(alphabet);
		int num = 9;
		for(int i = alphabet.length-1; i>=0 ; i--) {
			if(alphabet[i] == 0) break;
			sum += alphabet[i]*num--;
		}
		System.out.println(sum);
	}

}
