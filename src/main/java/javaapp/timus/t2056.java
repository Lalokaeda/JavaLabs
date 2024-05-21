package javaapp.timus;

import java.util.ArrayList;
import java.util.Scanner;

public class t2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countExams = in.nextInt();
        ArrayList<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < countExams; i++) {
            marks.add(in.nextInt());
        }
        if (marks.contains(3)) {
            System.out.println("None");
            return;
        }
        if (!marks.contains(3) && !marks.contains(4)) {
            System.out.println("Named");
            return;
        }

        double average = 0;
        for (int i : marks) {
            average += i;
        }
        if (average / countExams >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
        in.close();
    }
}
