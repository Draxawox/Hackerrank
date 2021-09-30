package Java;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        BitSet set1 = new BitSet(first);
        BitSet set2 = new BitSet(second);

        while (sc.hasNext()) {
            String command = sc.next();
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (command.equals("AND")) {
                if (num1 == 1) {
                    set1.and(set2);
                } else {
                    set2.and(set1);
                }
            } else if (command.equals("SET")) {
                if (num1 == 1) {
                    set1.set(num2);
                } else {
                    set2.set(num2);
                }
            } else if (command.equals("OR")) {
                if (num1 == 1) {
                    set1.or(set2);
                } else {
                    set2.or(set1);
                }
            } else if (command.equals("FLIP")) {
                if (num1 == 1) {
                    set1.flip(num2);
                } else {
                    set2.flip(num2);
                }
            } else if (command.equals("XOR")) {
                if (num1 == 1) {
                    set1.xor(set2);
                } else {
                    set2.xor(set1);
                }
            }
            System.out.println(set1.cardinality() + " " + set2.cardinality());
        }
        sc.close();
    }
}
