package lr5;

public class CharwCode {
    
    private char Char;
    
    public void setChar(char Char) {
        this.Char=Char;
    }
    public int getCode() {
        return (int)Char;
    }
    public void printCharNCode(){
        System.out.println(Char+" "+(int)Char);
    }
}