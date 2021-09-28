package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int c = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                list.add(sc.nextInt());
            }
            listOfLists.add(list);
        }
        int questions = sc.nextInt();
        for (int i = 0; i < questions; i++) {
            int list = sc.nextInt();
            int element = sc.nextInt();
            try {
                int num = listOfLists.get(list - 1).get(element - 1);
                System.out.println(num);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
