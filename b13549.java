package baek.BaekjoonKotlin;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b13549 {

    static int[] times = new int[100001];

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int b = input.nextInt();

        bfs(n);

        System.out.println(times[b]-1);
    }

    static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        times[n] = 1;  // 방문함으로 구분하기 위해 +1 이후 출력시에는 -1

        while (!queue.isEmpty()){
            int now = queue.poll();
            int nowm1 = now-1;
            int nowp1 = now+1;
            int nowx2 = now*2;

            // 다음 노드가 첫 방문이거나 현재 노드보다 +1인 위치에 있다면 큐에 입력 (노드 재방문 허용)
            if(0<= nowx2 && nowx2 <=100000 && (times[nowx2]==0 || times[nowx2] == times[now]+1)){
                queue.add(nowx2);
                times[nowx2] = times[now];
            }
            if(0<= nowm1 && nowm1 <=100000 && (times[nowm1]==0 || times[nowm1] == times[now]+1)){
                queue.add(nowm1);
                times[nowm1] = times[now]+1;
            }
            if(0<= nowp1 && nowp1 <=100000 && (times[nowp1]==0 || times[nowp1] == times[now]+1)){
                queue.add(nowp1);
                times[nowp1] = times[now]+1;
            }
        }
    }


}
