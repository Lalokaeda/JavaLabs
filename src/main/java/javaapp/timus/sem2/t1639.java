package javaapp.timus.sem2;

import java.util.Scanner;

public class t1639 {
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    if(n*m%2==0){
        System.out.println("[:=[first]");
    }
    else{
        System.out.println("[second]=:]");
    }
}
}
