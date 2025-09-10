import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <=10; i++) {
            System.out.print("din poengsum: ");
            int poeng = in.nextInt();


            System.out.println();

            if (poeng > 100 || poeng < 0) {
                System.out.print("Ugyldig poengsum. Skriv inn ny poengsum: ");
                poeng = in.nextInt();
            }

            System.out.println();

            if (poeng <= 100 && poeng >= 90) {
                poeng = 1;
            } else if (poeng < 90 && poeng >= 80) {
                poeng = 2;
            } else if (poeng < 80 && poeng >= 60) {
                poeng = 3;
            } else if (poeng < 60 && poeng >= 50) {
                poeng = 4;
            } else if (poeng < 50 && poeng >= 40) {
                poeng = 5;
            } else if (poeng < 40) {
                poeng = 6;
            }

            switch (poeng) {
                case 1:
                    System.out.println("karakter A");
                    break;
                case 2:
                    System.out.println("karakter B");
                    break;
                case 3:
                    System.out.println("karakter C");
                    break;
                case 4:
                    System.out.println("karakter D");
                    break;
                case 5:
                    System.out.println("karakter E");
                    break;
                case 6:
                    System.out.println("karakter F");
                    break;
                default:
                    System.out.println("Ugyldig poengsum.");
            }
        }



        }

    }