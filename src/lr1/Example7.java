package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input age: ");
        int age = in.nextInt();
        System.out.println("Your name is " + name + "And your age is " + age);
        in.close();
    }
}
