package javaapp.timus.sem2;

import java.util.Scanner;

public class t1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
        } else {
            for (int i = N; i <= 1; i++) {
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
}