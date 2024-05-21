package javaapp.timus;

import java.util.Scanner;

public class t1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countPanels = in.nextInt();
        int height = in.nextInt();
        int width = in.nextInt();
        int coloredS = height * width * 2 * countPanels;
        System.out.println(coloredS);
        in.close();
    }
}
