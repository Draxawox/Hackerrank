import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = a;
            int one = 1;
            for (int j = 1; j <= n; j++) {
                temp += (one * b);
                System.out.print(temp + " ");
                one *= 2;
            }
            System.out.println();
        }
        in.close();
    }
}
