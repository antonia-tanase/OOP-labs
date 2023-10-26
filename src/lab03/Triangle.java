package lab03;

class Triangle extends Form {
    private float height, base;
    
    public Triangle() {
        height = 0.0f;
        base = 0.0f;
    }
    
    public Triangle(String str, float h, float b) {
        super(str);
        height = h;
        base = b;
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString();
    } 
    
    @Override
    public float getArea() {
        return height * base / 2.0f;
    }
    // Criteriile pt equals sunt
    //  * ambele obiecte sa fie Triangle
    //  * ambele obiecte au aceeasi culoare
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Triangle)) {
            return false;
        }
        Triangle otherTriangle = (Triangle) obj;
        
        return otherTriangle.getColor() == this.getColor();
    }
    public void printTriangleDimensions() {
        System.out.println("Height: " + height + " Base: " + base);
    }
    
    @Override
    public void printDimensions() {
        this.printTriangleDimensions();
    }
}