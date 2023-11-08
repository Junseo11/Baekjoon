package baek.BaekjoonKotlin;

//3  111 12 21 3
//5 11111 1112 1121 1211 2111 113 131 311


import java.util.Scanner;

/*
1   1
2 11 2 2
3 111 112 121 211 3 4
4 7

 */
public class b9095 {
    public  static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[12];
        arr[1] = 1;
        arr[2] =2;
        arr[3] =4;

        for(int i = 4 ; i< arr.length; ++i){
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }

        for(int i =0; i<n; ++i){
            int a = sc.nextInt();
            System.out.println(arr[a]);
        }
    }

}
