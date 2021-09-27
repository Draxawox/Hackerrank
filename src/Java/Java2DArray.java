package Java;

import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int tab[][] = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < tab.length - 2; i++) {
            for (int j = 0; j < tab.length - 2; j++) {
                int sum = (tab[i][j] + tab[i][j + 1] + tab[i][j + 2])
                        + (tab[i + 1][j + 1])
                        + (tab[i + 2][j] + tab[i + 2][j + 1] + tab[i + 2][j + 2]);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
    
}
