import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("bruttolønn: ");
        double brutto = in.nextInt();

        System.out.println();

        double trinn1 = 1.017;
        double trinn2 = 1.04;
        double trinn3 = 1.137;
        double trinn4 = 1.167;
        double trinn5 = 1.177;

        if (brutto >= 217401 && brutto < 306051) {
            double skatt1 = ((brutto * trinn1) - brutto);
            System.out.println(skatt1);
        } if (brutto >= 306051 && brutto < 697151) {
                double skatt2 = ((brutto * trinn2) - brutto);
                System.out.println(skatt2);
        } if (brutto >= 697151 && brutto < 942401) {
                double skatt3 = ((brutto * trinn3) - brutto);
                System.out.println(skatt3);
        } if (brutto >= 942401 && brutto < 1410751) {
                double skatt4 = ((brutto * trinn4) - brutto);
                System.out.println(skatt4);
        } if (brutto >= 1410751) {
                double skatt5 = ((brutto * trinn5) - brutto);
                System.out.println(skatt5);
        } else if (brutto < 217401) {
            System.out.println("Beløpet er for lavt. Ingen trinnskatt skal betales.");
        }

        }
    }