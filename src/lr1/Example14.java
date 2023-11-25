package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Input number:");
        int num = in.nextInt();
        in.close();
        int num1 = num-1;
        int num2 = num+1;
        int num3=(int)Math.pow((num1+num+num2), 2);
        System.out.println(num1 + ", " + num + ", " + num2 + ", " + num3);
    }
}
