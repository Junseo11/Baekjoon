package baek.BaekjoonKotlin;

import java.util.Scanner;

public class b14916 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int res = 0;

        while (n!=0){
            if(n%5==0){
                n-=5;
            } else if (n==1) {
                System.out.println(-1);
                return;
            } else{
                n-=2;
            }
            ++res;
        }

        System.out.println(res);
    }
}
