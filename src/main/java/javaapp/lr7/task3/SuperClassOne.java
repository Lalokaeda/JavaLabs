package javaapp.lr7.task3;

public class SuperClassOne {
    public int num;

    public SuperClassOne(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "SuperClassOne [num=" + num + "]";
    }


}
