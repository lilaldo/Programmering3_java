package Övningsuppgifter;
import java.util.Scanner;

public class ovning_42 {
    public static void main(String[] args) {
        int gymyear = 5000;
        int gymbiljett = 120;
        var scan = new Scanner(System.in);
        System.out.print("Hur många gånger planerar du att besöka gymmet i år? ");
        int besök = scan.nextInt() * gymbiljett;
        if (besök > gymyear)
            System.out.println("Det blir" + gymbiljett + " kronor. Det blir billigare att köpa årskort");
        else
            System.out.println("Det blir " + besök + "kronor. Handlar du för " + (gymyear - besök) + "kr till så blir det billigare med årskort");
    }
}
