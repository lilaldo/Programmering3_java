package Övningsuppgifter;

public class StringMetoder {
    static int antal(String s, char c){
        int n = 0;
        for (int i = 0; i<s.length(); i++)
            if (s.charAt(i) == c)
                n++;
        return n;
    }
    static int sökFörstaBland(String s, String sökta, int start){
        for (int i = start; i<s.length(); i++)
            if (sökta.indexOf(s.charAt(i)) >= 0)
                return 1;
        return -1;
    }

    static int sökFörstaIckeBland(String s, String sökta, int start) {
        for (int i = start; i < s.length(); i++)
            if (sökta.indexOf(s.charAt(i)) == -1)
                return i;
        return -1;
    }
}
