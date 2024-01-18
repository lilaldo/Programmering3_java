package Övningsuppgifter;

import java.awt.*;
import java.util.Scanner;

public class _TEST_PlingPling {
    public static void main(String[] args) throws InterruptedException {
        var scan = new Scanner(System.in);
        System.out.println("Ange antal beep: ");
        int antal = scan.nextInt();

        for (int i = 0; i < antal; i++) {
            Toolkit.getDefaultToolkit().beep();
            Thread.sleep(1000); // 1000 millisekunder (1 sekund)

        }
    }
}
