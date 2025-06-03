import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int T, n;
    static Deque<String> arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());


        boolean isFront;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            isFront = true;
            String[] input = br.readLine().split("");
            arr = new LinkedList<>();

            br.readLine();
            String[] strarr = br.readLine().split("[\\[\\],]");
            for (int j = 0; j < strarr.length; j++) {
                if (strarr[j].isBlank()) continue;
                arr.offer(strarr[j]);
            }

            boolean isError = false;
            for (String str : input) {
                if (str.equals("R")) {
                    isFront = !isFront;
                } else if (str.equals("D")) {
                    if (arr.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isFront) arr.removeFirst();
                    else arr.removeLast();
                }

            }

            if (isError) {
                sb.append("error\n");
            } else {
                List<String> resultList = new ArrayList<>();

                if (isFront) {
                    resultList.addAll(arr);
                } else {
                    while (!arr.isEmpty()) {
                        resultList.add(arr.pollLast());
                    }
                }

                sb.append("[");
                sb.append(String.join(",", resultList));
                sb.append("]\n");
            }

        }

        System.out.println(sb);

    }
}