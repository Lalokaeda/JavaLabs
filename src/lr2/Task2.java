package lr2;

import java.util.Scanner;

public class Task2 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        if (num % 5==2 && num % 7 ==1)
            System.out.println("Число удовлетворяет условиям");
        else
            System.out.println("Число не удовлетворяет условиям");
        in.close();
    }
}
