package Övningsuppgifter;
import java.util.*;

public class ovning_36 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Skriv in varans pris, ink moms: ");
        int fullpris = scan.nextInt();
        double prisUtanMoms = fullpris * 0.75;
        double moms = fullpris * 0.25;
        System.out.println("Priset för din vara utan moms är " + prisUtanMoms);
        System.out.println("Momsen är " + moms);
    }
}
