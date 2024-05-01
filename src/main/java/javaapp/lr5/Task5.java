package javaapp.lr5;

public class Task5 {
    private int Number;

    public int getNumber() {
        return Number;
    }

    public Task5(int number) {
        if(number<=100){
            Number = number;
        } else{
            Number=100;
        }
    }

    public void setNumber() {
        Number=0;
    }

    public void setNumber(int number) {
        if(number<=100){
            Number = number;
        } else{
            Number=100;
        }
    }
}
