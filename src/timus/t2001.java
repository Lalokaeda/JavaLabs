package timus;

import java.util.Scanner;

public class t2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        System.out.println((a[0] - a[2]) + " " + (b[0] - b[1]));
        in.close();
    }
}
