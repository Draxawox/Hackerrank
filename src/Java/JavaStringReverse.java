package Java;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String word = sc.next();
        sc.close();
        String rev = new StringBuilder(word).reverse().toString();
        if (word.equals(rev)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        /* Enter your code here. Print output to STDOUT. */

    }
}
