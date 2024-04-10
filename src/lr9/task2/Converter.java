package lr9.task2;

public class Converter {
    private static StringBuilder modulo = new StringBuilder();
    public static int ConvertTentoTwo(int num) {
         modulo.append(num%2);
        if (num!=0){
            return (ConvertTentoTwo(num/2));
        } else{
            return Integer.parseInt(modulo.reverse().toString());
        }
    }

}
