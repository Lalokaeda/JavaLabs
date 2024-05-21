package javaapp.lr7.task3;

public class SubClassSecond extends SubSuperClass {

    public String text;
    public SubClassSecond(int num, char symbol, String text) {
        super(num, symbol);
        this.text=text;
    }

    public void setNum(int num, char symbol, String text) {
        super.setNum(num, symbol);
        this.text=text;
    }

    @Override
    public String toString() {
        return "SubClassSecond [num=" + num + "; symbol="+symbol+"; text=" + text + "]";
    }

}
