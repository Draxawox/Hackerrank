package Java;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        } else {
            a = a.toLowerCase();
            b = b.toLowerCase();
            char[] a1 = a.toCharArray();
            char[] b1 = b.toCharArray();
            java.util.Arrays.sort(a1);
            java.util.Arrays.sort(b1);
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != b1[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
