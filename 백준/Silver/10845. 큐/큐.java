import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static int[] queue = new int[10001];

    static int first = 0;
    static int last = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    sb.append(pop()).append("\n");
                    break;

                case "size" :
                    sb.append(size()).append("\n");
                    break;

                case "empty" :
                    sb.append(empty()).append("\n");
                    break;

                case "front" :
                    sb.append(front()).append("\n");
                    break;

                case "back" :
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }


    static void push(int N) {
        queue[last] = N;
        last++;
    }

    static int pop() {
        if (last - first == 0) {
            return -1;
        }
        int num = queue[first];
        first++;
        return num;
    }

    static int size() {
        return last - first;
    }

    static int empty() {
        if (last - first == 0) {
            return 1;
        }
        return 0;
    }

    static int front() {
        if (last - first == 0) {
            return -1;
        }
        return queue[first];
    }

    static int back() {
        if (last - first == 0) {
            return -1;
        } else {
            return queue[last - 1];
        }
    }

}