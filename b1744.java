package baek.BaekjoonKotlin;

import java.util.*;

public class b1744 {
    public static void main(String []args){
        //리스트를 역순으로 정렬
        //차례대로 곱해서 더한다
        //정수인경우 그대로 곱하기
        //0 이하인경우 음수가 짝수인경우: 음수 두개를 곱한다, 홀수인경우 곱하지 않는다 이때 0이 있다면 0과 곱한다
        // 0인경우 더하지 않는다

        Scanner input = new Scanner(System.in);
        List<Integer> plusArray = new ArrayList<>();
        List<Integer> minusArray = new ArrayList<>();
        int n = input.nextInt();
        int arr [] = new int[n];

        for (int i = 0; i<n;++i){
            arr[i] = input.nextInt();
        }

        for(int item : arr){
            if(item>0){
                plusArray.add(item);
            }else{
                minusArray.add(item);
            }
        }

        Collections.sort(plusArray,Collections.reverseOrder());
        Collections.sort(minusArray);

        Long result = 0L;

        for(int i = 0 ; i< plusArray.size(); ++i){
            if(i+1 < plusArray.size()){
                if(plusArray.get(i)==1 || plusArray.get(i+1)==1){
                    result+= plusArray.get(i)+plusArray.get(i+1);
                    ++i;
                }else{
                    result+= plusArray.get(i)*plusArray.get(i+1);
                    ++i;
                }

            }else{
                result += plusArray.get(i);
            }
        }

        for(int i = 0 ; i< minusArray.size(); ++i){
            if(i+1 < minusArray.size()){
                result+= minusArray.get(i)*minusArray.get(i+1);
                ++i;
            }else{
                result += minusArray.get(i);
            }
        }



        System.out.println(result);
    }
}
