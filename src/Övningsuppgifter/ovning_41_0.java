package Övningsuppgifter;
import javax.swing.JOptionPane;

public class ovning_41_0 {
    public static void main(String[] args) {
        // showinputdialog = Gör så att användaren får skriva in en siffra som string.
        String samtalstid = JOptionPane.showInputDialog(null, "Hur många minuter pågick samtalet? ");

        // Interger.parseInt = Gör om String till int
        int antalminter = Integer.parseInt(samtalstid);
        //
        int dagsamtal = JOptionPane.showConfirmDialog(null, "Äger samtalet rum under dagtid?",
                "tid på dagen?", JOptionPane.YES_NO_OPTION); // TITEL MÅSTE SKRIVAS.

        Double minutpris;
        if (dagsamtal == JOptionPane.YES_OPTION)
            minutpris = 2.50;
        else
            minutpris = 0.55;

        double totalkostnad = (antalminter * minutpris) + 0.60;

        JOptionPane.showMessageDialog(null, "Totala kostaden för samtalet är " + totalkostnad);
    }
}
