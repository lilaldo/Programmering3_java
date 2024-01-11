package Lektionsanteckningar.Lektion3;

public class testawhitespace {
    // Hitta whitespaces.

    public static void main(String[] args) {
        String test = "Text med ett antal blanka tecken"; // sträng för text.
        int counter = 0;                                  // Räknare.
        for (int i = 0; i < test.length(); i++) {         // för int i = 0; i är mindre än test.längd; i plussas på.
            if (Character.isWhitespace(test.charAt(i)))   // Om Char är vit ->
                counter++;                                // räkna på 1.
        }
        System.out.println(counter + " blanka tecken hittades");
    }
}


