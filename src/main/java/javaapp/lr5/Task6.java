package javaapp.lr5;

public class Task6 {
    private int Min;
    private int Max;

    public Task6(int num1, int num2) {
        Max=Math.max(Math.max(Min, Max), Math.max(num1, num2));
        Min=Math.min(Math.min(Min, Max), Math.min(num1, num2));
    }
    public Task6(int num) {
        Max=Math.max(Math.max(Min, Max), num);
        Min=Math.min(Math.min(Min, Max), num);
    }


    public void setValues(int num1, int num2) {
        Max=Math.max(Math.max(Min, Max), Math.max(num1, num2));
        Min=Math.min(Math.min(Min, Max), Math.min(num1, num2));
    }
    public void setValues(int num) {
        Max=Math.max(Math.max(Min, Max), num);
        Min=Math.min(Math.min(Min, Max), num);
    }
    public void printNums() {
        System.out.println("Максимальное: " + Max+", минимальное: "+Min);
    }
}
