package lr7.task1;

public class SubClassOne extends SuperClassOne {

    public SubClassOne(String text) {
        super(text);
    }
    private String text1;

    public SubClassOne(String text, String text1) {
        super(text);
        this.text1 = text1;
    }

    @Override
    public String toString() {
        if (super.getText() == null){
            String subClassNameAndFieldValue = "sub" + "\n" 
        + "Class name: " + this.getClass().getSimpleName() + "\n"
        + "text1 = " + this.getText1();
        return subClassNameAndFieldValue;
        } else if (this.getText1() == null){
            String subClassNameAndFieldValue = "sub" + "\n" 
            + "Class name: " + this.getClass().getSimpleName() + "\n"
            + "text = " + super.getText();
            return subClassNameAndFieldValue;
        } else if (super.getText() != null && this.getText1() != null){
            String subClassNameAndFieldValue = "sub" + "\n" 
            + "Class name: " + this.getClass().getSimpleName() + "\n"
            + "text = " + super.getText() + "\n"
            + "text1 = " + this.getText1();
            return subClassNameAndFieldValue;
        }
        return "Not found";
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }
    
}
