package Övningsuppgifter;

import java.util.Scanner;

/**
 * Huvudprogrammet för att använda Cirkel-klassen och beräkna omkrets och area av en cirkel.
 */
public class ovning_81 {
    public static void main(String[] args) {
        // Skapa en Scanner för att läsa inmatning från användaren.
        var scan = new Scanner(System.in);

        // Skriv ut en inmatningsförfrågan för användaren.
        System.out.println("Skriv in önskad radie: ");

        // Läs in det användaren skriver och spara det som radien.
        double radie = scan.nextDouble();

        // Skapa ett objekt av Cirkel-klassen med den angivna radien.
        Cirkel minCirkel = new Cirkel(radie);

        // Använd Cirkel-objektet för att beräkna och skriva ut omkrets och area.
        System.out.println("Radien av cirkeln är: " + minCirkel.getRadie());
        System.out.println("Omkretsen av cirkeln är: " + minCirkel.getOmkrets());
        System.out.println("Arean av cirkeln är: " + minCirkel.getArea());

        // Stäng Scanner-objektet för att undvika resursläckage.
        scan.close();
    }
}
