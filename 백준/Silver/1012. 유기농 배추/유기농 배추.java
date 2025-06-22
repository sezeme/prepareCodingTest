import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int T, M, N, K;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    static int answer;

    public static void dfs(int i, int j) {
        visited[i][j] = true;

        for(int direction = 0; direction < 4; direction++){
            int cy = i + dx[direction];
            int cx = j + dy[direction];

            if(cx <0 || cx >= M || cy < 0 || cy >= N) continue;

            if(map[cy][cx] == 1 && !visited[cy][cx]) {
                dfs(cy, cx);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            answer = 0;

            map = new int[N][M];
            visited = new boolean[N][M];

            for(int i = 0; i < K; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x]++;
            }

            // dfs 문제
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(!visited[i][j] && map[i][j] == 1){
                        answer++;
                        dfs(i, j);
                    }
                }
            }

            System.out.println(answer);
        }
    }
}