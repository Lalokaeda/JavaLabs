package javaapp.lr5;

public class Task4 {
    private char Symbol;
    private int Number;

    public Task4(double num) {
        Number = (int)num;
        int code = (int)((num % Number)*100);
        Symbol = (char)code;
        System.out.println(Number+ " "+ Symbol);
    }

    public Task4(int number, char symbol) {
        Symbol = symbol;
        Number = number;
    }
}
