package huawei.developer;

import java.util.Scanner;

/**
 * @author Yue Lin
 * @since 2018-04-02
 */
public class DeleteNum {

    public static int lastDelete(int num, int k) {
        int last = 0;
        if (num > 1000) num = 999;
        for (int i = 2; i <= num; i++)
            last = (last + k) % i;
        return last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(lastDelete(num, 2));
    }
}
