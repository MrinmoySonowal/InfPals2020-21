package Session2;

import java.util.Arrays;

public class MatrixCalc {
    //TODO: Implement Addition function
    //I love InfPALS and you should too!
    //TODO: Implement Multiplication function

    /*public Matrix matrixMultiplication(Matrix mat1, Matrix mat2) {

        if (mat1.getCols() != mat2.getRows()) {
            throw new ArithmeticException("To multiply matrices, the number of columns of mat1 must match with the number of rows in mat2");
        }

        int[][] mat = new int[mat1.getRows()][mat2.getCols()];

        for (int i = 0; i < mat1.getRows(); i++) {
            for (int j = 0; j < mat2.getCols(); j++) {
                mat[i][j] = 0;
                for (int multIndex = 0; multIndex < mat2.getRows(); multIndex++) {
                    mat[i][j] += mat1.getMatrix()[i][multIndex] * mat2.getMatrix()[multIndex][j];
                }
            }
        }

        return new Matrix(mat);
    }*/


    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in );
//        System.out.println ("Enter dimensions (rows x cols) of first matrix" );
//        Matrix m = new Matrix(sc.nextInt (),sc.nextInt ());
//        System.out.println (m);
        Matrix m1 = new Matrix(new int[][]{new int[]{1,2,3}, new int[]{2,1,3}, new int[]{1,1,1}});
        System.out.println (m1 );
        Matrix m2 = new Matrix(new int[][]{new int[]{1,2,3}, new int[]{2,1,3}, new int[]{1,1,1}});

        //MatrixCalc m = new MatrixCalc();

        //System.out.println(m.matrixMultiplication(m1,m2));
    }

}
