package baek.BaekjoonKotlin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b17086 {

    static int n,m,map[][],answer;

    // 상하좌우 대각선
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String []args) throws IOException{
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        // 맵 초기화
        for(int i = 0 ; i < n; ++i){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m ; ++j){
                map[i][j] =Integer.parseInt(st.nextToken());
            }
        }

        // 각 노드 순회
        int tmp = 0;
        for(int i = 0 ; i < n; ++i){
            for(int j = 0; j < m ; ++j){
                if(map[i][j] == 1) continue;

                // 노드의 순회 결과값이 answer보다 크면 업데이트
                tmp = bfs(j,i);
                answer = tmp>answer ? tmp : answer;
            }
        }
        System.out.println(answer);
    }

    static int bfs(int x, int y) {
        Queue<Node_shark> queue = new LinkedList<>();
        queue.add(new Node_shark(x,y,0));

        // 각 방향별로 탐색할때 이전에 방문한곳 안가게 함
        boolean visit[][] = new boolean[n][m];

        visit[y][x] = true;

        while (!queue.isEmpty()){
            Node_shark now = queue.poll();

            // 각 방향 이동
            for(int i = 0 ; i< 8 ; ++i){
                int nextx = now.x + dx[i];
                int nexty = now.y + dy[i];
                int point = now.point;


                if(range_check(nextx,nexty)  && !visit[nexty][nextx]){
                    if (map[nexty][nextx] == 1){
                        return point+1;
                    }
                    queue.add(new Node_shark(nextx,nexty,point+1));
                    visit[nexty][nextx] = true;

                }
            }
        }
        return 0;
    }

    static boolean range_check(int x, int y){
        return (0<=x && x <m && 0<=y && y<n);
    }

}
 class Node_shark{
    int x;
    int y;
    int point;

    Node_shark(int x, int y, int point){
        this.x = x;
        this.y = y;
        this.point = point;
    }
}
