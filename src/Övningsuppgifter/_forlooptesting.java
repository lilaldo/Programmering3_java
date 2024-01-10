package Övningsuppgifter;

import java.util.Scanner;

public class _forlooptesting {
    public static void main(String[] args) {
        // Skapa scanner med new scanner system in.
        var scan = new Scanner(System.in);
        // meddelande för vad som ska skrivas ut
        System.out.println("Skriv in valfritt nummer så räknar jag! ");

        int x = 0;

        // scannar in det heltal som skrivs in
        int val = scan.nextInt();

        // for (initialisering; villkor; inkrement)
        // for (x=0) ; medans x är mindre eller lika med "val" ; plussa på 1 på x;
        for (x = 0; x<=val; x++) { // Går även deklarera int x = 0 här också istället för däruppe ^
            System.out.println("Här kommer " + x);
        }
    }
}
