package Session2;

import java.util.Arrays;


public class MatrixCalc {
    //TODO: Implement Addition function
    //I love InfPALS and you should too!


    public static Matrix matrixMultiplication (Matrix mat1, Matrix mat2) {

        if (mat1.getCols() != mat2.getRows()) {
            throw new ArithmeticException("To multiply matrices, the number of columns of mat1 must match with the number of rows in mat2");
        }

        int[][] mat = new int[mat1.getRows()][mat2.getCols()];

        for (int i = 0; i < mat1.getRows(); i++) {
            for (int j = 0; j < mat2.getCols(); j++) {
                mat[i][j] = 0;
                for (int multIndex = 0; multIndex < mat2.getRows(); multIndex++) {
                    mat[i][j] += mat1.getElement( i, multIndex ) * mat2.getElement( multIndex, j );
                }
            }
        }
        return new Matrix(mat);
    }

    private static Matrix matrixAdd (Matrix m1, Matrix m2) {
        if(m1.getCols ()!= m2.getCols () || m1.getRows ()!= m2.getRows() ){
            throw new ArithmeticException("To multiply matrices, the number of columns should be equal for both matrices as well as the number of rows");
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

        Matrix m1 = new Matrix(new int[][]{new int[]{1,2,3}, new int[]{2,1,3}, new int[]{1,1,1}});
        Matrix m2 = new Matrix(new int[][]{new int[]{1,2,3}, new int[]{2,1,3}, new int[]{1,1,1}});
        System.out.println ( matrixMultiplication(m1,m2) );
        System.out.println ( matrixAdd(m1, m2) );
    }



}
