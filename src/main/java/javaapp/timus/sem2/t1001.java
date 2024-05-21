package javaapp.timus.sem2;

import java.util.Scanner;
import java.util.Stack;


public class t1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Long> numbers = new Stack<>();

        while (scanner.hasNext()) {
            if (scanner.hasNextLong()) {
                numbers.push(scanner.nextLong());
            } else {
                scanner.next();
            }
        }

        while (!numbers.isEmpty()) {
            long num = numbers.pop();
            double squareRoot = Math.sqrt(num);
            System.out.printf("%.4f%n", squareRoot);
        }
    }
}
