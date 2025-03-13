import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Queue;
import java.util.*;

public class Main {
    // 몇 개의 분리된 영역으로 나누어짐
    static int m, n, k;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = new int[]{0, 0, -1, 1};
    static int[] dy = new int[]{-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int xStart = Integer.parseInt(st.nextToken());
            int yStart = Integer.parseInt(st.nextToken());
            int xEnd = Integer.parseInt(st.nextToken());
            int yEnd = Integer.parseInt(st.nextToken());
            for (int y = yStart; y < yEnd; y++) {
                for (int x = xStart; x < xEnd; x++) {
                    map[y][x] = 1;
                }
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (map[y][x] == 0 && !visited[y][x]) {

                    answer.add(bfs(x, y));
                }
            }
        }
        answer.sort(Comparator.naturalOrder());

        StringBuilder sb= new StringBuilder();
        sb.append(answer.size()).append("\n");
        answer.forEach(i -> sb.append(i).append(" "));
        System.out.println(sb.toString().trim());
    }

    private static int bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[y][x] = true;
        int count = 1;
        while (!q.isEmpty()) {
            Point point = q.poll();

            for (int i = 0; i < 4; i++) {
                int cx = point.x + dx[i];
                int cy = point.y + dy[i];

                if(cx < 0 || cx >= n || cy < 0 || cy >= m) continue;
                if(map[cy][cx] == 0 && !visited[cy][cx]){
                    visited[cy][cx] = true;
                    q.offer(new Point(cx, cy));
                    count++;
                }
            }
        }
        return count;
    }

}