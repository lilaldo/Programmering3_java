package Övningsuppgifter;
// Övning 8.10

public class SystemInfo {
    static String operativsystem() {
        String operativsystem = System.getProperty("user.name");
        return operativsystem;
    }
    static String användare(){
        String användare = System.getProperty("os.name");
        return användare;
    }
}
