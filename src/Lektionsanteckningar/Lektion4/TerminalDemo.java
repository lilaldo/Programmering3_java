package Lektionsanteckningar.Lektion4;

// STRÖMMAR.

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TerminalDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Mata in ett heltal och tryck på Enter/Retur ");
        System.out.println("Avsluta med CTRL+Z eller CTRL+D (Win) CMD+D (Mac) ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0; // lagrar summan av alla inlästa tal
        int highest = Integer.MIN_VALUE;
        while (true){
            String txt = input.readLine();
            if (txt == null || txt.isEmpty())
                break;
            int num = Integer.parseInt(txt);
            sum += num;
            if (num > highest) {
                highest = num;
            }
        }
        System.out.println("Högsta inmatade värdet är: " + highest);

    }
}
