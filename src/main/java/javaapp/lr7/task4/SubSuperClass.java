package javaapp.lr7.task4;

public class SubSuperClass extends SuperClassOne {
    public String text;

    public SubSuperClass(SubSuperClass subSuperClass) {
        super(subSuperClass.symbol);
        this.text = text;
    }

    public SubSuperClass(char symbol, String text) {
        super(symbol);
        this.text=text;
    }
}
