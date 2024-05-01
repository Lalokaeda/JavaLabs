package javaapp.lr2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите число:");
        String num = in.nextLine();
        in.close();
        try{
            Integer.parseInt(num);
            if (num.length() < 4)
                System.out.println("Число меньше тысячи");
            else
            {
                num = reverse(num);
                System.out.println("Количество тысяч: " + num.charAt(3));
            }
        }
        catch (Exception e){
            System.out.println("Введеное значение не является числом!");
        }
        
    }
 
     private static String reverse(String str)
    {
        if (str == null || str.equals("")) {
            return str;
        }
        return str.charAt(str.length() - 1) +
                reverse(str.substring(0, str.length() - 1));
    }
}
