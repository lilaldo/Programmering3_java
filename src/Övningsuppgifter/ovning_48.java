package Övningsuppgifter;
import java.util.Scanner;
public class ovning_48 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Skriv in personnumer 1: ");
        String person1 = scan.next();

        System.out.println("Skriv in personnummer 2 ");
        String person2 = scan.next();

        String födelsedag1 = person1.substring(0, 6);
        String födelsedag2 = person2.substring(0, 6);

        if (person1.equals(person2))
            System.out.println("Dessa personer fyller år på samma dag.");
        else
            System.out.println("Nej, dessa personerna delar inte födelsedag");
    }
}
