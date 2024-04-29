package lr9.task9;

import java.util.*;

public class TimeComparison {
    static int n = 15000000;
    static long nIndex = 50000000L;
    public static void main(String[] args) {


        List<Long> arrayList = new ArrayList<>();
        Deque<Long> arrayDeque = new ArrayDeque<>();
        TreeSet<Long> treeSet = new TreeSet<>();

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTime(arrayDeque));
        System.out.println("Время выполнения операции добавления treeSet = " + getRunningTime(treeSet));
        System.out.println("Время выполнения операции добавления элемента в начало коллекции arrayList = " + getAddFirstTime(arrayList));
        System.out.println("Время выполнения операции добавления элемента в начало коллекции arrayDeque = " + getAddFirstTime(arrayDeque));
        System.out.println("Время выполнения операции добавления элемента в конец коллекции arrayList = " + getAddLastTime(arrayList));
        System.out.println("Время выполнения операции добавления элемента в конец коллекции arrayDeque = " + getAddLastTime(arrayDeque));
        System.out.println("В TreeSet невозможно добавить элемент на определенную позицию,  так как элементы хранятся в порядке их сортировки ");
        System.out.println("Время выполнения операции удаления элемента из начала коллекции arrayList = " + getRemoveFirstTime(arrayList));
        System.out.println("Время выполнения операции удаления элемента из начала коллекции arrayDeque = " + getRemoveFirstTime(arrayDeque));
        System.out.println("Время выполнения операции удаления элемента из начала коллекции TreeSet = " + getRemoveFirstTime(treeSet));
        System.out.println("Время выполнения операции удаления элемента с конца коллекции arrayList = " + getRemoveLastTime(arrayList));
        System.out.println("Время выполнения операции удаления элемента с конца коллекции arrayDeque = " + getRemoveLastTime(arrayDeque));
        System.out.println("Время выполнения операции удаления элемента с конца коллекции TreeSet = " + getRemoveLastTime(treeSet));
        System.out.println("Время выполнения операции удаления элемента из середины коллекции arrayList = " + getRemoveTime(arrayList));
        System.out.println("Время выполнения операции удаления элемента из середины коллекции arrayDeque = " + getRemoveTime(arrayDeque));
        System.out.println("Время выполнения операции удаления элемента из середины коллекции TreeSet = " + getRemoveTime(treeSet));
        System.out.println("Время выполнения операции получения элемента по индексу коллекции arrayList = " + getGetElementTime(arrayList));
        System.out.println("Время выполнения операции получения элемента по индексу коллекции arrayDeque = " + getGetElementTime(arrayDeque));
        System.out.println("Время выполнения операции получения элемента по индексу коллекции TreeSet = " + getGetElementTime(treeSet));

    }

    private static long getRunningTime(List<Long> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        for (long i = 0; i < n; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime(Deque<Long> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

       
        for (long i = 0; i < n; i++) {
            deque.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime(Set<Long> set){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();


        for (long i = 0; i < n; i++) {
            set.add(i);
        }

        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getAddFirstTime(List<Long> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();


            list.add(0,-1L);
        

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getAddLastTime(Deque<Long> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();


            deque.addLast(deque.size()+1L);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRemoveLastTime(List<Long> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

            list.remove(list.size()-1);
        

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRemoveFirstTime(Deque<Long> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();


            deque.removeFirst();

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRemoveFirstTime(List<Long> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();


            list.remove(0);
        

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRemoveLastTime(Deque<Long> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

            deque.removeLast();

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getAddLastTime(List<Long> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

            list.add(list.size(),list.size()+1L);
        

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getAddFirstTime(Deque<Long> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

            deque.addFirst(-1L);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRemoveFirstTime(TreeSet<Long> set){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();


            set.pollFirst();
        

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRemoveLastTime(TreeSet<Long> set){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

            set.pollLast();


        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRemoveTime(TreeSet<Long> set){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

            set.remove(11000L);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
     
    private static long getRemoveTime(Deque<Long> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();


            deque.remove(11000L);

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRemoveTime(List<Long> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

            list.remove(11000L);
        

        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

     
    private static long getGetElementTime(Deque<Long> deque){

       deque.clear();
       for (long i=0; i<nIndex; i++){
        deque.add(i);
       }
        
        long start = System.currentTimeMillis();

         Iterator<Long> iterator = deque.iterator();
            int currentIndex = 0;
        while (iterator.hasNext()) {
            Long element = iterator.next();
            if (currentIndex == 11000L) {
                return element;
            }
            currentIndex++;
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getGetElementTime(List<Long> list){
        
       list.clear();
       for (long i=0; i<nIndex; i++){
        list.add(i);
       }
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

            list.get( 11000);
        

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getGetElementTime(TreeSet<Long> set){
        set.clear();
       for (long i=0; i<nIndex; i++){
        set.add(i);
       }

        long start = System.currentTimeMillis();

            set.subSet(10999L, 11001L).first();

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

}

