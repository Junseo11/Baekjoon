package baek.BaekjoonKotlin;

import java.util.Scanner;

public class b1541 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        String str = input.next();
        String [] strm = str.split("-");

        if(strm.length == 1){
            int res = 0;
            String [] strp = str.split("\\+");
            for (int j = 0 ; j < strp.length; ++j){
                res += Integer.parseInt(strp[j]);
            }

            System.out.println(res);
        }
        else{
            int res = 0;
            for(int i = 0 ; i < strm.length; ++i){
                String [] strp = strm[i].split("\\+");
                int temp = 0;
                for (int j = 0 ; j < strp.length; ++j){
                    temp += Integer.parseInt(strp[j]);
                }
                if(i==0){
                    res+=temp;
                }else{
                    res-=temp;
                }
            }
            System.out.println(res);
        }


    }
}
