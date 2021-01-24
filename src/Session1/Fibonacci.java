package Session1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to demonstrate an optimized version to get the nth Fibonacci number
 */
public class Fibonacci {
    /**
     * ArrayList containing the all the n fibonacci numbers
     */
    private static ArrayList<Integer> fib_nums = new ArrayList<> ();
    public static void main (String[] args) {
        Scanner s = new Scanner ( System.in );
        // Initializing the first two fibonacci numbers, i.e., 1 and 0
        fib_nums.add(0);
        fib_nums.add(1);
        // Taking an input, n, from the user to print fibonacci(n) or the nth fibonacci number
        System.out.println (fibonacci(s.nextInt ()) );
    }

    /**
     * Method to calculate the nth fibonacci number using memoization
     * The function stores all the n fibonacci numbers in the arrayList fib_nums
     * @param n - Indicates which fibonacci number to find
     * @return - nth fibonacci number
     */
    private static long fibonacci (Integer n) {
    if (n == 0 || n == 1){ return n;}
    if (n<fib_nums.size ()){return fib_nums.get ( n );}
    fib_nums.add ( n, (int) (fibonacci ( n-1 )+fibonacci ( n-2 )) );
    return fib_nums.get ( n );
    }
}
