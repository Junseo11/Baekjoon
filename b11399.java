package baek.BaekjoonKotlin;

import java.util.*;

public class b11399 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i<n;++i){
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        int items [] = new int[n];

        int res = 0;
        for(int i = 0; i<n; ++i){
            res +=arr[i];
            items[i] = res;
        }

        int sum = 0;
        for(int item : items){
            sum+=item;
        }

        System.out.println(sum);

    }
}
