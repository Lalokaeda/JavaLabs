package javaapp.lr7.task2;

public class SuperClassOne {
    private String text;
    private int textLength;

    public int getTextLength() {
        return this.textLength = text.length();
    }

    public SuperClassOne(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setText() {
        this.text = "text";
    }
    
}
