package timus;

import java.util.Scanner;

public class t2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int taskCount = in.nextInt();
        int timeToSolution = 4 * 60;
        String answer = ((12 - taskCount) * 45) <= timeToSolution ? "YES" : "NO";
        System.out.println(answer);
        in.close();
    }
}
