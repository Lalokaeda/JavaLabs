package javaapp.lr4;

public class Task1 {
    public static void main(String[] args) {
        int figure=11;
        int z;
        for (int i=1; i<=figure; i++){
            System.out.print("Номер строки: "+ i + " ");
            z=0;
            for(int j=-12; j<figure; j++){
                System.out.print("+");
                z++;
            }
            System.out.println(" Количество символов в строке: "+ z);
        }
    }
}
