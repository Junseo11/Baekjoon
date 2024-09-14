package baek.BaekjoonKotlin;

import java.util.*;

public class b16953 {
    public static void main(String []args){
        // 입력
        Scanner input = new Scanner(System.in);
        long a = input.nextInt();
        long b = input.nextInt();

        // 큐 초기화
        Queue<Long> queue = new LinkedList<>();
        queue.add(a*2);
        queue.add(a*10+1);

        int count = 0;

        while (!queue.isEmpty()){
            ++count;
            int size = queue.size();

            for(int i = 0; i < size; ++i){
                long now = queue.poll();

                if(now == b){
                    System.out.println(count+1);
                    return;
                }
                if(now*2 <= b){
                    queue.add(now*2);
                }
                if(now*10+1 <=b){
                    queue.add(now*10+1);
                }
            }
        }
        System.out.println(-1);
    }

}
