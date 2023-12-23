package lr3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "Cp866");
        System.out.println("Введите название дня недели:");
        String dayName = in.nextLine().trim().toLowerCase();
        System.out.println("Номер дня недели: ");
        System.out.println("Оператор Switch: "+WithSwitch(dayName));
        System.out.println("Условные операторы: "+WithIfElse(dayName));
        in.close();
    }

    public static String WithSwitch(String dayName) {
        switch (dayName) {
            case "понедельник":
                return "1";
            case "вторник":
                return "2";
            case "среда":
                return "3";
            case "четверг":
                return "4";
            case "пятница":
                return "5";
            case "суббота":
                return "6";
            case "воскресенье":
                return "7";
            default:
                return "Введено некорректное значение";
        }
        
    }
    public static String WithIfElse(String dayName) {

        if (dayName.equals("понедельник")) {
            return "1";
        }
        else if (dayName.equals("вторник")){
            return "2";
        }
        else if (dayName.equals("среда")){
            return "3";
        }
        else if (dayName.equals("четверг")){
            return "4";
        }
        else if (dayName.equals("пятница")){
            return "5";
        }
        else if (dayName.equals("суббота")){
            return "6";
        }
        else if (dayName.equals("воскресенье")){
            return "7";
            }
        else {
            return "Введено некорректное значение";
        }
    }
}
