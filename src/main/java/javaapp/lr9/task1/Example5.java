package javaapp.lr9.task1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int count = 0;
    public static int fact(int n) {
        count++;
        System.out.println(count+" элемент последовательности: "+n);
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        } else {
            return fact(n-2)+fact(n-1);
        }
        
    }

}
