package lr4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;
        int [][] array = new int[height][width];
        Random rnd = new Random();
         System.out.println("Mассив: ");
         for(int i=0; i<array.length; i++){
            System.out.println();
            for(int j=0; j<array[i].length; j++){
                array[i][j]=rnd.nextInt(50);
                System.out.print(array[i][j]+" ");
            }
        }
        height=rnd.nextInt(height);
        width=rnd.nextInt(width);
        int[][] newArray = dropRowNColumn(array, height, width);
        System.out.println("\nНовый массив без "+ (height+1)+" строки и "+(width+1)+" столбца: ");
         for(int i=0; i<newArray.length; i++){
            System.out.println();
            for(int j=0; j<newArray[i].length; j++){
                System.out.print(newArray[i][j]+" ");
            }
        }
    }

    public static int[][] dropRowNColumn(int[][] array, int indexRow, int indexColumn) {
        int[][] newArray = new int[array.length-1][array[0].length-1];
        for(int i=0; i<newArray.length; i++){
            for(int j=0; j<newArray[i].length; j++){
                    newArray[i][j]=array[i+(i<indexRow? 0:1)][j+(j<indexColumn? 0:1)];
            }
        }
        return newArray;
    }
}
