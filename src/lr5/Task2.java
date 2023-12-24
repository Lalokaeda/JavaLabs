package lr5;

public class Task2 {    
    private char FirstChar; 
    private char SecondChar;

    public Task2(char firstChar, char secondChar) {
        FirstChar = firstChar;
        SecondChar = secondChar;
    }
    
    public void printSymbolsBetweenChars() {
        String symbols = "";
        for(int i = (int)FirstChar; i<=(int)SecondChar; i++){
            symbols+=(char)i;
        }
        System.out.println(symbols);
    }
}
