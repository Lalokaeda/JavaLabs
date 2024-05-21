package javaapp.lr4;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        int [][] array = new int[10][10];
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println("Числа для заполнения (чтоб было видно в каком порядке заполняется массив): ");
        for(int i=1; i<=array.length*(array[0].length); i++){
            nums.add(i);
            System.out.print(nums.get(i-1)+ " ");
        }
        fillSnake(array, nums);
        System.out.println();
        System.out.println("Заполненный массив:");
        for (int i = 0; i < array.length; i++){
            System.out.println();
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
        }
    }

    public static void fillSnake(int[][] array, ArrayList<Integer> nums) {
        int countR = 0;
        int countC = array[0].length-1;
        int columnsCount = array[0].length-1;
        int rowsCount = array.length-1;
        int rowVector = 0;
        int colVector = 1;
        int column=0;
        int row=0;
        
        for (Integer integer : nums) {
            array[row][column] = ((int)integer);
            column+=colVector;
            row+=rowVector;
            if(column>countC){
                countR++;
                colVector=0;
                row=rowsCount;
                column=countC;
                rowVector=-1;
            }

            if(row<countR){
                countC--;
                row=countR;
                colVector=1;
                column=0;
                rowVector=0;
            }
        }
    }
}

