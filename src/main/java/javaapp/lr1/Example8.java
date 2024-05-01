package javaapp.lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Input current day of week: ");
        String dayOfWeek = in.nextLine();
        System.out.println("Input current month name: ");
        String mName = in.nextLine();
        System.out.println("Input current number of the day in the month: ");
        int numDay = in.nextInt();
        System.out.println("Today is " + dayOfWeek + ", " + numDay + ", " + mName);
        in.close();
    }
}
