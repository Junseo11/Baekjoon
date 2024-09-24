package baek.BaekjoonKotlin;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b14226 {

    static int s, count;
    static boolean [][] visit = new boolean[1001][1001];

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        s = input.nextInt();
        bfs();

        System.out.println(count);


    }

    private static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(1,0));


        while (!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i< size; ++i){
                Node now = queue.poll();

                if(now.screen == s){
                    return;
                }

                if(now.screen!=now.clip &&!visit[now.screen][now.clip]){
                    queue.add(new Node(now.screen, now.screen));
                }
                if(0<now.clip && now.screen+now.clip<=1000 &&!visit[now.screen][now.clip]){
                    queue.add(new Node(now.screen+ now.clip, now.clip));
                }
                if(1<now.screen &&!visit[now.screen-1][now.clip]){
                    queue.add(new Node(now.screen-1, now.clip));
                }
                visit[now.screen][now.clip] = true;
            }
            ++count;
        }
    }

}

 class Node{
    int screen;
    int clip;

     Node(int screen, int clip){
        this.screen = screen;
        this.clip = clip;
    }
}

