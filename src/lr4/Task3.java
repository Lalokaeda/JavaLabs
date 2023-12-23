package lr4;

public class Task3 {
    public static void main(String[] args) {
        int[][] rectangle = new int[10][15];
        for (int i=0; i<rectangle.length; i++)
            for(int j=0; j<rectangle[i].length; j++){
                rectangle[i][j]=2;
            }
        for (int[] i : rectangle) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
