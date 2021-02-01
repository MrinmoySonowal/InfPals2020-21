package Session2;

import java.util.Scanner;

/**
 * Program to initialize values of a matrix from right to left, similar to Arabic script
 */
public class ArabicStyleMatrix {
    public static void main (String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Enter the number of rows" );
        int rows = sc.nextInt();
        System.out.println ("Enter the number of cols" );
        int cols = sc.nextInt();
        Matrix mat = new Matrix(rows,cols);
        for(int i=0; i<rows;i++ ){
            for(int j=cols-1;j>=0;j--){
                System.out.println ("Enter next element" );
                mat.setElement ( i,j,sc.nextInt() );
            }
        }
        System.out.println (mat);
    }
}
