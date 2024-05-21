package javaapp.timus;

import java.util.Arrays;
import java.util.Scanner;

public class t1910 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    int[] newA= new int[n-2];
    for(int i=0; i<n;i++){
        a[i]=in.nextInt();
    }

    for(int i=0; i<newA.length; i++){
        newA[i]=a[i]+a[i+1]+a[i+2];
    }
    int max=Arrays.stream(newA).max().getAsInt();
    for(int i=0;i<newA.length; i++){
        if(newA[i]==max){
            System.out.println(max+" "+(i+2));
            break;
        }
    }
}
}
