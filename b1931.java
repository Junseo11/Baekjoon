package baek.BaekjoonKotlin;

import java.util.*;

public class b1931 {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int [][] time = new int[n][2];

        for(int i=0;i<n; ++i){
            time[i][0] = input.nextInt();
            time[i][1] = input.nextInt();
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });

        int cnt = 0;
        int lastTime = -1;
        for(int i = 0 ; i < n; ++i){
            if(time[i][0]>=lastTime){
                lastTime = time[i][1];
                ++cnt;
            }
        }

        System.out.println(cnt);
    }
}
