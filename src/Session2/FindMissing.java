package Session2;

import java.util.*;

/**
 * Class to find the missing number from a given list
 */
public class FindMissing {
    /**
     * A function to find the missing numbers in range 1 to n for a list of lenght n
     * @param nums - A list of numbers of length n
     * @return - all the numbers missing from 1..n
     */
    public static List<Integer> findMissing(Integer[] nums){
        var mySet = new HashSet<> ( Arrays.asList ( nums ) );
        List<Integer> output = new ArrayList<> (  );
        for(int i=1;i<=nums.length;i++){
            if(!mySet.contains ( i )){
                output.add ( i );
            }
        }
        return output;
    }

    public static void main (String[] args) {
        System.out.println (findMissing ( new Integer[]{5,6,7,8} ) );
    }
}
