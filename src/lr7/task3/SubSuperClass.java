package lr7.task3;

public class SubSuperClass extends SuperClassOne {

    public char symbol;
    
    public SubSuperClass(int num, char symbol) {
        super(num);
        this.symbol=symbol;
    }

    public void setNum(int num, char symbol) {
        super.setNum(num);
        this.symbol=symbol;
    }

    @Override
    public String toString() {
        return "SubSuperClass [num=" + num + "; symbol="+symbol+"]";
    }
    

}
