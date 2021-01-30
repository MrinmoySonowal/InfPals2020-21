package Session2;
// Implement a matrix multiplication function
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to implement matrix multiplication
 */
public class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix (int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for ( int j=0; j < cols; j++ ) {
              this.matrix[i][j] = 0;
            }
        }
    }

    public Matrix (int[][] matrix){
        this.matrix = matrix;
    }

    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

    @Override
    public String toString () {
        StringBuilder str = new StringBuilder ( );
        for(int[] row: matrix){
            str.append( padLeft ( Arrays.toString ( row ), "Matrix{matrix=".length ( ) ) ).append ( "\n" );
        }
        return "Matrix{" +
                "matrix=\n" + str +
                ", rows=" + rows +
                ", cols=" + cols +
                '}';
    }

    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in );
//        System.out.println ("Enter dimensions (rows x cols) of first matrix" );
//        Matrix m = new Matrix(sc.nextInt (),sc.nextInt ());
//        System.out.println (m);
        Matrix m = new Matrix(new int[][]{new int[]{1,2,3}, new int[]{2,1,3}, new int[]{1,1,1}});
        System.out.println (m );


    }


}
