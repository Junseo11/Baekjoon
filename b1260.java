package baek.BaekjoonKotlin;

import java.io.*;
import java.util.*;

public class b1260 {

    static ArrayList<Integer> list[];
    static boolean visited1[];
    static boolean visited2[];

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String []args) throws IOException{



        String []str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0])+1;
        int m = Integer.parseInt(str[1]);
        int v = Integer.parseInt(str[2]);

        list = new ArrayList[n];
        visited1 = new boolean[n];
        visited2 = new boolean[n];

        for(int i = 1; i<n; ++i){
            list[i] = new ArrayList<>();
            visited1[i] = false;
            visited2[i] = false;
        }

        for(int i = 0; i <m; ++i){
            String []s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            list[a].add(b);
            list[b].add(a);

        }

        for(int i = 1; i<n; ++i){
            Collections.sort(list[i]);
        }

        dfs(v);
        bfs(v);

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    static void dfs(int node){
        visited1[node] = true;
        sb.append(node+" ");

        for(int n : list[node]){
            if(!visited1[n]){
                dfs(n);
            }
        }
    }

    static void bfs(int node){
        sb.append("\n");
        visited2[node] = true;
        q.add(node);

        while (!q.isEmpty()){
            int item = q.poll();
            sb.append(item +" ");
            for(int n : list[item]){
                if(!visited2[n]){
                    q.add(n);
                    visited2[n] = true;
                }
            }
        }


    }


}
