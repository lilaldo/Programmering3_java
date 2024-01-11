package Övningsuppgifter;
// Övning 8.8
public class antalSiffror {
    static int siffSum(int tal) {
        int sum = 0;
        while (tal > 0) {
            sum = sum + tal % 10;
            tal = tal / 10;
        }
        return sum;
    }
}
