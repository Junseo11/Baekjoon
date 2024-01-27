package baek.BaekjoonKotlin;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class b13023 {

    static ArrayList<Integer> peaple[];
    static boolean[] visited;
    static int ans = 0;

    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        peaple = new ArrayList[n];
        visited = new boolean[n];

        for(int i = 0 ; i<n; ++i){
            peaple[i] = new ArrayList<>();
        }

        for(int i = 0; i<m; ++i){
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            peaple[a].add(b);
            peaple[b].add(a);
        }

        for(int i = 0; i<n; ++i){
            if(ans == 0){
                dfs(i,0);
            }

        }


        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int node,int len){
        if(len>=4){
            ans = 1;
            return;
        }

        visited[node] = true;

        for(int n : peaple[node]){
            if(!visited[n]){
                dfs(n,len+1);
            }
        }

         visited[node] = false;

    }

}
