package javaapp.lr6;

public class Task8 {
    public static double getAvg(int[] array) {
        double avg=0;
        for (int i : array) {
            avg+=i;
        }
        avg/=array.length;
        return avg;
    }
}
