package lr7.task2;

public class SubClassOne extends SuperClassOne {

    public int num;
    public SubClassOne(String text, int num) {
        super(text);
        this.num = num;
    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }

    @Override
    public void setText() {
        super.setText();
    }

    public void setText(int num) {
        this.num=num;
    }

    public void setText(int num, String text) {
        super.setText(text);
        this.num=num;
    }

}
