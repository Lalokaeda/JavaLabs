package javaapp.timus;

import java.util.Scanner;

public class t1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstLock = in.nextLine();
        String secondLock = in.nextLine();
        if (Integer.parseInt(firstLock.substring(firstLock.length() - 1)) % 2 == 0
                || Integer.parseInt(secondLock.substring(secondLock.length() - 1)) % 2 > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        in.close();
    }
}
