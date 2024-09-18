package baek.BaekjoonKotlin;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b1697 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        // 입력
        int n = input.nextInt();
        int k = input.nextInt();

        int cnt = 0;
        //0~100000까지 이니까 방문 확인 배열 100000+1
        boolean visit[] = new boolean[100001];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visit[n] = true;

        // 전체 큐 순회
        while (!queue.isEmpty()){
            int size = queue.size();

            // 한 층에 대한 큐 작업을 끝내기 위해 반복
            for(int i = 0 ; i< size; ++i){
                int now = queue.poll();

                if(now == k){
                    System.out.println(cnt);
                    return;
                }

                int nowm1 = now-1;
                int nowp1 = now+1;
                int nowx2 = now*2;

                if(0<= nowm1 && nowm1 <=1000000 && !visit[nowm1]){
                    visit[nowm1] = true;
                    queue.add(nowm1);
                }
                if(0<= nowp1 && nowp1 <=1000000 && !visit[nowp1]){
                    visit[nowp1] = true;
                    queue.add(nowp1);
                }
                if(0<= nowx2 && nowx2 <=1000000 && !visit[nowx2]){
                    visit[nowx2] = true;
                    queue.add(nowx2);
                }
            }

            ++cnt;

        }

    }

}
