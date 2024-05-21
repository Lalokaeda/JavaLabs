package javaapp.lr6;

public class Task9 {
    public static char[] revers(char[] symbols) {
        char[] newArray = new char[symbols.length];
        int j=symbols.length-1;
        for(int i=0; i<newArray.length;i++){
                newArray[i]=symbols[j];
                j--;
        }
        return newArray;
    }
}
