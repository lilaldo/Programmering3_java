package Lektionsanteckningar.Lektion5;


// default:
// int - 0
// double - 0.0
// string - null
public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }

        // Utskrift av hela elementet.
        System.out.println("Element: ");
        for (int el  : array)
            System.out.println(el);
    }
}
