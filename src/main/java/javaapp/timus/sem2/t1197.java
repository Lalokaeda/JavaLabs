package javaapp.timus.sem2;

import java.util.Scanner;

public class t1197 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем количество тестов
        int N = scanner.nextInt();
        scanner.nextLine(); // Считываем перевод строки

        // Перебираем все тесты
        for (int i = 0; i < N; i++) {
            String position = scanner.nextLine();
            int result = countAttackedCells(position);
            System.out.println(result);
        }
    }

    // Метод для подсчета количества клеток, под боем коня
    private static int countAttackedCells(String position) {
        int x = position.charAt(0) - 'a' + 1; // Получаем координату по горизонтали
        int y = position.charAt(1) - '0'; // Получаем координату по вертикали

        int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8) {
                count++;
            }
        }

        return count;
    }
}
