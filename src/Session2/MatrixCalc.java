package Session2;

import java.util.Arrays;

/**
 * Class to perform operations like addition, multiplication etc.
 */
public class MatrixCalc {
    //I love InfPALS and you should too!

    /**
     * Method to multiple two matrices
     * @param mat1 - Matrix m1 - An instance of class Matrix of n1 x m1
     * @param mat2 - Matrix m2 - An instance of class Matrix of n2 x m2
     * @return - The product of the two matrices if m1 is equal n2
     */
    public static Matrix matrixMultiplication (Matrix mat1, Matrix mat2) {

        if (mat1.getCols() != mat2.getRows()) {
            throw new ArithmeticException("To multiply matrices, the number of columns of mat1 must match with the number of rows in mat2");
        }

        int[][] mat = new int[mat1.getRows()][mat2.getCols()]; // here we declare an integer matrix

        // Multiplying two matrices
        for (int i = 0; i < mat1.getRows(); i++) {
            for (int j = 0; j < mat2.getCols(); j++) { // Iterating over n1 x m2 since mat is of the same dimension
                mat[i][j] = 0;
                for (int multIndex = 0; multIndex < mat2.getRows(); multIndex++) {
                    // As n2 has to be equal to m1 ( row length of first matrix is same as column legth of the second)
                    // Iterating over mat.getRows() (n2) would get us the value of mat[i][j]
                    mat[i][j] += mat1.getElement( i, multIndex ) * mat2.getElement( multIndex, j );
                }
            }
        }
        return new Matrix(mat);
    }

    /**
     * Method to add two matrices
     * @param m1 - Matrix m1 - An instance of class Matrix of n1 x m1
     * @param m2 - Matrix m2 - An instance of class Matrix of n2 x m2
     * @return - The sum of matrix m1 and m2, if the dimensions of the matrix are same
     */
    private static Matrix matrixAdd (Matrix m1, Matrix m2) {
        if( m1.getCols()!= m2.getCols() || m1.getRows()!= m2.getRows() ){
            throw new ArithmeticException("To add matrices, the number of columns should be equal for both matrices as well as the number of rows");
        }
        Matrix addMat = new Matrix ( m1.getRows (), m1.getCols () );

        for(int i=0; i<m1.getRows ();i++){
            for(int j=0; j<m1.getCols ();j++){
                addMat.setElement ( i, j, (m1.getElement ( i,j )+ m2.getElement ( i,j )) );
            }
        }
        return addMat;
    }


    public static void main (String[] args) {
        Matrix m1 = new Matrix(new int[][]{new int[]{1,2,3},
                                           new int[]{2,1,3},
                                           new int[]{1,1,1}} );

        Matrix m2 = new Matrix(new int[][]{new int[]{1,2,3},
                                           new int[]{2,1,3},
                                           new int[]{1,1,1}} );

        System.out.println ( matrixMultiplication(m1,m2) );
        System.out.println ( matrixAdd(m1, m2) );
    }
}
