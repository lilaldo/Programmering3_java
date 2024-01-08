package Övningsuppgifter;
import java.util.Scanner;               // importera scanner

public class ovning_53 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in); // scanna in.

        System.out.println("Från vilken höjd vill du släppa bollen (cm)? "); //skriv ut text i terminalen.
        int drop = scan.nextInt();      // låter användaren skriva in önskat tal.
        int bounce = 0;                 // antal studsar.

        while (drop > 0){               // medans drop (cm studs) är 0
            drop = (int)(drop * 0.7);   // minskar höjden med 30%
            bounce = bounce + 1;        // och antal studs ökar med 1
        }
        System.out.println("Bollen studsade totalt " + bounce + "gånger");
    }
}
