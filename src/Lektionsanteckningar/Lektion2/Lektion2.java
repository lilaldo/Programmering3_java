package Lektionsanteckningar.Lektion2;
import java.util.Scanner;

// import java.util.Arrays;
/**
public class Lektion2 {
    public static void main(String[] args) {
        double d1 = 1.9;
        int i1 = (int) d1;
        System.out.println(i1);

    }
}

/**
 *         System.out.println();
 *         System.out.printf("");
 *         System.out.println("Lektion2.main");
 *         System.out.println("args = " + Arrays.toString(args));
 *         System.out.println("i1 = " + i1);
 */

/**
public class Lektion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange längden på katet A:");
        double katetA = scanner.nextDouble();

        System.out.println("Ange längden på katet B:");
        double katetB = scanner.nextDouble();

        // Använd Pythagoras sats för att beräkna hypotenusans längd
        double hypotenusan = Math.sqrt(Math.pow(katetA, 2) + Math.pow(katetB, 2));

        System.out.println("Hypotenusans längd är: " + hypotenusan);

        scanner.close();
    }
}
*/

public class Lektion2 {
    public static void main(String[] args) {

        double a = 3;
        double b = 4;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        // double c = math.sqrt(math.pow(a, upphöjt till 2) + math.pow(b, upphöjt till 2));

        System.out.println("Hypotenusans längd är " + c);
    }
}


// Tenary-operatorer = uttryck(18>20) ? Om det är sant(if) : Om det är falskt(else)