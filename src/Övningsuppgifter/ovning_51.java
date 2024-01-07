package Övningsuppgifter;
import java.util.Scanner;

public class ovning_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange ett heltal n: ");
        int n = scanner.nextInt();

        int summa = 0;
        int k = 1;

        while (k <= n) {
            summa += k * k;
            k++;
        }

        System.out.println("Summan av kvadraterna är: " + summa);
    }
}
