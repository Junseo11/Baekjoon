package baek.BaekjoonKotlin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1303 {

    static char map[][];
    static boolean visit[][];

    static int count;

    // 상하좌우
    static int dir_x[] = {0,0,-1,1};
    static int dir_y[] = {-1,1,0,0};

    //현재 위치
    static int current_x;
    static int current_y;
    static int n;
    static int m;

    public static void main(String []args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 가로
        n = Integer.parseInt(st.nextToken());
        // 세로
        m = Integer.parseInt(st.nextToken());

        int white =0;
        int blue = 0;

        map = new char[m][n];
        visit = new boolean[m][n];

        // 맵 초기화
        for(int i = 0 ; i < m; ++i){
            String str = br.readLine();
            for(int j = 0 ; j < n ; ++j){
                map[i][j] = str.charAt(j);
            }
        }

        // 요소 순회하면서 방문하지 않은 노드이면 dfs
        for(int i = 0 ; i < m ; ++i){
            for(int j = 0 ; j < n ; ++j){

                if(visit[i][j] == false){
                    char color = map[i][j];
                    count = 0;
                    dfs(j,i, color);

                    // 색별로 곱하고 더하기
                    if(color == 'W'){
                        white += count * count;
                    }
                    else{
                        blue += count * count;
                    }

                }
            }
        }

        System.out.println(white + " " + blue);
    }


    //dfs는 상하좌우 탐색
    // 범위 나가면 x
    static void dfs(int x, int y, char color){
        count +=1;
        visit[y][x] = true;

        for(int i = 0 ; i < 4 ; ++i){
            current_x = dir_x[i] + x;
            current_y = dir_y[i] + y;

            if(check() && map[current_y][current_x] == color && visit[current_y][current_x] == false){
                dfs(current_x,current_y,map[current_y][current_x]);
            }


        }
    }

    static boolean check(){
        return (0<= current_x&& current_x < n && 0<= current_y && current_y < m);
    }


}
