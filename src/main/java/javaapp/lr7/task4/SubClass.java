package javaapp.lr7.task4;

public class SubClass extends SubSuperClass{
    public int num;
    
    public SubClass(SubClass subClass) {
        super(subClass.symbol, subClass.text);
        this.num = subClass.num;
    }

    public SubClass(char symbol, String text, int num) {
        super(symbol, text);
        this.num=num;
    }
}
