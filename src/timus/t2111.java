package timus;

import java.util.Scanner;

public class t2111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int citiesCount = in.nextInt();
        Long[] weigths = new Long[citiesCount];

        for(int i=0; i<citiesCount; i++){
            weigths[i]=in.nextLong();
        }

        long initialWeight=0;
        for (Long i : weigths) {
            initialWeight+=i;
        }

        //Если юзать Math.pow, то стопится на 57 тесте
        long tax=initialWeight * initialWeight;
        System.out.println(tax);
        in.close();
    }
}
