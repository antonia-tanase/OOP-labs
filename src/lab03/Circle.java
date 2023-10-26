package lab03;

class Circle extends Form {
    private float radius;

    public Circle() {
        radius = 0.0f;
    }
    
    public Circle(String str, float r) {
        super(str);
        radius = r;
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString();
    }

    @Override
    public float getArea() {
        return (float)Math.PI * radius * radius;
    }
    
    public void printCircleDimensions() {
        System.out.println("Radius: " + radius);
    }
    
    @Override
    public void printDimensions() {
        this.printCircleDimensions();
    }
}
