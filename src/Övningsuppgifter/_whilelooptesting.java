package Övningsuppgifter;

import java.util.Scanner;

public class _whilelooptesting {
    public static void main(String[] args) {
        // scanner
        var scanner = new Scanner(System.in);
        // utskrifts-text
        System.out.println("Skriv in ett önskat heltal så räknar jag! ");

        // scanner som tar in det inmatade heltalet.
        int val = scanner.nextInt();
        // deklarerar x till 0
        int x = 0;

        // medans x är mindre eller lika med inmatat heltal ->
        while (x <= val) {
            // -> skriv ut
            System.out.println("Här kommer " + val);
            // räkna x med 1 för varje gång för att undvika oändlig loop.
            x++;
        }
    }
}
