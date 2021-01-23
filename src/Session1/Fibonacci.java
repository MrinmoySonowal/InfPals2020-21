package Session1;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    private static ArrayList<Integer> fib_nums = new ArrayList<Integer> ();
    public static void main (String[] args) {
        Scanner s = new Scanner ( System.in );
        fib_nums.add(0);
        fib_nums.add(1);
        System.out.println (fibonacci(s.nextInt ()) );
    }

    private static long fibonacci (Integer n) {
    if (n == 0 || n == 1){ return n;}
    if (n<fib_nums.size ()){return fib_nums.get ( (int)n );}
    fib_nums.add ( (int)n, (int) (fibonacci ( n-1 )+fibonacci ( n-2 )) );
    return fib_nums.get ( n );
    }
}
