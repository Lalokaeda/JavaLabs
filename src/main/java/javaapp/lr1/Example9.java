package javaapp.lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Input month name: ");
        String month = in.nextLine();
        System.out.println("Input count of days in " + month + ": ");
        int countDays = in.nextInt();
        System.out.println("In " + month + " " + countDays + " days");
        in.close();
    }
}
