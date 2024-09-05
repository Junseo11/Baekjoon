package baek.BaekjoonKotlin;

import java.util.*;

public class b11000 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();

        List<Integer> endTimes = new ArrayList<>();

        int n = input.nextInt();

        for(int i = 0 ; i < n; ++i){
            int s = input.nextInt();
            int t = input.nextInt();
            map.put(s,t);
        }
        // 먼저 초기화 해서 오류발생
        List<Integer> keyset = new ArrayList<>(map.keySet());

        Collections.sort(keyset);
        endTimes.add(map.get(keyset.get(0)));

        for(int i = 1 ; i < n; ++i){
            for(int j = 0; j<endTimes.size(); ++j){
                if(map.get(i)<=endTimes.get(j)){
                    endTimes.set(j,map.get(keyset.get(i)));
                    break;
                }else{
                    if(!endTimes.contains(map.get(keyset.get(i)))){
                        endTimes.add(map.get(keyset.get(i)));
                    }
                }
            }
        }

        System.out.println(endTimes.size());






    }
}


// 정답코드

//import java.util.*;
//
//public class b11000 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        int[][] lectures = new int[n][2];
//
//        for (int i = 0; i < n; ++i) {
//            lectures[i][0] = input.nextInt(); // 시작 시간
//            lectures[i][1] = input.nextInt(); // 종료 시간
//        }
//
//        // 시작 시간 기준으로 정렬
//        Arrays.sort(lectures, Comparator.comparingInt(a -> a[0]));
//
//        List<Integer> endTimes = new ArrayList<>();
//        endTimes.add(lectures[0][1]);
//
//        for (int i = 1; i < n; ++i) {
//            boolean assigned = false;
//            for (int j = 0; j < endTimes.size(); ++j) {
//                if (lectures[i][0] >= endTimes.get(j)) {
//                    // 기존 강의실에 배정 가능, 종료 시간 갱신
//                    endTimes.set(j, lectures[i][1]);
//                    assigned = true;
//                    break;
//                }
//            }
//            if (!assigned) {
//                // 새 강의실 필요
//                endTimes.add(lectures[i][1]);
//            }
//        }
//
//        System.out.println(endTimes.size());
//    }
//}
