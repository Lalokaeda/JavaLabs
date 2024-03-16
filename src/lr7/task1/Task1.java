package lr7.task1;

public class Task1 {

    public static void main(String[] args) {
        SuperClassOne superClass = new SuperClassOne("Текст из конструктора суперкласса");
        String className = superClass.toString();
        System.out.println(className);
        SubClassOne subClass = new SubClassOne("Текст из конструктора подкласса");
        String subClassName = subClass.toString();
        System.out.println(subClassName);
        SubClassOne subClass1 = new SubClassOne("Текст из конструктора подкласса", "с двумя параметрами");
        String subClassName1 = subClass1.toString();
        System.out.println(subClassName1);
    }
}
