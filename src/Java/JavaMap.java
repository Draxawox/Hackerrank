package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> pbook = new HashMap<>();
        for (int i = 0; i < num; i++) {
            String key = sc.nextLine();
            int value = sc.nextInt();
            pbook.put(key, value);
            sc.nextLine();
        }
        while (sc.hasNext()) {
            String name = sc.nextLine();
            if (pbook.containsKey(name)) {
                System.out.println(name + "=" + pbook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
