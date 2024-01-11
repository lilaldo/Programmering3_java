package Övningsuppgifter;
// Kalender.java

import java.util.Scanner;

public class ovning_84 {
    public static void main(String[] args) {
    var scan = new Scanner(System.in);

    System.out.println("Skriv in önskat årtal 1: ");
    int year1 = scan.nextInt();

    System.out.println("Skriv in önskat årtal 2: ");
    int year2 = scan.nextInt();

    Kalender kalender = new Kalender();

        System.out.println(year1 + " är ett skottår: " + kalender.ärSkottår(year1));
        System.out.println(year2 + " är ett skottår: " + kalender.ärSkottår(year2));
    }
}
