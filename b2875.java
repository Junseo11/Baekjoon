package baek.BaekjoonKotlin;

import java.util.Scanner;

public class b2875 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        int result = 0;
        while (true){
            if(n>=2 && m>=1){
                n-=2;
                m-=1;
                ++result;

                if(n+m<k){
                    --result;
                    break;
                }
            }else{
                break;
            }
        }

        System.out.println(result);
    }
}
