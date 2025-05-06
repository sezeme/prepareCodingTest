import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }
        // java에서 정렬 : 계산 결과가 음수이면 그대로, 양수이면 앞뒤가 바뀐다.
        /*
        * o1 = 3 && o2 = 4 => 음수이므로 그대로, 3 다음 4이면 오름차순
        * o1 = 4 && o2 = 3 => 양수이므로 앞뒤 변경, 4 다음 3이면 내림차순
        * */
        list.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                int a = 0;
                int b = 0;
                for (int i = 0; i < o1.length(); i++) {
                    int num1 = o1.charAt(i) - '0';
                    int num2 = o2.charAt(i) - '0';
                    if (num1 > 0 && num1 < 10) {
                        a += num1;
                    }
                    if (num2 > 0 && num2 < 10) {
                        b += num2;
                    }
                }
                if (a == b) {
                    return o1.compareToIgnoreCase(o2);
                }
                return a - b; // 작은거부터 먼저 : 오름차순
            }
        });
        list.forEach(System.out::println);
    }

}