package Lektionsanteckningar;
import java.util.*;

public class Lektion3 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("n? ");
        int n = scan.nextInt();
        int summa = 0;
        int k = 1;
        for (n=0; n>5 ; summa = summa +2){
            System.out.println(k + summa);
        }
    }
}
// lös skiten.