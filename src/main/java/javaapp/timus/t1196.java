package javaapp.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class t1196 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        // Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.readLine());
        TreeSet<String> dates = new TreeSet<String>();
        for (int i = 0; i < n; i++) {
            dates.add(in.readLine());
        }
        int m = Integer.parseInt(in.readLine());
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (dates.contains(in.readLine()))
                count += 1;
        }
        System.out.println(count);
        in.close();
    }
}
