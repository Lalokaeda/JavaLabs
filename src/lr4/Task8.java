package lr4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Введите текст для шифрования: ");
        String encrypString = in.nextLine();
        System.out.println("Введите ключ: ");
        int shift = in.nextInt();
        encrypString= getEncryptString(encrypString, shift);
        System.out.println("Преобразованный текст: " + encrypString);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        Decrypt:
        while (true) {
           // String answ=in.nextLine();
             switch (in.next()) {
            case "y":
                System.out.println("Расшифрованный текст: " + getEncryptString(encrypString, -shift));
                break Decrypt;
             case "n":
                System.out.println("До свидания!");
                break Decrypt;
            default:
                System.out.println("Введите корректный ответ");
                break;
        }
        in.close();
    }
}
    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i<arrayChar.length; i++){
            arrayInt[i] = arrayChar[i]+ shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        return encryptString;
    }

    public static String getDecryptString(String decryptString, int shift) {
        char[] arrayChar = decryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i<arrayChar.length; i++){
            arrayInt[i] = arrayChar[i]- shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        decryptString = new String(arrayCharNew);
        return decryptString;
    }
}
