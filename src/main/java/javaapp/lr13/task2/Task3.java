package javaapp.lr13.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Введите размер массива");
        try {
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное число");
            main(args);
        }
        byte[] arr = new byte[n];
        System.out.println("Введите элементы массива");
        byte sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = in.nextByte();
                if (sum + arr[i] > 127)
                    throw new Exception("Сумма выходит за пределы диапазона Byte");
                sum += arr[i];
            } catch (InputMismatchException e) {
                System.out.println(
                        "Введенное значение выходит за пределы диапазона Byte, введите значение от -128 до 127");
                i--;
                continue;
            } catch (Exception e) {
                System.out.println(e);
                main(args);
                i--;
                continue;
            }
        }
        System.out.println(sum);

    }

}
