package javaapp.lr6;

public class Task1
{
    private char Char;
    private String Text;
    public void setValue(char Char){
        this.Char = Char;
    }
    public void setValue(String text){
        Text = text;
    }
    
    public void setValue(char[] chars){
        if(chars.length==1)
        Char = chars[0];
        if (chars.length>1){
        Text="";

        for(char chr : chars)
        Text+=chr;
        }
        
    }
}
