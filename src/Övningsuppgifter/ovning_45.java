package Övningsuppgifter;
import java.util.Scanner;
public class ovning_45 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Skriv in paketets längd ");
        int längd = scan.nextInt();

        System.out.println("Skriv in paketets bredd: ");
        int bredd = scan.nextInt();

        System.out.println("Skriv in paketets höjd: ");
        int tjocklek = scan.nextInt();
        // längd - minst 14 och max 60
        // bredd - minst 9
        if (längd >= 14 && bredd <= 60 && bredd >= 9 && (längd + bredd) <= 90) {
            System.out.println("Paketet är godkänt!");
        } else
            System.out.println("Paketet kan inte skickas.");



    }
}
