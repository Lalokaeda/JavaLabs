package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input your year of birth: ");
        int year = in.nextInt();
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        int age = currentDateTime.getYear() - year;
        System.out.println("Your name is "+ name + "and your age is: " + age);
        in.close();
    }
}
