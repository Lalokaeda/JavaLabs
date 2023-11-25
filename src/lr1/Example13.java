package lr1;

import java.util.Scanner;
public class Example13 {
 public static void main(String[] args) {
        Scanner in = new Scanner (System.in, "Cp866");
        System.out.println("Input 2 numbers:");
        float num1=in.nextFloat();
        float num2=in.nextFloat();
        System.out.println(num1+" + "+num2 +" = "+ (num1+num2));
        in.close();
    }
}
