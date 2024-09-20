package baek.BaekjoonKotlin;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b12851 {

    static int count = 0;
    static int time = Integer.MAX_VALUE;
    static int times[] = new int[100001];

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int b = input.nextInt();

        if(n>b){
            System.out.println(n-b);
            System.out.println(1);
            return;
        }

        bfs(n,b);

        System.out.println(time);
        System.out.println(count);

    }

    static void bfs(int n, int b) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        while (!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0 ; i< size; ++i){
                int now = queue.poll();

                // 현재 노드의 시간이 최소 시간보다 크다면 종료
                if(times[now]>time){
                    return;
                }

                // 현재 시간이 결과와 같다면 최소 시간을 현재 시간으로 업데이트
                // COUNT 증가
                if(now == b){
                    time = times[now];
                    ++count;
                }

                int nowm1 = now-1;
                int nowp1 = now+1;
                int nowx2 = now*2;

                // 동일 레벨에서 같은 노드가 있더라도 현재 최소 시간에서 한단계 다음에 있는 값이라면 큐에 추가
                if(0<=nowm1&& nowm1<=100000 && (times[nowm1] == 0 || times[nowm1] == times[now]+1)){
                    queue.add(nowm1);
                    times[nowm1] = times[now]+1;
                }
                if(0<=nowp1&& nowp1<=100000 && (times[nowp1] == 0 || times[nowp1] == times[now]+1)){
                    queue.add(nowp1);
                    times[nowp1] = times[now]+1;
                }
                if(0<=nowx2&& nowx2<=100000 && (times[nowx2] == 0 || times[nowx2] == times[now]+1)){
                    queue.add(nowx2);
                    times[nowx2] = times[now]+1;
                }
            }
        }

    }
}
