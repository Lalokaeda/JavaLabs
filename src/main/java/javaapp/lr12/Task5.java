package javaapp.lr12;

public class Task5 {
    public static int findMax(int[] array) {
        int cores = Runtime.getRuntime().availableProcessors();
        int chunkSize = array.length / cores;

        MaxFinderThread[] threads = new MaxFinderThread[cores];
        for (int i = 0; i < cores; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i == cores - 1) ? array.length : (i + 1) * chunkSize;
            threads[i] = new MaxFinderThread(array, startIndex, endIndex);
            threads[i].start();
        }

        int max = Integer.MIN_VALUE;
        try {
            for (MaxFinderThread thread : threads) {
                thread.join();
                int threadMax = thread.getMax();
                if (threadMax > max) {
                    max = threadMax;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 9, 2, 7, 6, 4};
        int max = findMax(array);
        System.out.println("Максимальный элемент в массиве: " + max);
    }

    static class MaxFinderThread extends Thread {
        private final int[] array;
        private final int startIndex;
        private final int endIndex;
        private int max = Integer.MIN_VALUE;

        public MaxFinderThread(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public int getMax() {
            return max;
        }

        @Override
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
    }
}
