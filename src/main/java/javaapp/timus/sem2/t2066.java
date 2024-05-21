package javaapp.timus.sem2;

import java.util.Scanner;

public class t2066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int minValue = Integer.MAX_VALUE;

        char[] ops = {'+', '-', '*'};
        for (char op1 : ops) {
            for (char op2 : ops) {
                int result;
                if (op1 == '+') {
                    if (op2 == '+') {
                        result = a + b + c;
                    } else if (op2 == '-') {
                        result = a + b - c;
                    } else {
                        result = a + b * c;
                    }
                } else if (op1 == '-') {
                    if (op2 == '+') {
                        result = a - b + c;
                    } else if (op2 == '-') {
                        result = a - b - c;
                    } else {
                        result = a - b * c;
                    }
                } else {
                    if (op2 == '+') {
                        result = a * b + c;
                    } else if (op2 == '-') {
                        result = a * b - c;
                    } else {
                        result = a * b * c;
                    }
                }
                minValue = Math.min(minValue, result);
            }
        }

        System.out.println(minValue);
    }
}
