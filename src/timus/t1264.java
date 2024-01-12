package timus;

import java.util.Scanner;

public class t1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        for (int i = 0; i <= m; i++) {
            count += n;
        }
        System.out.println(count);
        in.close();
    }

}
