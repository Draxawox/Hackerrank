package Java;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            set.add(sc.nextLine());
            System.out.println(set.size());
        }
    }

}
