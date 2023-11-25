package lr1;

import java.util.Scanner;

public class Example15 {
     public static void main(String[] args) {
        Scanner in = new Scanner (System.in, "Cp866");
        System.out.println("Input 2 numbers using Enter:");
        float num1=in.nextFloat();
        float num2=in.nextFloat();
        System.out.println("Sum = "+ (num1+num2));
        System.out.println("Difference = "+ (num1-num2));
        in.close();
    }
    
}
