import java.util.Scanner;

public class oppgaveO3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Skriv inn et heltall større enn 0: ");
        int n = in.nextInt();

        while (n <= 0) {
            System.out.println("Tallet er for lavt. Skriv inn et tall større enn 0");
            n = in.nextInt();
        }

        long fakultet = 1;
        for (int i = 1; i <= n; i++) {
            fakultet *= i;

        }

        System.out.println();
        System.out.println("fakultetet av verdien du skrev inn var: " + fakultet);


        in.close();
    }
}