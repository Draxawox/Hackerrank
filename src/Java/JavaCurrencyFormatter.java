package Java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pay = sc.nextDouble();
        sc.close();
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en" , "in"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + us.format(pay));
        System.out.println("India: " + india.format(pay));
        System.out.println("China: " + china.format(pay));
        System.out.println("France: " + fr.format(pay));
    }
}
