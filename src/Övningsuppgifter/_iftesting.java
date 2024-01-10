package Övningsuppgifter;

import java.util.Scanner;

public class _iftesting {
    public static void main(String[] args) {
        // Scanner
        var scanner = new Scanner(System.in);
        // Deklarerat relevant namn.
        String namn = "André";

        // Text som skrivs ut när i terminalen när man startar programmet.
        System.out.println("Skriv in rätt namn så skickar jag en hälsning! ");

        // Scannar in det hamn man skriver in och lagrar i inskrivetNamn.
        String inskrivetNamn = scanner.next();
        // om namn.equals (is/==) -->
        if (namn.equals(inskrivetNamn))
            // Rätt =
            System.out.println("Rätt! Nu borde du nog gå och lägga dig! ");
        else
            // Fel =
            System.out.println("Fel namn");
    }
}
