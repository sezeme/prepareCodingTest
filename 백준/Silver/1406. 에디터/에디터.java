import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Character> list = new LinkedList<>();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());

        /*---------- 여기까지 입력 -----------*/
        //iterator 메소드 호출
        ListIterator<Character> iter = list.listIterator();

        //처음 커서는 문장의 맨 뒤에 있어야하기 때문에 커서를 맨뒤로 이동시켜줌 (ex. abc|)
        while (iter.hasNext()) {
            iter.next();
        }

        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L':
                    if (iter.hasPrevious())
                        iter.previous();

                    break;
                case 'D':
                    if (iter.hasNext())
                        iter.next();

                    break;
                case 'B':
                    //remove()는 next()나 previous()에 의해 반환된 가장 마지막 요소를 리스트에서 제거함
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    iter.add(t);

                    break;
                default:
                    break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (Character chr : list) {
            sb.append(chr);
        }

        System.out.println(sb);
    }
}