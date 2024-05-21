package javaapp.lr7.task5;

public class SubClassSecond extends SuperClassOne {

    protected char symbol;

    public SubClassSecond(String text, char symbol) {
        super(text);
        this.symbol=symbol;
    }

    @Override
    public void GetInfo() {
        System.out.println("SubClassSecond [text="+text+"; symbol="+symbol+"]");
    }

}
