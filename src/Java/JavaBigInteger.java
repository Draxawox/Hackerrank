package Java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.next();
        String two = sc.next();
        BigInteger num1 = new BigInteger(one);
        BigInteger num2 = new BigInteger(two);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}
