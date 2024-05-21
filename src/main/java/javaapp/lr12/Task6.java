package javaapp.lr12;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Task6 {
public static int sum(int[] array) {
        int cores = Runtime.getRuntime().availableProcessors();
        AtomicInteger sum = new AtomicInteger(0);

        Thread[] threads = new Thread[cores];
        int chunkSize = array.length / cores;
        for (int i = 0; i < cores; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == cores - 1) ? array.length : (i + 1) * chunkSize;
            threads[i] = new SummingThread(array, startIndex, endIndex, sum);
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return sum.get();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sum(array);
        System.out.println("Сумма элементов в массиве: " + sum);
    }

    static class SummingThread extends Thread {
        private final int[] array;
        private final int startIndex;
        private final int endIndex;
        private final AtomicInteger sum;

        public SummingThread(int[] array, int startIndex, int endIndex, AtomicInteger sum) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.sum = sum;
        }

        @Override
        public void run() {
            int localSum = IntStream.range(startIndex, endIndex).map(i -> array[i]).sum();
            sum.addAndGet(localSum);
        }
    }
}
