package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.replaceAll("[!,?._'@]"," ");
        scan.close();
        Scanner sc = new Scanner(s);
        int count = 0;
        ArrayList<String> tokens = new ArrayList<>();
        while(sc.hasNext()){
            tokens.add(sc.next());
            count++;
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(tokens.get(i));
        }
    }
}
