package timus;

import java.util.Scanner;

public class t1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gary = in.nextInt();
        int lary = in.nextInt();
        int sum = gary + lary - 1;
        System.out.println((sum - gary) + " " + (sum - lary));
        in.close();
    }
}
