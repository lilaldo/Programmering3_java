package Övningsuppgifter;
// antalSiffror.java

import java.util.Scanner;

public class ovning_88 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Skriv in önskat nummer: ");
        int sum = scan.nextInt();

        System.out.println(antalSiffror.siffSum(sum));
    }
}
