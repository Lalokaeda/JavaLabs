package javaapp.lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Input lastname: ");
        String lastname = in.nextLine();
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input patronymic: ");
        String patronymic = in.nextLine();
        System.out.println("Hello, " + lastname + " " + name + " " + patronymic);
        in.close();
    }
}
