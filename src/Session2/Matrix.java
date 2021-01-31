package Session2;
// Implement a matrix multiplication function
import java.util.Arrays;

/**
 * Class to implement matrix multiplication
 */
public class Matrix {
    //**
    private int[][] matrix;
    private int rows;
    private int cols;

    /**
     * Constructor for the matrix
     * @param rows - Number of rows of the matrix
     * @param cols - Number of columns of matrix
     */
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

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * Contructor
     * @param matrix - copy the matrix from the main function
     */
    public Matrix (int[][] matrix){
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    /**
     * String formatter to pad the string to the left
     * @param s - String to pad to the left
     * @param n - Space to pad
     * @return Padded string
     */
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
}
