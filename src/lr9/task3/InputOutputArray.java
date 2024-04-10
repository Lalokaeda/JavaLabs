package lr9.task3;

import java.util.Scanner;

public class InputOutputArray {
    private int[] array;

    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    Scanner in = new Scanner(System.in);
    public int[] Input(int n) {
        array[n]=in.nextInt();
        if(array.length>n){
            return Input(n+1);
        } else{
            in.close();
            return array;
        }
    }

    public int[] Output(int n) {
        System.out.println(array[n]+" ");
        if(array.length>n){
            return Output(n+1);
        } else{
            return array;
        }
    }

}
