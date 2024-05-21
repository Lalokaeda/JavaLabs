package javaapp.lr3;

public class Task8 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        int charsCount=10;
        char[] letters=new char[charsCount];
        int j=0;
        for(int i=0; i<letters.length;j++){
            while(alphabet.charAt(j)!=alphabet.charAt(0) && alphabet.charAt(j)!=alphabet.charAt(4)
                    && alphabet.charAt(j)!=alphabet.charAt(8) && alphabet.charAt(j)!=alphabet.charAt(14)
                    && alphabet.charAt(j)!=alphabet.charAt(20)){
                            letters[i]=alphabet.charAt(j);
                            i++;
                            break;
                    }
           
        }
        for (char c : letters) {
            System.out.print(c+ " ");
        }
    }
}
