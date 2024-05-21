package javaapp.timus.sem2;

import java.util.Scanner;

public class t1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j >=0; j--) {
                System.out.print(ar[j][i-j]+" ");
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = n-1; j >=i; j--) {
                System.out.print(ar[j][n-j+i-1]+" ");
            }
        }
    }
}
