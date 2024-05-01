package javaapp.lr7.task4;

public class SuperClassOne {
    public char symbol;

    public SuperClassOne(char symbol) {
        this.symbol = symbol;
    }

    public SuperClassOne(SuperClassOne superClassOne) {
        this.symbol = superClassOne.symbol;
    }
}
