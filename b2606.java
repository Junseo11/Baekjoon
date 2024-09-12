package baek.BaekjoonKotlin;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SplittableRandom;

public class b2606 {

    static ArrayList<Integer> list[];
    static boolean visit[];
    static int count = 0;

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int c = input.nextInt();
        int n = input.nextInt();

        list = new ArrayList[c+1];
        visit = new boolean[c+1];

        for(int i = 1 ; i <= c; ++i){
            list[i] = new ArrayList<>();
            visit[i] = false;
        }

        for(int i = 0; i<n; ++i){
            int a = input.nextInt();
            int b = input.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);
        System.out.println(count-1);

    }

    static void dfs(int node){
        visit[node] = true;
        ++count;

        for(int item : list[node]){
            if(!visit[item]){
                dfs(item);
            }
        }

    }

}
