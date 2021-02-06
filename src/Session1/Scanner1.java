package Session1;

import java.util.Scanner;

class Scanner1 {
    public static final int A = 10;

    public static final int a (){
        System.out.println ("Hey in final" );
        return A;
    }

}
class Per extends Scanner1{
    public static void main (String[] args) {
        System.out.println (a() );
    }
}
