package javaapp.timus.sem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t1880 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    List<Integer> nums = new ArrayList<Integer>();
    int n = in.nextInt();
    for (int i=0; i<n;i++){
        nums.add(in.nextInt());
    }

    List<Integer> nums1 = new ArrayList<Integer>();
    n = in.nextInt();
    for (int i=0; i<n;i++){
        int j = in.nextInt();
        if(nums.contains(j))
        nums1.add(j);
    }
    int count=0;
    n = in.nextInt();
    for (int i=0; i<n;i++){
        if(nums1.contains(in.nextInt()))
        count++;
    }
    System.out.println(count);
}
}
