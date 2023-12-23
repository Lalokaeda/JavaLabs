package lr4;

public class Task2 {
    public static void main(String[] args) {
        int n = 10;
        int i = n;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("+");
                j++;
            }
            System.out.println("");
            i--;
        }
    }
}
