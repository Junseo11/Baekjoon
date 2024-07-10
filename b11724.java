package baek.BaekjoonKotlin;

import java.util.ArrayList;
import java.util.Scanner;

public class b11724 {

    static ArrayList<Integer> list[];
    static boolean visited[];
    static int ans = 0;
    public static void main(String []args){
        Scanner input = new Scanner(System.in);



        int n = input.nextInt();
        int m = input.nextInt();

        list = new ArrayList[n+1];
        visited = new boolean[n+1];


        for(int i = 1; i<list.length; ++i){
            list[i] = new ArrayList<>();
            visited[i] = false;
        }

        for(int i=0; i<m;++i){
            int a = input.nextInt();
            int b = input.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        for(int i = 1; i<=n; ++i){
            if(!visited[i]){
                dfs(i);
                ++ans;
            }


        }

        System.out.print(ans);


    }

    static void dfs(int node) {
        if(visited[node]){
            return;
        }
        visited[node] = true;

        for(int n : list[node]){
            if(!visited[n]){
                dfs(n);
            }
        }

    }
}
