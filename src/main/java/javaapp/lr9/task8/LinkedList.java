package javaapp.lr9.task8;

import java.util.Scanner;


public class LinkedList implements ILinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    LinkedList() {
        this.head = null;
    }

    @Override
    public void createHead() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();

        System.out.println("Введите значение элемента: ");

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head=newNode;
            } else {
                newNode.setNext(head);
                head=newNode; 
            }
        }
    }

    @Override
    public void createTail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();

        System.out.println("Введите значения элементов: ");

        Node tail = null;

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.setNext(newNode);
                tail = newNode;
            }
        }
    }

    @Override
    public void AddFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head=newNode; 
    }

    @Override
    public void AddLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head =newNode;
            return;
        }
        Node ref = head;
        while (ref.getNext() != null) {
            ref = ref.getNext();
        }
        ref.setNext(newNode);
    }

    @Override
    public void Insert(int index, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head =newNode;
            return;
        }
        Node ref = head;
        for (int i = 0; i < index-1; i++) {
            ref = ref.getNext();
        }
        newNode.setNext(ref.getNext());
        ref.setNext(newNode);

    }

    @Override
    public void RemoveFirst() {
        if (head == null) {
            System.out.println("Лист пуст!");
            return;
        }
        head = head.getNext();

    }

    @Override
    public void RemoveLast() {
        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }
        if (head.getNext() == null) {
            head = null;
            return;
        }
        Node ref = head;
        while (ref.getNext().getNext() != null) {
            ref = ref.getNext();
        }
        ref.setNext(null);

    }

    @Override
    public void Remove(int index) {

        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }
        if (head.getNext() == null) {
            head = null;
            return;
        }
        Node ref = head;

        for (int i =0; i<index-1;i++) {
            ref = ref.getNext();
        }
        ref.setNext(ref.getNext().getNext());

    }

    @Override
    public void createHeadRec(int n, Scanner scanner) {
        if (n <= 0) {
            return;
        }
        int value = scanner.nextInt();
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        createHeadRec(n - 1, scanner);

    }

    @Override
    public void createTailRec(Node tail, int n, Scanner scanner) {
        if (n <= 0) {
            return;
        }
        int value = scanner.nextInt();
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode); 
        }
        createTailRec(newNode, n - 1, scanner);

    }


    @Override      
    public String toStringRec(Node head, StringBuilder sb) {
        
        if (head != null) {
            sb.append(head.getValue() + " ");
            return toStringRec(head.getNext(), sb);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        sb.append("Список: ");
        while (current != null) {
            sb.append(current.getValue() + " ");
            current = current.getNext();
        }
        return sb.toString();
    }

}
