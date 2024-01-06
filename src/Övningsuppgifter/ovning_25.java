package Övningsuppgifter;

import java.util.*;
public class ovning_25 {
    public static void main(String[] args) {
        // Scanner (input) scan (går att byta) = new args
        Scanner scan = new Scanner(System.in);
        // print istället för println för att det ska vara på samma rad.
        System.out.print("Vad heter du? ");
        String namn = scan.nextLine();

        System.out.print("Och i efternamn? ");
        String efternamn = scan.nextLine();
        // Hade det stått scan.next så tar koden enbart nästkommande ord.

        String hälsning = "Välkommen " + namn + " " + efternamn;
        // println för att resultatet ska hamna på raden under.
        System.out.println(hälsning);
        // sout [enter] System.out.print()

    }
}

