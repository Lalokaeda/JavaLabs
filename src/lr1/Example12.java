package lr1;

import java.util.Scanner;

public class Example12 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Input age: ");
        int age = in.nextInt();
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        int year = currentDateTime.getYear() - age;
        System.out.println("Year of birth is: " + year);
        in.close();
    }
}
