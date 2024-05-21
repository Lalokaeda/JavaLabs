package javaapp.timus.sem2;

import java.util.Scanner;

public class t1209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        for (long i = 0; i < N; i++) {
            long x = scanner.nextLong()-1;

            long y = (long) Math.sqrt(8*x+1);

            if (y*y == (8*x+1)){
                System.out.print(1 + " ");
            }
            else 
            System.out.print(0 + " ");
        }
    }
}
