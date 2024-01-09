package Övningsuppgifter;
import java.util.*;


// for-loop
public class ovning_57 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);  // scannar in inmatat tal
        System.out.println("n? ");          // Text som skrivs ut i terminalen.
        int n = scan.nextInt();             // Bestämmer att det är en int som ska scannas.
        int k = 1;                          // Räknare.
        for (int i=0; i<n ; i++){           // för int (som är 0) ; medans i (är lika med i); plussar på i;
            System.out.println(k);
            k++;
        }
    }
}