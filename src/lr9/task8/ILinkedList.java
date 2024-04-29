package lr9.task8;

import java.util.Scanner;

public interface ILinkedList {
    public void createHead();
    public void createTail();
    public String toString();
    public void AddFirst(int value);
    public void AddLast(int value);
    public void Insert(int index, int value);
    public void RemoveFirst();
    public void RemoveLast();
    public void Remove(int index);
    public void createHeadRec(int n, Scanner scanner);
    public void createTailRec(Node tail, int n, Scanner scanner);
    public String toStringRec(Node head, StringBuilder sb);
}
