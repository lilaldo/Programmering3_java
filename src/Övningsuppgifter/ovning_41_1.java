package Övningsuppgifter;
import java.util.Scanner;
public class ovning_41_1 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Skriv in personnumer 1: ");
        String person = scan.next();

        switch (person.charAt(10)){
            case '0': case '2': case '4': case '6': case '8':
                System.out.println("Personen är en kvinna. ");
                break;
            case '1': case '3': case '5': case '7': case '9':
                System.out.println("Personen är en man.");
        }
    }
}
