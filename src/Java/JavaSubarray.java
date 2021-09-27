package Java;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] tab = new int[len];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            int sum = 0;
            for (int j = i; j < tab.length; j++) {
                sum += tab[j];
                if (sum < 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
