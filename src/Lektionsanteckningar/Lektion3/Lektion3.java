package Lektionsanteckningar.Lektion3;


// Skapa program som kollar om inmatat tal är jämnt eller udda.

import java.util.*;

public class Lektion3 {

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Läs in ett tal? ");
        int n = scan.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " är jämnt");
        else
            System.out.println(n + " är udda");

        }
    }




// felhantering
/**
public class Lektion3 {
    public static void main(String[] args) {
        try {                             // Försöker med...
            int a = 10 / 0;
        //catch (ArithmeticException e)   // Annan error-hantering.
        } catch (Exception e) {           // Annars kör...
            System.out.println(e.getMessage());

        }
    }
}
*/