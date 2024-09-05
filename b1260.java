package baek.BaekjoonKotlin;

import java.util.*;

public class b1260 {
    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer> abj [];
    static Queue<Integer> queue = new LinkedList<>();
    static boolean [] dfsvisit;
    static boolean [] bfsvisit;

    public static void dfs(int v){
        dfsvisit[v] = true;
        sb.append(v+" ");

        // 재귀 노드를 따라 깊게 내려간다
        for(int item : abj[v]){
            if(!dfsvisit[item]){
                dfs(item);
            }
        }
    }

    // 방문 표시, 출력, 큐에 입력한다
    public static void bfs(int v){
        sb.append("\n");
        queue.add(v);

        bfsvisit[v] = true;


        while (!queue.isEmpty()){
            int item = queue.poll();
            sb.append(item+" ");


            for(int itm : abj[item]){
                if(!bfsvisit[itm]){
                    queue.add(itm);
                    bfsvisit[itm] = true;
                }
            }
        }
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int v = input.nextInt();

        abj = new ArrayList[n+1];
        dfsvisit = new boolean[n+1];
        bfsvisit = new boolean[n+1];

        // 노드 초기화
        for(int i = 1 ; i <= n; ++i){
            abj[i] = new ArrayList<>();
            dfsvisit[i] = false;
            bfsvisit[i] = false;
        }

        // 노드에 data 입력
        for(int i = 0 ; i < m; ++i){
            int a = input.nextInt();
            int b = input.nextInt();

            // 두 노드를 양방향으로 이어줘야 한다
            abj[a].add(b);
            abj[b].add(a);
        }

        for(int i = 1 ; i < abj.length; ++i){
            Collections.sort(abj[i]);
        }



        dfs(v);
        bfs(v);

        System.out.println(sb.toString().trim());


    }
}