package baek.BaekjoonKotlin;

import java.util.Scanner;

public class b1743 {

    static boolean map[][];
    static boolean visit[][];

    static int n,m,count;

    //상하좌우
    static int [] dirx = {0,0,-1,1};
    static int [] diry = {-1,1,0,0};

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        // 세로길이
        n = input.nextInt();
        //가로길이
        m = input.nextInt();
        int k = input.nextInt();
        int maxCount = 0;

        map = new boolean[n][m];
        visit = new boolean[n][m];

        // 맵 초기화
        for(int i = 0 ; i < k ; ++i){
            int r = input.nextInt();
            int c = input.nextInt();

            map[r-1][c-1] = true;
        }

        for (int i = 0 ; i< n; ++i){
            for(int j = 0 ; j< m ; ++j){
                if(map[i][j] && !visit[i][j]){
                    count = 0;
                    dfs(j,i);
                    if(count> maxCount){
                        maxCount = count;
                    }

                }
            }
        }
        System.out.println(maxCount);
    }

    static void dfs(int x, int y){
        visit[y][x] = true;
        ++count;
        int nowx = 0;
        int nowy = 0;

        for(int i = 0 ; i < 4; ++i){
            nowx = x + dirx[i];
            nowy = y + diry[i];

            if(range_check(nowx,nowy) && !visit[nowy][nowx] && map[nowy][nowx]){
                dfs(nowx,nowy);
            }
        }
    }

    static boolean range_check(int x, int y){
        return (0<= x && x < m && 0 <= y && y< n);
    }

}
