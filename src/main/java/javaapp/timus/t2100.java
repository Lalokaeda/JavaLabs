package javaapp.timus;

import java.util.Scanner;

public class t2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int numPairs = 0;
        for (int i = 0; i < n; i++) {
            if (in.nextLine().contains("+one")) {
                numPairs++;
            }
        }
        in.close();
        ;
        int sum = numPairs + n + 2 == 13 ? (numPairs + n + 3) * 100 : (numPairs + n + 2) * 100;
        System.out.println(sum);
    }
}
