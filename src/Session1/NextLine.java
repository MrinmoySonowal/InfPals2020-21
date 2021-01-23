package Session1;

import java.util.Scanner;

public class NextLine {
    public static void main (String[] args) {
        Scanner scan = new Scanner ( System.in );
        String name = getName ( scan );
        System.out.println(name);
    }

    private static String getName (Scanner scan) {
        return scan.nextLine();
    }
}
