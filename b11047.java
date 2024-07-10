package baek.BaekjoonKotlin;

import java.util.*;

public class b11047 {
    public static void main(String []args){
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; ++i){
            int coin = input.nextInt();
            list.add(coin);
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0; i<list.size(); ++i){
            if(list.get(i)>k){
                continue;
            }else if (list.get(i)==k){
                ++cnt;
                break;
            }
            else{
                while (k>=list.get(i)){
                    k-=list.get(i);
                    ++cnt;
                }
            }
        }
        System.out.println(cnt);
    }

    // 리스트 만들어서 넣기
    // 전체 순회하면서 인덱스 요소가 k보다 작을때 가능 +1
    // 만약에 작으면 한번 더 할수 있는지
}
