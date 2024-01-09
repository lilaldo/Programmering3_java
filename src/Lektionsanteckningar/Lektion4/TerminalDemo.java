package Lektionsanteckningar.Lektion4;

import java.io.*;
class TerminalDemo {
    public static void main(String[] arg) throws IOException {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("Vad heter du? ");
        System.out.flush();
        String txt = input.readLine();
        System.out.println("Hej " + txt);
    }
}
