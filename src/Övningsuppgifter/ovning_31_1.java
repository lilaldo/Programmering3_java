package Övningsuppgifter;
import javax.swing.JOptionPane;

public class ovning_31_1 {
    public static void main(String[] args) {
        String fullpris = JOptionPane.showInputDialog("Skriv in varans pris, ink moms: ");
        int pris = Integer.parseInt(fullpris);
        double prisUtanMoms = pris * 0.75;
        double moms = pris * 0.25;
        JOptionPane.showMessageDialog(null,"Priset för din vara utan moms ör " + prisUtanMoms + "\nMomsen är " + moms);
    }
}
