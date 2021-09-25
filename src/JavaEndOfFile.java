import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        String line;
        while (sc.hasNext()) {
            line = sc.nextLine();
            System.out.println(counter + " " + line);
            counter++;
        }
    }
}
