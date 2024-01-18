package Övningsuppgifter;

import java.awt.*;

public class MinaMetoder {
    static void plinga(int n){
        for (int i=1; i<=n; i++) {
            Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {}
        }
    }
}
