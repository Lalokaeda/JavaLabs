package javaapp.lr9.task7;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество человек: ");
        int n = in.nextInt();
        LinkedList people = new LinkedList<>();

        for (int i=1; i<=n;i++){
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            System.out.println(people.toString());
            index = (index + 1) % people.size();
            people.remove(index);
        }

        System.out.println("Оставшийся человек: " + people.get(0));
        in.close();
    }

}
