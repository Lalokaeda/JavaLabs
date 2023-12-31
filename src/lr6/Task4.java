package lr6;

public class Task4 {
    public static int getDoubleFactorial(int n) {
        int factorial=n;
        for (int i=1; i<n-1; ++i){
            i++;
            factorial*=(n-i);
        }
        return factorial;
    }
}
