package baek.BaekjoonKotlin;

import java.util.Scanner;

public class b5585 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {500,100,50,10,5,1};

        int coin = 1000-sc.nextInt();
        int res = 0;
        while (coin>0){
            for(int i =0;i<arr.length;){
                if(coin-arr[i]>=0){
                    ++res;
                    coin-=arr[i];

                }else{
                    ++i;
                }
            }
        }


        System.out.println(res);
    }
}
