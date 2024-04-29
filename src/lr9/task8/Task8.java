package lr9.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        LinkedList headList = new LinkedList();
        Scanner in = new Scanner(System.in);
        headList.createHead();
        System.out.println(headList.toString());
        headList.AddFirst(15);
        System.out.println(headList.toString());
        StringBuilder sb = new StringBuilder();
        sb.append("Список: ");
        System.out.println(headList.toStringRec(headList.getHead(), sb));
        LinkedList tailList = new LinkedList();
        tailList.createTail();
        System.out.println(tailList.toString());
        tailList.AddLast(12);
        System.out.println(tailList.toString());
        headList.RemoveLast();
        System.out.println(headList.toString());
        headList.Remove(2);
        System.out.println(headList.toString());
        LinkedList recLinkedList = new LinkedList();
        System.out.println("Введите значения 10 элементов");
        recLinkedList.createHeadRec(10, in);
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Список: ");
        System.out.println(recLinkedList.toStringRec(recLinkedList.getHead(), sb1));
        recLinkedList.Insert(4, 150);
        System.out.println(recLinkedList.toString());
        in.close();
    }

}
