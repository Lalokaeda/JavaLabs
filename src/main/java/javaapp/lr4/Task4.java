package javaapp.lr4;

public class Task4 {
    public static void main(String[] args) {
        int[][] rectangle = new int[10][10];
        for (int i=0; i<rectangle.length; i++)
            for(int j=0; j<rectangle[i].length; j++){
                rectangle[i][j]=2;
            }
            int i = rectangle.length-1;
            while (i >= 0) {
                int j = 0;
                while (j <= i) {
                    System.out.print(rectangle[i][j]);
                    j++;
                }
                System.out.println("");
                i--;
            }
    }
}
