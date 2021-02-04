package Session2;
// Implement a matrix multiplication function
import java.util.Arrays;

/**
 * Class to implement matrix multiplication
 */
public class Matrix {
    /**Matrix of dimensions rows*cols */
    private int[][] matrix;
    /**Number of rows of the matrix*/
    private int rows;
    /**Number of columns of the matrix*/
    private int cols;

    /**
     * Contructor of a matrix given another int[][] matrix
     * @param matrix - copy the matrix from the main function
     */
    public Matrix (int[][] matrix){
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

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

    /**
     * Getter method for cols
     * @return The number of columns of the matrix
     */
    public int getCols() {
        return cols;
    }

    /**
     * Getter method for rows
     * @return The number of rows of the matrix
     */
    public int getRows() {
        return rows;
    }

    /**
     * Getter method for the matrix
     * @return Returns the matrix of type int[][] and size (rows*cols)
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * for given index (i,j) set element matrix[i][j] to the value (val)
     * @param i - row index of the matrix
     * @param j - column index of the matrix
     * @param val - value to be set for matrix[i][j] cell
     */
    public void setElement(int i, int j, int val){
        this.matrix[i][j] = val;
    }

    public int getElement(int i, int j){return matrix[i][j];}


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
