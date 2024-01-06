package Övningsuppgifter;

public class ovning_28 {
    public static void main(String[] args) {
        String a = "Erik Andersson 860314-2714";
        a = a.trim();
        int i = a.lastIndexOf(' ' + 1);
        int j = a.indexOf('-');
        String b1 = a.substring(17,19);
        String b2 = a.substring(19,21);
        System.out.println(b2 + "/" + b1);
    }
}
