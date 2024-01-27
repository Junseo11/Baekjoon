package baek.BaekjoonKotlin;

import java.util.Scanner;

/*

1 -       1
2 - 11 2 -2
3 - 111 12 21 3 - 4
4 - 7
5 - 11111 1112 1121 1211 2111 113 131 311 14 41 23 32 221- 13
 */

public class std {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int arr[] = new int[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int j = 4; j<arr.length; ++j){
            arr[j] = arr[j-1] + arr[j-2] +arr[j-3];
        }

        for(int i = 0; i<n; ++i){
            int a = input.nextInt();
            System.out.println(arr[a]);
        }
    }

}
