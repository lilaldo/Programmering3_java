package Övningsuppgifter;
import java.util.Scanner;

// Sista whitespace
public class ovning_58 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Skriv en valfri text: ");
        String s = scan.nextLine();
        int i;
        int lastwhitespace = -1; // Variabel för att spara positionen för det senaste vita tecknet

        for (i = 0; i < s.length(); i = i + 1) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '\t') {
                lastwhitespace = i; // Spara positionen för det senaste vita tecknet
            }
        }

        if (lastwhitespace != -1) {
            System.out.println("Sista vita tecken finns på plats nr " + lastwhitespace);
        } else {
            System.out.println("Inga vita tecken");
        }
    }
}

