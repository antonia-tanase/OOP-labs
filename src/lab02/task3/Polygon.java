package lab02.task3;

public class Polygon {
    private Point[] polygon;
    // constructors.
    public Polygon(int n) {
        polygon = new Point[n];
    }

    // folosesc primul contructor in acesta
    public Polygon(float[] points) {

        this(points.length/2);
        int j = 0;
        for (int i = 0; i < points.length; i = i + 2) {
            polygon[j] = new Point(0,0);
            polygon[j].changeCoords(points[i], points[i+1]);
            j++;
        }
    }

    // Add showPolygon.
    void showPolygon() {
        for (int i = 0; i < polygon.length; i++) {
            polygon[i].showPoint();
        }
    }
}
