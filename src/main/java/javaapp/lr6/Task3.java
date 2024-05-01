package javaapp.lr6;

public class Task3 {

    public static int getMaxValue(int ... array) {
        int max=array[0];
        for (int i : array) {
            if(i>max)
                max=i;
        }
        return max;
    }

    public static int getMinValue(int ... array) {
        int min=array[0];
        for (int i : array) {
            if(i<min)
                min=i;
        }
        return min;
    }

    public static double getAvgValue(int ... array) {
        int avg=0;
        for (int i : array) {
            avg+=i;
        }
        return avg/=array.length;
    }
}
