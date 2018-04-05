package huawei.developer;

import java.util.Scanner;

/**
 * 汽水瓶
 * @author Yue
 * @since 2018/1/31
 */
public class SodaBottle {

//    private static int drinkNum(int num) {
//        int sum = 0;
//        while (num > 2) {
//             sum += num / 3;
//             num = num / 3 + num % 3;
//        }
//        return num == 2 ? sum + 1 : sum;
//    }

    private static int drinkNum(int num) {
        int sum = 0;
        while (num > 2) {
            sum += num / 3;
            num = num % 3 + num / 3;
        }
        return num == 2 ? sum + 1 : sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
            System.out.println(drinkNum(sc.nextInt()));
    }
}
