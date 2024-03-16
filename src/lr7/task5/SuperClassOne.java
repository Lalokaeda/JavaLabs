package lr7.task5;

public class SuperClassOne {
    
    protected String text;
    
    public SuperClassOne(String text) {
        this.text = text;
    }

    public void GetInfo() {
        System.out.println("SuperClassOne [text="+text+"]");
    }
}
