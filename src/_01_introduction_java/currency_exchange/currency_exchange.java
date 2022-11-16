package _01_introduction_java.currency_exchange;

import java.util.Scanner;
public class currency_exchange {
    private static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {

        double exchangeRate = 0;
        int conversion;
        double dollar = 0;
        double vnd = 0;
        String Dollar = " ";
        int quarter = 0;


        System.out.print("Enter the exchange rate from dollars to VND: ");
        exchangeRate = key.nextDouble();

        System.out.print("Enter 0 to convert dollars to VND or "
                + " 1 for VND to dollars: ");
        conversion = key.nextInt();


        //while(conversion == 0 || conversion == 1) {
        if(conversion == 0) {
            System.out.print("Enter the dollar amount: ");
            dollar = key.nextDouble();
            vnd = dollar * exchangeRate;

            System.out.println("$" + dollar + " is " + vnd + " VND.");
            System.out.println();

        }else if(conversion == 1) {
            System.out.print("Enter the VND amount: ");
            vnd = key.nextDouble();
            dollar = vnd / exchangeRate;

            System.out.printf(vnd + " VND is%8.3f dollars.", dollar);
            System.out.println();

            Dollar = dollar + "";
            System.out.println(Dollar.substring(0, Dollar.indexOf(".")) + " dollars");
        }

    }

}
