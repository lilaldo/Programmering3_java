package Övningsuppgifter;

/**
 * Klassen Cirkel representerar en cirkel och tillhandahåller metoder för att
 * beräkna omkrets och area baserat på radien.
 */
public class Cirkel {
    // Privata fält för att lagra radien, omkretsen och arean.
    public double radie;
    public double omkrets;
    public double area;

    /**
     * Constructor skapar ett Cirkel-objekt med den angivna radien.
     *
     * @param radie Radien av cirkeln.
     */
    public Cirkel(double radie) {
        this.radie = radie;
    }

    /**
     * Hämtar radien av cirkeln.
     *
     * @return Radien av cirkeln.
     */
    public double getRadie() {
        return radie;
    }

    /**
     * Hämtar omkretsen av cirkeln. Om omkretsen inte tidigare har beräknats,
     * kommer metoden att beräkna den först och sedan returnera värdet.
     *
     * @return Omkretsen av cirkeln.
     */
    public double getOmkrets() {
        if (omkrets == 0) {
            omkrets = 2 * Math.PI * radie;
        }
        return omkrets;
    }

    /**
     * Hämtar arean av cirkeln. Om arean inte tidigare har beräknats, kommer
     * metoden att beräkna den först och sedan returnera värdet.
     *
     * @return Arean av cirkeln.
     */
    public double getArea() {
        if (area == 0) {
            area = Math.PI * radie * radie;
        }
        return area;
    }

    /**
     * Sätter en ny radie för cirkeln.
     *
     * @param radie Den nya radien att sätta.
     */
    public void setRadie(double radie) {
        this.radie = radie;
        // Återställ omkretsen och arean eftersom de inte längre är giltiga.
        omkrets = 0;
        area = 0;
    }
}
