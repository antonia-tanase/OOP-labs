package lab02.task3;

import java.util.*;

class Point {
    private float x;
    private float y;

    // Add constructor.
    public Point(float xi, float yi) {
        x = xi;
        y = yi;
    }

    // Add changeCoords.
    void changeCoords(float a, float b) {
        this.x = a;
        this.y = b;
    }

    // Add showPoint.
    void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
    
}