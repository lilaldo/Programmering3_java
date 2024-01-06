package Övningsuppgifter;
import java.util.Scanner;

public class ovning_41 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Skriv in varans pris, ink moms: ");

        int fullpris = scan.nextInt();
        double rabatt = fullpris * 0.10;

        if (fullpris >= 100)
            fullpris -= rabatt;

        System.out.println("Priset för ditt godis är " + fullpris);
        System.out.println("Rabatten är " + rabatt);
    }
}
