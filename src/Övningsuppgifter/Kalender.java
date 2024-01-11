package Övningsuppgifter;
// Övning 8.4
public class Kalender {
    public Boolean ärSkottår(int year){
        // Returnerar true om året är ett skottår (jämnt delbart med 4, men inte med 100 om det inte är jämnt delbart med 400).
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

}
