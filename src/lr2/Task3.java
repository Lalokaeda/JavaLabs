package lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Input number");
        int num = in.nextInt();
        if (num % 4 == 0 && num >=10)
            System.out.println("Число удовлетворяет критериям");
        else
            System.out.println("Число не удовлетворяет критериям");
        in.close();
    }
}
