package javaapp.lr3;


public class Task7 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int charsCount=10;
            char[] letters=new char[charsCount];
            int j=0;
            for(int i=0; i<letters.length;i++){
                letters[i]=alphabet.charAt(j);
                j+=2;
            }
            for (char c : letters) {
                System.out.print(c+ " ");
            }
            System.out.println("\n");
            for(int i=letters.length-1; i>=0;i--){
                System.out.print(letters[i]+ " ");
            }
    }
}
