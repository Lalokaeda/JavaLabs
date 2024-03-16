package lr7.task5;

public class SubClassFirst extends SuperClassOne {

    protected int num;

    public SubClassFirst(String text, int num) {
        super(text);
        this.num=num;
        
    }

    @Override
    public void GetInfo() {
        System.out.println("SubClassFirst [text="+text+"; num="+num+"]");
    }

}
