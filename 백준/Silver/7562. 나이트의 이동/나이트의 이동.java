import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {

    static int T, I;
    static point curPoint, nextPoint;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    static class point {
        int x, y, depth;

        point(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }// class point

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            I = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            curPoint = new point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            st = new StringTokenizer(br.readLine());
            nextPoint = new point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);

            System.out.println(bfs());
        }
    }// main()

    static int bfs() {
        Queue<point> qu = new LinkedList<>();
        boolean[][] visited = new boolean[I][I];

        qu.offer(curPoint);
        visited[curPoint.x][curPoint.y] = true;

        while (!qu.isEmpty()) {
            point tmp = qu.poll();

            if (tmp.x == nextPoint.x && tmp.y == nextPoint.y) {
                return tmp.depth;
            }

            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < I && ny < I && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    qu.offer(new point(nx, ny, tmp.depth + 1));
                }
            }
        }
        return -1;
    }// bfs()
}// class Main