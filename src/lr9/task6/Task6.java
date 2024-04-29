package lr9.task6;

import java.util.HashMap;

public class Task6 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(0, "Zero");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");
        hashMap.put(6, "Six");
        hashMap.put(7, "Seven");
        hashMap.put(8, "Eight");
        hashMap.put(9, "Nine");
        hashMap.put(10, "Ten");

        StringBuilder zeroKeyStrings = new StringBuilder();
        for (Integer key : hashMap.keySet()) {
            if (key > 5) {
                System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
            } else if (key == 0) {
                zeroKeyStrings.append(hashMap.get(key)).append(", ");
            }
        }

        if (zeroKeyStrings.length() > 0) {
            System.out.println("Строки с ключом 0: " + zeroKeyStrings.substring(0, zeroKeyStrings.length() - 2));
        }

        int multiplicationResult = 1;
        for (Integer key : hashMap.keySet()) {
            String value = hashMap.get(key);
            if (value != null && value.length() > 5) {
                multiplicationResult *= key;
            }
        }
        System.out.println("Результат умножения: " + multiplicationResult);
    }
}
