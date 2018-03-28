package toutiao.toutiaoE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-03-24
 */
public class Main {

    public static int getMinTimes(Map<Integer, Integer> setN, Map<Integer, Integer> setM, int n, int m, int meanN, int meanM) {
        int c =0 ;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j++) {
                int t = setN.get(i);
                int meanNt = (meanN - t) / (n - 1);
                int meanMt = (meanM + t) / (n + 1);
                if (meanNt > meanN && meanMt > meanM) c++;
            }
        }
//        for (int i = 0; i < n; i ++) {
//            for (int j = 0; j < m; j++) {
//                int t = setN.get(i);
//                int meanNt = (meanN - t) / (n - 1);
//                int meanMt = (meanM + t) / (n + 1);
//                if (meanNt > meanN && meanMt > meanM) c++;
//            }
//        }
        return c;
    }

//    private static int getMinTimesHelper(Set setN, Set setM, int meanN, int meanM, int meanNT, int meaMT) {
//        if ()
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> setN = new HashMap<>();
        Map<Integer, Integer> setM = new HashMap<>();
        int sumN = 0, sumM = 0, temp = 0;
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            sumN += temp;
            setN.put(i, temp);
        }
        for (int j = 0; j < m; j++) {
            temp = sc.nextInt();
            sumM += temp;
            setM.put(j, temp);
        }
        System.out.println(getMinTimes(setN, setM, n, m,sumN/n, sumM/m));
    }
}
