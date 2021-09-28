package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            arr.add(sc.nextInt());
        }
        int numberOfManipulations = sc.nextInt();
        for (int i = 0; i < numberOfManipulations; i++) {
            String type = sc.next();
            if (type.equals("Insert")) {
                arr.add(sc.nextInt(), sc.nextInt());
            } else if (type.equals("Delete")) {
                arr.remove(sc.nextInt());
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
