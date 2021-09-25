import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        StringBuilder s = new StringBuilder();
        while (scan.hasNextLine()) {
            s.append(scan.nextLine());
        }
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
//2147483647
//        235345345345.234534
//        fsdfsdf   sdf
