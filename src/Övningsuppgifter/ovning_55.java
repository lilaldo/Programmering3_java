package Övningsuppgifter;
import javax.swing.JOptionPane;

public class ovning_55 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Från vilken höjd vill du släppa bollen (cm)? ");

        // Konvertera strängen till ett heltal
        int drop = Integer.parseInt(input); // Omvandla string till int!!!!!!!!!!!!!!!!!!!!!!!!!!
        int bounce = 0;                 // Antal studsar.

        while (drop > 0) {              // Medan drop (cm studs) är större än 0
            drop = (int)(drop * 0.7);   // Minskar höjden med 30%
            bounce = bounce + 1;        // Och antal studs ökar med 1
        }
        // Joption.showmessage för att skriva ut!!!!!!
        JOptionPane.showMessageDialog(null, "Bollen studsade totalt " + bounce + " gånger");
    }
}
