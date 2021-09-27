package Java;

import java.security.MessageDigest;
import java.util.Scanner;


public class JavaMD5 {
    public static void main(String[] args) throws Exception {
//        doesn't work in compiler...
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(word.getBytes());
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
