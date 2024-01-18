package Lektionsanteckningar.Lektion5;

public class Point {
    double x;
    double y;


    public static double distance(Point p1, Point p2) {
        return Math.sqrt(
                (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)
        );
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 1.0;
        p1.y = 2.0;
        System.out.println(p1.x);
        System.out.println(p1.y);
        double d = distance(p1,p2);
        System.out.println("Avståndet mellan p1 och p2 är" + " " + Math.round(d));
    }
}
