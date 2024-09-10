package baek.BaekjoonKotlin;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b2178 {

    static int[][] map;
    static boolean [][] visit;

    // 상하 좌우
    static int[] dirx = {0,0,-1,1};
    static int[] diry = {-1,1,0,0};

    static int n;
    static int m;

    //다음 위치
    static int nextx =0;
    static int nexty =0;

    public static void main(String []args) throws IOException {
        // 맵 입력, 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];

        // 맵 초기화
        for(int i = 0 ; i<n; ++i){
            String str = br.readLine();

            for(int j = 0 ; j<m; ++j){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        //bfs
        bfs(0,0);

        //결과
        System.out.println(map[n-1][m-1]);
    }

    //bfs
    static void bfs(int x, int y){
        Queue<int []> queue = new LinkedList<>();
        visit[x][y] = true;

        queue.add(new int[]{x,y});

        while (!queue.isEmpty()){
            int [] now = queue.poll();

            int nowx = now[0];
            int nowy = now[1];

            for(int i = 0 ; i<4; ++i){
                nextx = nowx + dirx[i];
                nexty = nowy + diry[i];

                if(range_check() && map[nextx][nexty]!=0 && visit[nextx][nexty] == false){
                    queue.add(new int[]{nextx,nexty});
                    map[nextx][nexty] = map[nowx][nowy]+1;
                    visit[nextx][nexty] = true;
                }

                nextx = 0;
                nexty = 0;
            }
        }


    }

    //범위 정하기
    static boolean range_check(){
        return (0<= nextx && nextx < n && 0<=nexty && nexty < m);
    }

}
