package Övningsuppgifter;
import java.util.Scanner;

public class ovning_54 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        while (true) { // blir falsee när man skriver in 0.
            System.out.println("Från vilken höjd vill du släppa bollen (cm)? ");
            int drop = scan.nextInt();
            int bounce = 0;

            if (drop <= 0) {
                break;
            }

            while (drop > 0) {
                drop = (int)(drop * 0.7);
                bounce = bounce + 1;
            }

            System.out.println("Bollen studsade totalt " + bounce + " gånger");
        }
    }
}
